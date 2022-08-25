import java.util.HashMap;

public class Q6ShallowCopy {
	
	public static void main(String[] agrs) {
		
		HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
		
		hash_map.put(1,"Ram");
		hash_map.put(2,"Hari");
		hash_map.put(3,"Teja");
		hash_map.put(4,"Sai");
		hash_map.put(5,"Raju");
		
		// print the  map
		System.out.println("The Original map: " + hash_map);
		
		HashMap <Integer,String>new_hash_map= new HashMap <Integer,String> ();
		new_hash_map = (HashMap)hash_map.clone();
		System.out.println("Cloned map: " + new_hash_map);
		
		
	}
}