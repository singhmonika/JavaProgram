package overridingExample;

public class TempMain extends TempClass{
	
	public void color() {
		System.out.println("Yellow");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TempClass t = new TempMain();
		t.color();

	}

}
