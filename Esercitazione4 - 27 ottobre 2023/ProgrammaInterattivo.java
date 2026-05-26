package prg.es04;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ProgrammaInterattivo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String stringa = "";

        System.out.println("Digita qualcosa e batti enter, oppure scrivi \"fine\" per terminare il programma.");

        ArrayList<String> parole = new ArrayList<String>(); // utilizziamo l'ArrayList

        parole.addAll(Arrays.asList("alfa", "beta", "gamma", "delta", "epsilon", "kappa", "lambda", "sigma", "omega")); // In questo modo usiamo Arrays.asList per creare un array di stringhe. Tutto in una riga.

        while(!(stringa = scanner.next()).equals("fine")) {
            if (!parole.contains(stringa))
                System.out.println("Hai digitato " + stringa.toUpperCase() + "!");
        }

        System.out.println("Fine programma!");
    }
}
