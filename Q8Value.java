import java.util.HashMap;

public class Q8Value {
	
	public static void main(String[] agrs) {
		
		HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
		
		hash_map.put(1,"Teja");
		hash_map.put(2,"Ram");
		hash_map.put(3,"Raju");
		hash_map.put(4,"Hari");
		hash_map.put(5,"Sai");
		
		 // print the map
		  System.out.println("The Original map: " + hash_map);
		  System.out.println("1. Is value \'Hari\' exists?");
		  if (hash_map.containsValue("Hari")) {
		   //value exists
		   System.out.println("Yes! ");
		  } else {
		   //value does not exists
		   System.out.println("no!");
		  }

		  System.out.println("\n2. Is value \'Sam\' exists?");
		  if (hash_map.containsValue("Sam")) {
		   System.out.println("yes! - " );
		  } else {
		   System.out.println("No!");
		  }
		 }
		}