package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue {
	
	public static void main(String[] args) {  
	    Deque<String> deque=new ArrayDeque<String>();  
	    deque.offer("Ram");  
	    deque.offer("Sai");  
	    deque.add("Hari");  
	    deque.offerFirst("Raju");  
	    System.out.println("After offerFirst Traversal...");  
	    for(String s:deque){  
	        System.out.println(s);  
	    }  
	    //deque.poll();  
	    //deque.pollFirst();//it is same as poll()  
	    deque.pollLast();  
	    System.out.println("After pollLast() Traversal...");  
	    for(String s:deque){  
	        System.out.println(s);  
	    }  
	}  
	}  
