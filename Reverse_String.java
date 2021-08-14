package demo;

class First_Way_reverse_string{
	public void reverse(String word) {
		
		StringBuffer sb=new StringBuffer(word);
		StringBuffer rev=sb.reverse();
		System.out.println(rev);
	}
}

class Secound_way{
	public void reverse(String word) {
		String rev="";
		int len=word.length();
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+word.charAt(i);
		}
		System.out.println(rev);
	}
}
public class Reverse_String {

	public static void main(String[] args) {
		
		Secound_way sw=new Secound_way();
		sw.reverse("ABCD");

	}

}
