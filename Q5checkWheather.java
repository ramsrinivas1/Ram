import java.util.HashMap;

public class Q5checkWheather {
	
	public static void main(String[] agrs) {
		HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
		
		hash_map.put(1,"Ram");
		hash_map.put(2,"Hari");
		hash_map.put(3,"Raju");
		hash_map.put(4,"Sai");
		hash_map.put(5,"Teja");
		
		// check if map is empty
		boolean result = hash_map.isEmpty ();
		
		// check the result
		System.out.println("Is hash_map epmty; " +result);
		
		// Removing all the elements from the linked map
		hash_map.clear();
		
		// check if map is empty
		result = hash_map.isEmpty();
		
		// check the result
		System.out.println("Is hash_map empty: " + result);
		
	}
}
