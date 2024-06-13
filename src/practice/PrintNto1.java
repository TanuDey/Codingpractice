package practice;
import java.util.Scanner;

public class PrintNto1 {

//		int num =1;
		
		void fun(int count1) {
			 if(count1>0) {
				 System.out.print(count1);
				 fun(count1-1);  
			 }
		}

		public static void main(String args[]) {
			
			Scanner no = new Scanner(System.in);
			System.out.print("Enter the count number: ");
			int count = no.nextInt();
			PrintNto1 nums = new PrintNto1();
			nums.fun(count);
				
		}	
		
	}


