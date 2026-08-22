package linkedlist;

class Node2{
	int data;
	Node2 next;
	
	public Node2(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Swapkth {
	
	public Node2 swapNode(Node2 head, int k) {
		Node2 curr = head;
		for(int i = 1; i<k;i++) {
			curr = curr.next;
		}
		Node2 a = curr;
		Node2 b = head;
		while(curr!=null && curr.next!=null) {
			curr = curr.next;
			b = b.next;
		}
		
		System.out.println("-----------------"+a.data);
		System.out.println("----------------------"+b.data);
		
		int temp = a.data;
		a.data = b.data;
		b.data = temp;
		
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Swapkth swapkth = new Swapkth();
		 Node2 head1 = new Node2(4);
		    Node2 l2 = new Node2(1);
		    head1.next = l2;
		    Node2 l3 = new Node2(8);
		    l2.next = l3;
		    Node2 l4 = new Node2(9);
		    l3.next = l4;
		    
		    Node2 l5 = new Node2(9);
		    l4.next = l5;
			/*
			 * Node1 l4 = new Node1(5); l3.next = l4; Node1 l5 = new Node1(6); l4.next = l5;
			 * 
			 * Node1 l6 = new Node1(3); l5.next = l6; Node1 l7 = new Node1(2); l6.next = l7;
			 * Node1 l8 = new Node1(7); l7.next = l8;
			 */
		   // ListNode1 l9 = new ListNode1(8);
		    //l8.next = null;
		    swapkth.swapNode(head1, 2);
	}

}
