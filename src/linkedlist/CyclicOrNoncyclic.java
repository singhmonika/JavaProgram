package linkedlist;

class Node1{
	int data;
	Node1 next;
	
	public Node1(int data) {
		this.data = data;
		this.next = null;
	}
}

public class CyclicOrNoncyclic {
	
	public boolean cyclic(Node1 head) {
		Node1 fast = head, slow = head;
		while(fast!=null & fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		
		if(fast == slow) {
			return true;
		}
		}
		return false;
	}

	public static void main(String[] args) {
		CyclicOrNoncyclic cyclicOrNoncyclic = new CyclicOrNoncyclic();
		 Node1 head1 = new Node1(4);
		    Node1 l2 = new Node1(1);
		    head1.next = l2;
		    Node1 l3 = new Node1(8);
		    l2.next = l3;
		    Node1 l4 = new Node1(5);
		    l3.next = l4;
		    Node1 l5 = new Node1(6);
		    l4.next = l5;
		    
		    Node1 l6 = new Node1(3);
		    l5.next = l6;
		    Node1 l7 = new Node1(2);
		    l6.next = l7;
		    Node1 l8 = new Node1(7);
		    l7.next = l8;
		   // ListNode1 l9 = new ListNode1(8);
		    l8.next = l3;
		    //cyclicOrNoncyclic.cyclic(head1);
		    System.out.println(cyclicOrNoncyclic.cyclic(head1));

	}

}
