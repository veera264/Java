package demo;

class min_max{
	int nums[]= {1,2,3,4,5,6};
	public void max() {
		int max=nums[0];
		for(int i:nums) {
			if(i>max)
				max=i;
		}
		System.out.println("Max value: "+max);
	}
	
	public void min() {
		int min=nums[0];
		for(int j:nums) {
			if(j<min)
				min=j;
		}
		System.out.println("Min value: "+min);
	}
}
public class Max_Min_elements_in_array {

	public static void main(String[] args) {
		min_max mm=new min_max();
		mm.max();
		mm.min();

	}

}
