package demo;


class First_Wayto_swap{
	public void num(int num1,int num2) {
		int num3=num1;
		num1=num2;
		num2=num3;
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
	}
}
class Secound_wayto_swap{
	public void num(int num1,int num2) {
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
	}
}
public class Swap_Two_Numbers {

	public static void main(String[] args) {
		Secound_wayto_swap swap=new Secound_wayto_swap();
		swap.num(2, 3);
		
	}

}
