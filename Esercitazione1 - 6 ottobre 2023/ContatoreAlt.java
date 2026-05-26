public class ContatoreAlt {
	public static void main(String args[]) {
		for (int i = args.length - 1; i >= 0; i--) {
			System.out.println(args[i]);
		}
		
		System.out.println("Altra parte del programma.");
		
		for (int i = 0; i < args.length; i++) {
			if ((i + 1) % 2 != 0) {
				System.out.println(args[i]);
			} 
		}
	}
}