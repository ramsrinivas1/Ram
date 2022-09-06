package Stack;

import java.util.Stack;

public class Peek {
	
	public static void main(String[] agrs) {
		
		Stack<String> stk = new Stack <> ();
		
		// pushing a elements in to stack 
		stk.push("Ram");
		stk.push("Sai");
		stk.push("Hari");
		stk.push("Raju");
		stk.push("Teja");
		
		System.out.println("Stack:" + stk);
		// Access elements from the top of the Stack
		String name = stk.peek();
		// print Stack
		
		System.out.println("Elements at top:" + name);
		
		
	}
}