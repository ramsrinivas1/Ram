import java.util.*;  
public class Q1 {  
  public static void main(String args[]) {  
  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
  hash_map.put(1, "Ram");
  hash_map.put(2, "Sai");
  hash_map.put(3, "Hari");
  hash_map.put(4, "Teja");
  hash_map.put(5, "Sam");
  for(Map.Entry x:hash_map.entrySet()){  
   System.out.println(x.getKey()+" "+x.getValue());  
  }  
 }  
}