package demo;

class fibonasi{
	public void fib(int num) {
		int a=0,b=1,sum=0;
		System.out.println(a);
		System.out.println(b);
		
		for(int i=2;i<=num;i++) {
			sum=a+b;
			a=b;
			b=sum;
			
			System.out.println(sum);
		}
	
		
	}
}
public class Fibonasi_series {

	public static void main(String[] args) {
		fibonasi f=new fibonasi();
		f.fib(10);
		
	}

}
