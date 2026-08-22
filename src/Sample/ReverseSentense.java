package Sample;

public class ReverseSentense {
	 public String reverseWords(String s) {
		 int i = 0;
		 int len = s.length();
		 String sub = "";
		 String res = "";
		 while(i<len) {
		 while(i<len && s.charAt(i)==' ') {
			 i++;
		 }
		 if(i == len) {
			 break;
		 }
		 int j = i;
		 while(j<len && s.charAt(j)!=' ') {
			 j++;
		 }
		 sub = s.substring(i, j);
		 if(res.length()==0) {
			 res = sub;
		 }else {
			 res = sub + " " + res;
		 }
		 i=j;
		 }
		 
		 return res;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "  hello    world      !   ";
		ReverseSentense res = new ReverseSentense();
		System.out.println(res.reverseWords(str));
	}

}
