package linkedlist;

public class CreateLinkedList {
	
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data =  data;
			this.next = null;
		}
	}
	
	public Node head = null;
	public Node tail = null;
	
	public void insert(int data) {
		 Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			tail = newNode ; 
		}
	}
	
	public void display() {
		Node current = head;
		if(head == null) {
			System.out.println("Empty List");
		}else {
			while(current != null) {
				System.out.println("LinkedList : " + current.data);
				current = current.next;
			}
		}
	}

	public void displayreverse() {
		Node current = head;
		Node prev = null;
		Node next;
		
		if(head == null) {
			System.out.println("Empty List");
		}else {
			while(current != null) {				
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
								
			}
			head = prev;
			while(head != null) {
				System.out.println("Reverse : " + head.data);
				head = head.next;
			}
			
			
				
			
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateLinkedList create = new CreateLinkedList();
		create.insert(1);
		create.insert(6);
		create.insert(4);
		create.display();
		create.displayreverse();

	}

}
