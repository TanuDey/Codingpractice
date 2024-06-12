package practice;
 import java.util.Scanner;


public class Armstrong {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ") ;
		int num = scan.nextInt();
		
		int temp = num;
		int sum =0;
		while(num >0) {
			int remainder =num%10;
		    sum = sum +(remainder*remainder*remainder);
			num = num/10;
			
		}
		System.out.print(sum);
		
		}
	
}
