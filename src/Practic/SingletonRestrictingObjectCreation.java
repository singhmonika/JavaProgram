package Practic;

public class SingletonRestrictingObjectCreation {
	private static volatile SingletonRestrictingObjectCreation singletonRestrictingObjectCreation = null;
	public static int count = 0;

	private SingletonRestrictingObjectCreation() {
		count++;
		
	}
	
	public static synchronized SingletonRestrictingObjectCreation instance() {
		if(count<3) {
			singletonRestrictingObjectCreation = new SingletonRestrictingObjectCreation();
		}
		return singletonRestrictingObjectCreation;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonRestrictingObjectCreation s1 = SingletonRestrictingObjectCreation.instance();
		SingletonRestrictingObjectCreation s2 = SingletonRestrictingObjectCreation.instance();
		SingletonRestrictingObjectCreation s3 = SingletonRestrictingObjectCreation.instance();
		SingletonRestrictingObjectCreation s4 = SingletonRestrictingObjectCreation.instance();

		System.out.println("hashcode of s1 : " + s1);
		System.out.println("hashcode of s1 : " + s2);
		System.out.println("hashcode of s1 : " + s3);
		System.out.println("hashcode of s1 : " + s4);
	}

}
