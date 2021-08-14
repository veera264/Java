package demo;

class array_equal{
	public void check() {
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5};
		
		boolean status = true;
		
		if(a.length==b.length) {
			for(int i=0;i>=a.length;i++) {
				if(a[i]!=b[i]) {
					status=false;
				}
			}
		}
	
	else {
		status=false;
	}
		if(status==true) {
			System.out.println("both arrays are equal");
		}
		else {
			System.out.println("arrays are not equal");
		}
}
}

public class Both_Arrays_areEqual {

	public static void main(String[] args) {
		array_equal ae=new array_equal();
		ae.check();

	}

}
