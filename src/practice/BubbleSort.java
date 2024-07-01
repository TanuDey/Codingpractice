package practice;
import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int size =scan.nextInt();
		
		int[]arr = {13,24, 46, 20, 52, 9};
	for(int k=0;k<size-1;k++) {
		 
			
		for(int i=0;i<size-1-k;i++) {
			
			if(arr[i]>arr[i+1]) {
			
				int temp =arr[i+1];
			
				arr[i+1]=arr[i];
				
				arr[i]=temp;
			
				
			}				
			}
		
		
		
}
	for(int j=0;j<size;j++) {
		System.out.print(arr[j]+" ");
		}

	}}
