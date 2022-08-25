import java.util.Comparator;
import java.util.TreeMap;

public class Q7TreeMap {
	
	public static void main(String[] agrs) {
		
		TreeMap <String,String> tree_map1 = new TreeMap <String,String> (new sort_key());
		
		// Put elements to the map
		tree_map1.put("R1","Sai");
		tree_map1.put("R2","Hari");
		tree_map1.put("R3","Ram");
		tree_map1.put("R4","Sam");
		
		System.out.println(tree_map1);
	}
}
class sort_key implements Comparator<String>{
	@Override
	public int compare (String str1, String str2) {
		return str1.compareTo(str2);
		
	}
}