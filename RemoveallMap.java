import java.util.HashMap;

public class RemoveallMap {
	
	public static void main(String[] agrs) {
		HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
		
		hash_map.put(1,"Ram");
		hash_map.put(2,"Raju");
		hash_map.put(3,"Hari");
		hash_map.put(4,"Teja");
		hash_map.put(5,"Sam");
		
		// print the map
		
		System.out.println("The Original Linked map: " + hash_map);
		
		// Removing all the elements from the linkedmap
		
		hash_map.clear();
		System.out.println("The New map: " + hash_map);
	}
}
