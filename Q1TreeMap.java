import java.util.Map.Entry;
import java.util.TreeMap;

public class Q1TreeMap {
	
	public static void main(String[] agrs) {
		
		// Create a tree map
		TreeMap <Integer,String> tree_map = new TreeMap <Integer,String> ();
		
		// Put elements to the map
		tree_map.put(1,"Hari");
		tree_map.put(2,"Sai");
		tree_map.put(3,"Ram");
		tree_map.put(4,"Sam");
		tree_map.put(5,"Teja");
		
		  
		   for (Entry<Integer, String> entry : tree_map.entrySet())
		   {
		    System.out.println(entry.getKey() + "=>" + entry.getValue());
		   }
		 }  
		}