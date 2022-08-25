import java.util.*;  
	public class Q7 {  
	   public static void main(String args[]) {
	  HashMap < String, Integer > hash_map = new HashMap < String, Integer > ();
	  hash_map.put("Sai", 1);
	  hash_map.put("Ram", 2);
	  hash_map.put("Krishna", 3);
	  hash_map.put("Sam", 4);
	  hash_map.put("Teja", 5);
	  // print the map
	  System.out.println("The Original map: " + hash_map);
	  System.out.println("1. Is key 'Ram' exists?");
	  if (hash_map.containsKey("Ram")) {
	   //key exists
	   System.out.println("yes! - " + hash_map.get("Ram"));
	  } else {
	   //key does not exists
	   System.out.println("no!");
	  }

	  System.out.println("\n2. Is key 'Hari' exists?");
	  if (hash_map.containsKey("Hari")) {
	   System.out.println("yes! - " + hash_map.get("Hari"));
	  } else {
	   System.out.println("no!");
	  }
	   }
	}
	