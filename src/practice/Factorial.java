package practice;
import java.util.Scanner;

public class Factorial {
	
	
	
	int fact(int number) {
		int factor =1;
		
		if(number >1) {
			
	   factor = number * fact(number-1);
	 
		System.out.println(factor);
		
		}
		 return factor;
		
		
	
	}
	
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = scan.nextInt();
		
		Factorial fac = new Factorial();
		int total =fac.fact(num);
		System.out.print(total);
		
		
		
	}

}
