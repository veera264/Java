package demo;

class SumOFDigits{
	public void check_sum(int num) {
		int sum=0;
		while(num!=0) {
			int last=num%10;
			sum+=last;
			num/=10;
		}
		System.out.println(sum);
	}
}
public class Sumof_Digitsin_number {

	public static void main(String[] args) {
		SumOFDigits sod=new SumOFDigits();
		sod.check_sum(1234);

	}

}
