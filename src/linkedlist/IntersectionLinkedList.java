package linkedlist;

class ListNode {
    int value; // Node value
    ListNode next; // Reference to the next node in the list

    ListNode(int x) {
        value = x;
        next = null;
    }
}

public class IntersectionLinkedList {
	
	private int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
	
	 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        int lenA = getLength(headA);
	        int lenB = getLength(headB);
	        
	        // Align both pointers
	        while (lenA > lenB) {
	            headA = headA.next;
	            lenA--;
	        }

	        while (lenB > lenA) {
	            headB = headB.next;
	            lenB--;
	        }

	        // Traverse both lists together
	        while (headA != null && headB != null) {
	            if (headA == headB) {
	                return headA; // Intersection found
	            }
	            headA = headA.next;
	            headB = headB.next;
	        }

	        return null; // No intersection
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntersectionLinkedList intersection = new IntersectionLinkedList();
		 ListNode head1 = new ListNode(4);
		    ListNode l2 = new ListNode(1);
		    head1.next = l2;
		    ListNode l3 = new ListNode(8);
		    l2.next = l3;
		    ListNode l4 = new ListNode(4);
		    l3.next = l4;
		    ListNode l5 = new ListNode(5);
		    l4.next = l5;
		    l5.next = null;

		    // Create list2
		    //    5 -> 6 -> 1 -> null
		    // head2   b1   b2
		    ListNode head2 = new ListNode(5);
		    ListNode b1 = new ListNode(6);
		    head2.next = b1;
		    ListNode b2 = new ListNode(1);
		    b1.next = b2;
		    System.out.println(intersection.getIntersectionNode(head1, head2));

	}

}
