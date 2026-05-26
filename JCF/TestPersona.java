import java.util.List;
import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;


public class TestPersona {
	public static void main(String args[]){
		List<Persona> l = new ArrayList<>();
		
		l.add(new Persona("Marco", "Rossi"));
		l.add(new Persona("Luigi", "Rossi"));
		l.add(new Persona("Mario", "Neri"));
		l.add(new Persona("Giuseppe", "Bianchi"));
		
		System.out.println(l);
		
		/*System.out.println(l.contains(new Persona("Mario", "Rossi")));
		System.out.println(l.contains(new Persona("Lucio", "Rossi")));
		
		System.out.println(l.get(0).equals(null));*/
		
		// l.sort(null); // ordinamento naturale
		l.sort(new ConfrontaPersone());
		System.out.println(l);
		
		SortedSet<Persona> s = new TreeSet<>();
		System.out.println(s.add(new Persona("Marco", "Rossi")));
		System.out.println(s.add(new Persona("Luigi", "Rossi")));
		System.out.println(s.add(new Persona("Mario", "Neri")));
		System.out.println(s.add(new Persona("Giuseppe", "Bianchi")));
		System.out.println(s.add(new Persona("Marco", "Rosi")));
		System.out.println(s.add(new Persona("Luigi", "Rossi")));
		System.out.println(s.add(new Persona("Mario", "Neri")));
		System.out.println(s.add(new Persona("Giuseppe", "Bianchi")));
		
		System.out.println(s);
	}
}
		
