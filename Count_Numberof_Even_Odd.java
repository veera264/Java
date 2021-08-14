package demo;

class even_odd {
	public void count(int num) {
		int even=0;
		int odd=0;
		
		while(num!=0) {
			int num1=num%10;
			if(num1%2==0) {
				even+=1;
			}
			else {
				odd+=1;
			}
			num=num/10;
		}
		System.out.println("Even:"+even);
		System.out.println("Odd:"+odd);
	
	}
}
public class Count_Numberof_Even_Odd {

	public static void main(String[] args) {
		even_odd eo=new even_odd();
		eo.count(12346);

	}

}
