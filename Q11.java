import java.util.HashMap;
import java.util.Set;

public class Q11 {
	
	public static void main(String[] agrs) {
		
		HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
		
		hash_map.put(1,"Sai");
		hash_map.put(2,"Hari");
		hash_map.put(3,"Ram");
		hash_map.put(4,"Teja");
		hash_map.put(5,"Sam");
		
		 // get keyset value from map
		   Set keyset = hash_map.keySet();
		      
		  // check key set values
		   System.out.println("Key set values are: " + keyset);  
		 }
		}