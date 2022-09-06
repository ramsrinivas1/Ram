package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class pop {
	
	public static void main(String[] agrs) {
		    
		    Deque<Integer> dq = new ArrayDeque<Integer>();    
		    /* Inserting the elements. */    
		    dq.push(98);    
		    dq.push(76);    
		    dq.push(68);   
		    dq.push(34); 
		    dq.push(84); 
		      
		    /* Displaying the dequeue. */  
		  
		    System.out.println("Deque after insertion: ");  
		    for (Integer integer : dq)   
		    {    
		        System.out.println(integer);    
		    }    
		      
		    /* Deleting the element.  */  
		    dq.pop();   
		      
		    /* Displaying the complete dequeue. */  
		  
		    System.out.println("After deletion: " );    
		    for (Integer integer : dq)   
		    {    
		        System.out.println(integer);    
		    }
	}
}
