import java.util.HashMap;

public class Specified_Map {
	public static void main(String[] agrs) {
		// create two hash Map
		HashMap <Integer,String> hash_map1 = new HashMap <Integer,String> ();
		HashMap <Integer,String> hash_map2 = new HashMap <Integer,String> ();
		
		// populate hash maps
		hash_map1.put(1,"Ram");
		hash_map1.put(2,"Raju");
		hash_map1.put(3,"Teja");
		
		System.out.println("\nValues in first map: " + hash_map1);
				
		hash_map2.put(4,"Hari");
		hash_map2.put(5,"Tom");
		hash_map2.put(6,"Sam");
		
		System.out.println("\nValues in second map: " + hash_map2);
		
		hash_map2.putAll(hash_map1);
		System.out.println("\nValues in second map: " + hash_map2);
		
		
		
	}
}
