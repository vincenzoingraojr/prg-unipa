public class Sommatore {
	public static void main(String args[]) {
		int somma = 0;
		
		for (int i = 0; i < args.length; i++) {
			somma += Integer.parseInt(args[i]);
		}
		
		System.out.println("La somma e' " + somma + ".");
		
		/* Se come argomento io inserisco una stringa al posto di 
		un intero, io ottengo un errore durante l'esecuzione.
		*/
	}
}