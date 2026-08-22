package Practic;

public class Parent implements Runnable{
	
	int x ;

	@Override
	public void run() {
		System.out.println(x++);
		
	}
	
	public static void main(String [] args) {
		Parent p = new Parent();
		Thread t1 = new Thread(p);
		t1.start();
		Thread t2 = new Thread(p);
		t2.start();
	}

}
