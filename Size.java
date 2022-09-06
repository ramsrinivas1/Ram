package Stack;

import java.util.Stack;

public class Size {
	
	public static void main(String[] agrs) {
		
		Stack stk = new Stack();  
		stk.push(789);  
		stk.push(956);  
		stk.push(832);  
		stk.push(312);  
		stk.push(508);  
		// Checks the Stack is empty or not  
		boolean rslt=stk.empty();  
		System.out.println("Is the stack empty or not? " +rslt);  
		// Find the size of the Stack  
		int x=stk.size();  
		System.out.println("The stack size is: "+x);  
		}  
		
	}
