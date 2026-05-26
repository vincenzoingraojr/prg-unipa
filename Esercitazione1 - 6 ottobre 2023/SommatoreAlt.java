public class SommatoreAlt {
	public static void main(String args[]) {
		int somma = 0;
		
		for (int i = 0; i < args.length; i++) {
			try {
				somma += Integer.parseInt(args[i]);
			} catch (NumberFormatException e) {
				System.out.println("L'argomento in posizione " + (i + 1) + " non e' un intero.");
			}
		}
		
		System.out.println("La somma e' " + somma + ".");
		
		/* Se come argomento io inserisco una stringa al posto di 
		un intero, io ottengo un errore durante l'esecuzione.
		*/
	}
}