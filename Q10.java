import java.util.HashMap;

public class Q10 {
	
	public static void main(String[] agrs) {
		
		HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
		
		hash_map.put(1,"Hari");
		hash_map.put(2,"Teja");
		hash_map.put(3,"Ram");
		hash_map.put(4,"Raju");
		hash_map.put(5,"Sai");
		
		// get value of key 3
		String val = (String)hash_map.get(3);
		
		// check the value
		System.out.println("Value for key 3 is: " + val);
		
	}
}