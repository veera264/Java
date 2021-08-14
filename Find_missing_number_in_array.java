package demo;

class Missing_Number{
	public void find() {
		int a[]= {1,2,3,4,6};
		
		int total1=0;
		for(int i:a) {
			total1+=i;
		}
		
		int total2=0;
		for(int i=0;i<=6;i++) {
			total2+=i;
		}
		System.out.println(total2-total1);
	}
}
public class Find_missing_number_in_array {

	public static void main(String[] args) {
		Missing_Number mn=new Missing_Number();
		mn.find();

	}

}
