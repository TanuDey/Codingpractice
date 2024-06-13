package practice;

import java.util.Scanner;

public class SumN {
	int sum =0;
	
	int sum1(int count) {
		if(count > 0) {
			sum = sum + count;
			sum1(count-1);
		}
		return sum;
	}
	
	
	
	public static void main(String args[]) {
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the count no : ");
		
		int no = num.nextInt();
		SumN n = new SumN();
		int totalsum =n.sum1(no);
		System.out.print(totalsum);
		
	}

}
