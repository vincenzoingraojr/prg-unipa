package prg.es04;

import java.util.Scanner;

public class ProgrammaInterattivoOld {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String stringa = "";

        System.out.println("Digita qualcosa e batti enter, oppure scrivi \"fine\" per terminare il programma.");

        String[] parole = {"alfa", "beta", "gamma", "delta", "epsilon", "kappa", "lambda", "sigma", "omega"};
        
        int count;

        while(!(stringa = scanner.next()).equals("fine")) {
            count = 0;
            for (int i = 0; i < parole.length; i++) {
                if (stringa.equals(parole[i])) {
                    count++;
                }
            }

            if (count == 0) {
                System.out.println("Hai digitato " + stringa.toUpperCase() + "!");
            }
        }

        System.out.println("Fine programma!");
    }
}
