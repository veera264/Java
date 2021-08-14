package demo;

class array_total{
	public void sum() {	
		int num[]= {1,2,3,4,5};
		int total=0;
		for(int i:num) {
			total=total+i;
		}
		System.out.println(total);
	}
}
public class Sum_of_elements_Array {

	public static void main(String[] args) {
		array_total at=new array_total();
		at.sum();

	}

}
