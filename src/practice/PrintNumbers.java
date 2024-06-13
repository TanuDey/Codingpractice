package practice;
import java.util.Scanner;
public class PrintNumbers {
	
	int num =1;
	
	void fun(int count) {
		 if(count>0) {
			 System.out.print(num++);
			 fun(count-1);
		 }
	}

	public static void main(String args[]) {
		
		Scanner no = new Scanner(System.in);
		System.out.print("Enter the count number:");
		int count = no.nextInt();
		PrintNumbers nums = new PrintNumbers();
		nums.fun(count);
		
		
		
		
		
	}

	
	
	
	
}
