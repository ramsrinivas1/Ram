import java.util.HashMap;
import java.util.Set;

public class Q9SetView {
	
	public static void main(String[] agrs) {
		
		HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
		
		hash_map.put(1,"Hari");
		hash_map.put(2,"Sam");
		hash_map.put(3,"Sai");
		hash_map.put(4,"Ram");
		hash_map.put(5,"Raju");
		
		// create set view for the map
		Set set = hash_map.entrySet();
		
		// check set values
		System.out.println("Set values: " + set);
	}
}

		
		
