package linkedlist;

class ListNode1 {
    int value; // Node value
    ListNode1 next; // Reference to the next node in the list

    ListNode1(int x) {
        value = x;
        next = null;
    }
}


public class DetectCycle {
	
	public ListNode1 cyclic(ListNode1 head) {
		ListNode1 slow = head,fast = head;
		while(fast!=null & fast.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
			
			if(slow==fast) {
				while(head!=slow) {
					head = head.next;
					slow = slow.next;
				}
				return slow;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		DetectCycle detectCycle = new DetectCycle();
		 ListNode1 head1 = new ListNode1(4);
		    ListNode1 l2 = new ListNode1(1);
		    head1.next = l2;
		    ListNode1 l3 = new ListNode1(8);
		    l2.next = l3;
		    ListNode1 l4 = new ListNode1(5);
		    l3.next = l4;
		    ListNode1 l5 = new ListNode1(6);
		    l4.next = l5;
		    
		    ListNode1 l6 = new ListNode1(3);
		    l5.next = l6;
		    ListNode1 l7 = new ListNode1(2);
		    l6.next = l7;
		    ListNode1 l8 = new ListNode1(7);
		    l7.next = l8;
		   // ListNode1 l9 = new ListNode1(8);
		    l8.next = l3;
		    System.out.println(detectCycle.cyclic(l8.next));

	}
		// TODO Auto-generated method stub

	}
