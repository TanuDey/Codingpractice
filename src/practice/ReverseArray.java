package practice;

public class ReverseArray {
	
	
	
public static void main(String args[]) {
	
	int[]arr= {10,20,30,40};
	int start=0;
	int end =arr.length-1;
	int []temp = new int[arr.length];
	while(start < end) {
		temp[start]=arr[end];
		arr[end]=arr[start];
		arr[start]=temp[start];
		start++;
		end--;
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
