package practice;
import java.util.Scanner;

public class PrintNames {
	
	String name ="Tanusree";


	void func(int count) {
		if (count>0) {
			System.out.println(name);
			func(count-1);   
			
		}
		

	}
	public static void main(String args[]) {
		Scanner no = new Scanner(System.in);
		System.out.print("Enter the count no: ");
		int new_number =no.nextInt();
		
		PrintNames names = new PrintNames();
		names.func(new_number);
		
	}

}
