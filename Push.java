package Stack;

import java.util.Stack;

public class Push {
	
	public static void main(String[] agrs) {
		
		// Creating an empty Stack
		Stack<Integer> Stack = new Stack <Integer>();
		
		// use push add elements into the Stack
		Stack.push(56);
		Stack.push(98);
		Stack.push(3);
		Stack.push(45);
		Stack.push(76);
		
		// displaying a Stack
		System.out.println("Intial Stack:" + Stack);
		
		// Displaying the final Stack
		System.out.println("final stack: + Stack");
	}
}
