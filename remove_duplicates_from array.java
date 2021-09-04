package demo;




public class duplicates {

	public static void main(String[] args) {

		int num[]= {1,1,2,3,3,4,4,5,6,6,7,9,9,10,10,12,12};

		int len=num.length;
		
		int num1[]=new int[len];
		num1[len-1]=num[len-1];
		int count=0;
		for(int i=0;i<=len-2;i++) {
			
			if(num[i]!=num[i+1]) {
				
				num1[count]=num[i];
				count++;
				
			}
			
		}
		
		
		
		for(int g:num1) {
			
			if(g>=1) {
				System.out.println(g);
			}
		}
	}

}
