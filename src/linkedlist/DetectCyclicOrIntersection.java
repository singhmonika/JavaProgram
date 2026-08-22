package linkedlist;

class Node{
	int data ;
	Node next ;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}



public class DetectCyclicOrIntersection {
	
	public boolean hasCycle(Node head) {
		Node fast = head, slow = head;
		while(fast != null & fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				return true;
			}
		}
		return false;
	}
	
	public int getLength(Node head){
		int length = 0;
		while(head!= null) {
			length++;
			head = head.next;
		}
		return length;
	}
	
	public boolean hasIntersection(Node headA, Node headB) {
		int lenA = getLength(headA);
		int lenB = getLength(headB);
		
		while(lenA>lenB) {
		lenA--;
		headA = headA.next;
		}
		while(lenA<lenB) {
		lenB--;
		headB = headB.next;
		}
		while(headA!= null & headB!= null) {
			if(headA == headB) {
				return true;
			}
		headA = headA.next;
		headB = headB.next;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DetectCyclicOrIntersection det = new DetectCyclicOrIntersection();
		Node head = new Node(1);
		Node l1 = new Node(2);
	    head.next = l1;
	    Node l2 = new Node(3);
	    l1.next = l2;
	    Node l3 = new Node(4);
	    l2.next = l3;
	    Node l4 = new Node(5);
	    l3.next = l4;
	    l4.next = l2;
	    
	    Node head1 = new Node(1);
		Node m1 = new Node(2);
	    head1.next = m1;
	    Node m2 = new Node(3);
	    m1.next = m2;
	    Node m3 = new Node(4);
	    m2.next = m3;
	    Node m4 = new Node(5);
	    m3.next = m4;
	    m4.next = m2;
	    
	    Node head2 = new Node(7);
		Node n1 = new Node(6);
	    head2.next = n1;
	    //Node n2 = new Node(4);
	    n1.next = m3;
	    Node n3 = new Node(5);
	    m3.next = n3;
	    
	    Node head3 = new Node(7);
		Node o1 = new Node(6);
	    head3.next = o1;
	    Node o2 = new Node(8);
	    o1.next = o2;
	    Node o3 = new Node(9);
	    o2.next = o3;
	    
	    
	    
	    if(det.hasCycle(head)) {
	    	System.out.println("CYCLE");
	    }
	    if(det.hasIntersection(head1, head2)) {
	    	System.out.println("INTERSECTION");
	    }else {
	    	System.out.println("OK");
	    }
	    
	    
	    

	}

}
