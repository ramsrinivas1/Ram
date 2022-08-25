import java.util.TreeMap;

public class Q4TreeMap {
	
	public static void main(String[] agrs) {
		
		// Create a tree map
		TreeMap <String,String> tree_map1 = new TreeMap <String,String> ();
		
		// put elements to the map
		tree_map1.put("R1","Krishna");
		tree_map1.put("R2","Sai");
		tree_map1.put("R3","Ram");
		tree_map1.put("R4","Raju");
		tree_map1.put("R5","Teja");
		
		if(tree_map1.containsValue("Sai")) {
			System.out.println("The TreeMap contains value Sai");
		} else {
			System.out.println("The Map does not contain value Sai");
		}
		if(tree_map1.containsValue("Hari")) {
			System.out.println("The TreeMap contains value Hari");
		} else {
			System.out.println("The TreeMap does not contain value Hari");
		}
	}
}
