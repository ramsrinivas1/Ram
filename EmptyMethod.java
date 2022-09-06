package Stack;

import java.util.Stack;

public class EmptyMethod {
	
	public static void main(String[] agrs) {
		
		//creating an instance of Stack class  
		Stack<Integer> stk= new Stack<>();  
		// checking stack is empty or not  
		boolean result = stk.empty();  
		System.out.println("Is the stack empty? " + result);  
		// pushing elements into stack  
		stk.push(12);  
		stk.push(11);  
		stk.push(90);  
		stk.push(20);  
		//prints elements of the stack  
		System.out.println("Elements in Stack: " + stk);  
		result = stk.empty();  
		System.out.println("Is the stack empty? " + result);  
		}  
	
	}
