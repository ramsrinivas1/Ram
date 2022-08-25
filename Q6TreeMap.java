import java.util.TreeMap;

public class Q6TreeMap {
	
	public static void main(String[] agrs) {
		
		// Create a tree map
		TreeMap <String,String> tree_map1 = new TreeMap <String,String> ();
		
		// Put elements to the map
		tree_map1.put("R1","Sai");
		tree_map1.put("R2","Hari");
		tree_map1.put("R3","Ram");
		tree_map1.put("R4","Sam");
		
		System.out.println("Original Tree Map contents: "+tree_map1);
		tree_map1.clear();
		System.out.println("The New map: "+ tree_map1);
	}
}
