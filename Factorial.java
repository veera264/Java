package demo;

class factorial_of_number{
	public void fact(int num) {
		int total=1;
		for(int i=2;i<=num;i++) {
			total=total*i;
		}
		System.out.println(total);
	}
}
public class Factorial {

	public static void main(String[] args) {
		factorial_of_number f=new factorial_of_number();
		f.fact(5);

	}

}
