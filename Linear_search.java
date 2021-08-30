
public class Linear_search {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4};
		int find=8;
		int len=a.length;
		boolean status = true;
		for(int i=0;i<=len-1;i++) {
			
			if(a[i]==find) {
				status=true;
			}
			
		
		else {
			status=false;
		}
		}
		
		
	if(status==true) {
		System.out.println("find");
	}
	else {
		System.out.println("Not find");
	}
	}

}
