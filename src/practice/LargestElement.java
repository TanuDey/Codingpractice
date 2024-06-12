package practice;

public class LargestElement {
	public static void main(String args[]) {

int []arr = {2,4,5,7,11,64,8};
int max =arr[0];

 for(int i =0;i<arr.length;i++) {
	 if(max <arr[i]) {
		 max=arr[i];
	 }
 	
}
 System.out.print(max);
	}
	
	
	
	
}
