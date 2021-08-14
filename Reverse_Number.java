package demo;

class First_way_reverse{
	public void reverse(int num) {
		int rev_number=0;
		while(num!=0) {
			rev_number=rev_number*10 +num%10;
			
			num=num/10;
		}
		System.out.println(rev_number);
	}
}
class Secound_way_reverse{
	public void reverse(int num) {
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		System.out.println(rev);
	}
}

public class Reverse_Number {

	public static void main(String[] args) {
		Secound_way_reverse swr=new Secound_way_reverse();
		swr.reverse(123);
	}

}
