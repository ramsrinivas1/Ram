import java.util.Set;
import java.util.TreeMap;

public class Q5TreeMap {
	
	public static void main(String[] agrs) {
		
		// Create a tree_map
		TreeMap <String,String> tree_map1=new TreeMap <String,String> ();
		
		// Put elements to the map
		tree_map1.put("R1","Sai");
		tree_map1.put("R2","Hari");
		tree_map1.put("R3","Ram");
		tree_map1.put("R4","Sam");
		
		Set<String> keys = tree_map1.keySet();
		for(String key : keys) {
			System.out.println(key);
		}
	}
}
