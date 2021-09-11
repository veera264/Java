package practice;

import java.util.Scanner;

class A{
	public void check() throws Exception {
		int num[]= {1,2,3,4,5,51};
		Scanner s1=new Scanner(System.in);
		System.out.println("enter u r num");
		int ur=s1.nextInt();
		boolean status=false;

		for(int i:num) {

			if(ur==i) {
				status=true;
			}
		}




		if(status==true)
			System.err.println("Number is there");

		else
			System.err.println("Number is not there");

		Scanner s2=new Scanner(System.in);
		System.out.println("if u want check agin Y or N");
		String ur1=s2.nextLine();	


		if(ur1.equals("Y")) {
			System.out.println("u choose check(Y) enter number after 5 sec");
			Thread.sleep(5000);
			check();
		}

		else if(ur1.equals("N")) {
			System.out.println("u choose N closing");
			Thread.sleep(3000);
			System.out.println("visit again");
		}

	}
}






public class linear_search {

	public static void main(String[] args) throws Exception {

		A a=new A();
		a.check();

	}
}
