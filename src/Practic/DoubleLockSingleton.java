package Practic;

public class DoubleLockSingleton {
	private static volatile DoubleLockSingleton doubleLockSingleton= null; 
	private DoubleLockSingleton() {
	}
	public static DoubleLockSingleton instance() {
		if(doubleLockSingleton == null) {
			synchronized (DoubleLockSingleton.class) {
				if(doubleLockSingleton == null) {
					doubleLockSingleton = new DoubleLockSingleton();
				}
				
			}
		}
		return doubleLockSingleton;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLockSingleton d1 = DoubleLockSingleton.instance();
		DoubleLockSingleton d2 = DoubleLockSingleton.instance();
		DoubleLockSingleton d3 = DoubleLockSingleton.instance();
		DoubleLockSingleton d4 = DoubleLockSingleton.instance();
		DoubleLockSingleton d5 = DoubleLockSingleton.instance();
		
		System.out.println("hashcode of d1" + d1);
		System.out.println("hashcode of d2" + d2);
		System.out.println("hashcode of d2" + d3);
		System.out.println("hashcode of d2" + d4);
		System.out.println("hashcode of d2" + d5);

	}

}
