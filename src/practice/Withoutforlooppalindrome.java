package practice;
import java.util.Scanner;

public class Withoutforlooppalindrome {
 public static void main(String args[]) {
	
	 int temp,r;
	 int sum=0;
	 
	 Scanner scan = new Scanner(System.in);
	 System.out.print("Enter a number: ");
	 int n =scan.nextInt();
	 
	 temp=n;
	 while(n >0) {
	 r=n%10;
	 sum=(sum*10)+r;
	 n=n/10;
	 
	 }
	 if(temp == sum) {
		 System.out.print("Palindrome");
	 }
	 else{
	  System.out.print("Not a palindrome");
	 }
}
 
 
}
