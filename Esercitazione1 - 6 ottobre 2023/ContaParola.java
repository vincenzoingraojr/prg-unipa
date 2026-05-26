public class ContaParola {
	public static void main(String args[]) {
		int count = 0;
		String word = "Ciao";
		
		for (int i = 0; i < args.length; i++) {
			if (args[i].equals(word)) {
				count++;
			}
		}
		
		System.out.println("Hai inserito " + count + " argomenti uguali alla parola '" + word + "'.");
	}
}