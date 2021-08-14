package demo;

class palindrom{
	public void check_string_palindrom(String word) {
		
		String rev="";
		String original=word;
		int len=word.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+word.charAt(i);
		}
		if(original.equals(rev)) {
			System.out.println("Its a palindrom");
		}
		else {
			System.out.println("Its not a palindrom");
		}
	}
}

public class Palindrome_String {
	public static void main(String[] args) {
		palindrom pa=new palindrom();
		pa.check_string_palindrom("mom");
	}
}
