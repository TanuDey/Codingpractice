package practice;
import java.util.Scanner;

public class Palindrome {
	
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
           
		
		System.out.print("Enter a number: ");
		String num = scan.next();
		int start =0;
		int finish = num.length()-1;
		
		boolean flag =true;
		
		
		
	 while(start < finish) {
		if(	num.charAt(start)!= num.charAt(finish)) {
			flag =false;
			//System.out.println("Not a plaindrome");
			
			break;
		}
		
	
		else {
			start++;
			finish--;
		
		}
		//System.out.println("Palindrome");
		
		}
	 if(flag == true) {
		 System.out.print("Palindrome");
	 }else {
		 System.out.print("NOt a Plaindrome");
	 }
			
		
	}

}
