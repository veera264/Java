import java.util.Arrays;

class remove{
	public void sort() {
		int[] a= {1,2,3,1,2};
		int len=a.length;
		for(int i=0;i<=len-1;i++) {				
			
		
			for(int j=0;j<len-2;j++) {
			if(a[j]>a[j+1]) {
				
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
		}
		
		System.out.println("sort:"+Arrays.toString(a));

	}
}
public class Duplicats_array {

	public static void main(String[] args) {
		remove r=new remove();
		r.sort();

	}

}
