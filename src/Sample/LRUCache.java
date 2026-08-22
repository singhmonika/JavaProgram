package Sample;

import java.util.HashMap;

public class LRUCache {
	class DLLNode{
		DLLNode next;
		DLLNode prev;
		int key;
		int value;
		DLLNode(int key, int value){
			this.key = key;
			this.value = value;
		}
	}
	
	private DLLNode head;
	private DLLNode tail;
	private int size;
	private int capacity;
	
	private HashMap<Integer, DLLNode>map;
	
	public LRUCache(int capacity) {
		head = null;
		tail = null;
		size = 0;
		this.capacity = capacity;
		map = new HashMap<>();
		
		
	}   
    public int get(int key) {
    	//check key in the list
    	DLLNode node = findKey(key);
    	if(node == null) {
    		return -1;
    	}
    	
    	//if key found make most recently used
    	//i.e., send it at the end of the list 
    	nodeToEnd(node);
    	//return node
    	return node.value;
        
    }
    private void nodeToEnd(DLLNode node) {
    	// move the node to end
    	DLLNode next = node.next;
    	DLLNode prev = node.prev;
    	if(node.key == tail.key) {
    		return;
    	}
    	
    	if(next==null && prev == null) {
    		return;
    	}
    	
    	node.next = null;
    	node.prev = null;
    	
    	if(next == null) {
    		
    	}
    	else if(prev == null) {
    		next.prev = null;
    		head = next;
    	
    	}else {
    		prev.next = next;
    		next.prev = prev;
    	}
    	
    	//put at the end
    	tail.next = node;
    	node.prev = tail;
    	tail = node;
    	
    
    }
    
    private void deleteHead() {
    	if(head == null ) {
    		return;
    	}
    	head = head.next;
    	if(head == null) {
    		tail = null;
    	}else {
    		head.prev = null;
    	}
    }
    
    private DLLNode findKey(int key) {
    	return map.get(key);
    }
    
    private void addNodeEnd(int key, int value) {
    	if(head == null) {
    		head = new DLLNode(key, value);
    		tail = head;
    	}else {
    		DLLNode newNode = new DLLNode(key, value);
    		tail.next = newNode;
    		newNode.prev = tail;
    		tail = newNode;
    	}
    }
    
    public void put(int key, int value) {
        DLLNode node = findKey(key);
        if(node!=null) {
        	//update the value
        	node.value = value;
        	//move it to the end
        	nodeToEnd(node);
        }else {
        	//doesn't exit
        	//empty slot
        	if(size<capacity) {
        		addNodeEnd(key, value);
        		map.put(key, tail);
        		//new node at the end
        		size++;
        	}else {
        		//remove least recently used
        		//remove head
        		int removeKey = head.key;
        		deleteHead();
        		map.remove(removeKey);
        		addNodeEnd(key, value);
        		map.put(key, tail);
        	}
        }
    }
    
    public void print() {
    	if(head == null) {
    		System.out.println("Empty");
    		return;
    	}
    	DLLNode curr = head;
    	while(curr != null) {
    		System.out.print("[" + curr.key + "," + curr.value + "]");
    		if(curr.next!=null) {
    			System.out.print("<->");
    		}
    		curr = curr.next;
    	}
    	System.out.println();
    }
    
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRUCache lRUCache = new LRUCache(2);
		
		lRUCache.put(1,1);		
		lRUCache.print();
		lRUCache.put(2,2);		
		lRUCache.print();
		lRUCache.get(1);
		lRUCache.print();
		lRUCache.put(3,3);		
		lRUCache.print();
		System.out.println(lRUCache.get(2));

	}

}
