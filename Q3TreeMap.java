import java.util.*;  
public class Q3TreeMap {  
   public static void main(String args[]){  
  
  // Create a tree map
   TreeMap<String,String> tree_map1=new TreeMap<String,String>();      
  
  // Put elements to the map 
  tree_map1.put("R1", "Red");
  tree_map1.put("R2", "Green");
  tree_map1.put("R3", "Black");
  tree_map1.put("R4", "White"); 
    
  System.out.println(tree_map1);
        if(tree_map1.containsKey("R1")){
            System.out.println("The Tree Map contains key R1");
        } else {
            System.out.println("The Tree Map does not contain key R1");
        }
        if(tree_map1.containsKey("R5")){
            System.out.println("The Tree Map contains key R5");
        } else {
            System.out.println("The TreeMap does not contain key R5");
        }
   }
}
