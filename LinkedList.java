package List;

import java.util.NoSuchElementException;

	
	 class Node{
		int data;
		Node link;
		public Node(int data) {
			this.data = data;
			this.link = null;
		}
		public Node() {
			// TODO Auto-generated constructor stub
		}
	 
	 Node head = null;
	 Node tail = null;
	 int size = 0;
	 public void addfirst(int data) {
		 Node temp = new Node(data);
		 if(head==null) {
			 head = temp;
			 tail = temp;
		 }else {
			 temp.link = head;
			 head = temp;
		 }
		 size++;
	 }
	 public void addfirst1(int data) {
		 Node temp = new Node(data);
		 if(head==null) {
			 head = tail = temp;
			 tail = temp;
		 }
	
		 
	 }
	 public void print() {
		 Node temp = head;
		 // 3 2 1 
		 while(temp!=null) {
			 System.out.println(temp.data);
			 temp = temp.link;
		 }
	 }
	 public void delfirst() {
		 if(size==0) {
			 throw new NoSuchElementException();
		 }
		 if(size==1) {
			 head=tail=null;
			 size--;
			 return;
		 }
		 head = head.link;
		 size--;
		 return;
	 }
	 Node temp = head;
	 while(temp.link=tail) {
		 temp = temp.link;
	 }
	 temp.link = null;
	 tail = temp;
	 size--;

public void addAt(int position, int data) {
	if(position>size) {
		throw new NoSuchElementException();
	}
	if(position==0) {
		addfirst(data);
		return;
		if(position==size) {
			addfirst(data);
			return;
		}
		Node new_node = new Node(data);
		Node current = head;
		for(int i=0; i<position-2; i++) { // 1 2 3 4 5 
			current = current.link;
		}
		Node next = current.link;
		current.link = new Node;
		new_node.link = next;
		
	}
	
		}
public class LinkedList {
public static void main(String[] agrs) {
	LinkedList head = new LinkedList();
    head.addAt(0,1);
	head.addAt(1,2);
	head.addAt(1,3);
	
	head.print();
}
}
	 }
	 }
	 
