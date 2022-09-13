package Test2;

import java.util.HashMap;
import java.util.Scanner;

public class Q3 {

	
	public static void main(String[] agrs)
	{
		
		    Scanner in = new Scanner(System.in);
		    String str;
		 
		    System.out.println("Enter a string: ");
		    str= in.nextLine();
		   
		    String[] splitFn = str.split(" ");
		 
		    HashMap<String,Integer> Hmap = new HashMap<String,Integer>();
		 
		    for (int i=0; i < splitFn.length-1; i++)
		    {
		      if (Hmap.containsKey(splitFn[i])) 
		      {
		 int count = Hmap.get(splitFn[i]);
		 Hmap.put(splitFn[i], count+1);
		      }
		      else 
		      {
		        Hmap.put(splitFn[i], 1);
		      }
		    }
		   System.out.println(Hmap);
		
	}
}
