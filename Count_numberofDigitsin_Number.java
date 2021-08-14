package demo;

class count_digit{
	public void count(int num) {
		int total=0;
		while(num!=0) {
			num=num/10;
			total+=1;
		}
		System.out.println(total);
		
	}
}


public class Count_numberofDigitsin_Number {
	
	public static void main(String[] args) {
		count_digit cd=new count_digit();
		cd.count(134831844);
	}
}
