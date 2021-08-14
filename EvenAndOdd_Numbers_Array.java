package demo;


class even_and_odd{
	public void check() {
		int num[]= {1,2,3,4,5,6};
		
		System.out.println("Even Numbers in array:.....");
		for(int i:num) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println("Odd Numbers in array..");
		for(int j:num) {
			if(j%2!=0) {
				System.out.println(j);
			}
		}
	}
}
public class EvenAndOdd_Numbers_Array {

	public static void main(String[] args) {
		
		even_and_odd eo=new even_and_odd();
		eo.check();
	}

}
