package Practic;

public class SubChild extends Parent{

	static int b;
	
	static void sum() {
		System.out.println(++b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubChild s = new SubChild();
		Parent p = new Parent();
		//p = (Parent)s;
		System.out.println(s.x);
		sum();
	}

}
