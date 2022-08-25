import java.util.HashMap;

public class Q12 {
	
	public static void main(String[] agrs) {
		
		HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
		
		hash_map.put(1,"Hari");
		hash_map.put(2,"Sai");
		hash_map.put(3,"Ram");
		hash_map.put(4,"Teja");
		hash_map.put(5,"Sam");
		
		// checking collection view of the map
		System.out.println("Collection view is: "+ hash_map.values());
		
		
	}
}