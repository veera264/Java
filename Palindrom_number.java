package demo;


class First_way{
	public void palindrom(int num) {
		int num1=0;
		int original=num;
		while(num!=0) {
			num1=num1*10+num%10;
			num=num/10;
		}
		System.out.println(num1);
		if(original==num1) {
			System.out.println("Its a palindrom");
		}
		else {
			System.out.println("Its Not a Palindrom");
		}
	}
}

public class Palindrom_number {

	public static void main(String[] args) {
		First_way fw=new First_way();
		fw.palindrom(121);

	}

}
