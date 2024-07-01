package practice;
import java.util.Scanner;

public class SelectionSort {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
        int size = scan.nextInt();
		int []arr = {7, 5, 9, 2, 8};
		
        for(int j=0;j<size;j++) {
		      int min =j;
		for(int i=j+1;i<size;i++) {
			
			if(arr[i]<arr[min]) {
				
				min =i;
			}}
				int temp =arr[min];
				arr[min]=arr[j];
				arr[j]=temp;
				
	
        }
		
		
		
		for(int i = 0;i<size;i++) {
			System.out.print(arr[i]);
		}
		
		
	
	}

	}
