import java.util.TreeMap;

public class Q2TreeMap {
	
	public static void main(String[] agrs) {
		
		TreeMap <Integer,String> R1=new TreeMap <Integer,String> ();

		TreeMap <Integer,String> R2=new TreeMap <Integer,String> ();
		
		R1.put(1,"Sai");
		R1.put(2,"Sai");
		R1.put(3,"Sai");
		R1.put(4,"Sai");
		R1.put(5,"Sai");
		R1.put(6,"Sai");
		R1.put(7,"Sai");
		
		R1.putAll(R2);
		System.out.println(R1);
		
		
		
	}
}