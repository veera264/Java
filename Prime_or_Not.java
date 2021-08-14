package demo;

class prime{
	public void check(int num) {
		int count=0;
		
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0)
					count+=1;
			}
			if(count==2)
				System.out.println("Its a prime Number");
			else
				System.out.println("Its not a prime Number");
		}
		else
			System.out.println("Its not a prime");
	}
}
public class Prime_or_Not {

	public static void main(String[] args) {
		prime p=new prime();
		p.check(6);

	}

}
