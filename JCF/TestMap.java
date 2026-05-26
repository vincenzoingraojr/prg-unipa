import java.util.Map;
import java.util.HashMap;

public class TestMap{
	public static void main(String args[]){
		Map<String, String> m = new HashMap<>();
		
		m.put("Joe", "C");
		m.put("Carl", "B+");
		m.put("Sarah", "A");
		
		System.out.println(m);
		
		m.remove("Jessica");
		System.out.println(m);
		
		m.put("Carl", "A");
		System.out.println(m);
	}
}
