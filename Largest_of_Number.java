package demo;

class largest_number{
	public void largest(int num,int num1,int num2) {
		if(num>num1 &&num>num2) {
			System.out.println(num);
		}
		else if(num1>num2 &&num1>num) {
			System.out.println(num1);
		}
		else {
			System.out.println(num2);
		}
	}
}
public class Largest_of_Number {

	public static void main(String[] args) {
		largest_number ln=new largest_number();
		ln.largest(100,200,300);

	}

}
