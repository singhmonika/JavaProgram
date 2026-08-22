package Java8Example;

public class OccurenceOfCharacter {
	
	public static long occurence(String str, char ch) {
		return str.chars()
				.filter(c->c==ch)
				.count();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ggrh";
		char ch = 'g';
		System.out.println(occurence(str, ch));

	}

}
