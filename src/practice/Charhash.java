package practice;
import java.util.Scanner;

public class Charhash {

	public static void main(String args[]) {
		String str ="abcdabehf";
		int []Hash =new int[256];
		for(int i=0;i<str.length();i++) {
			Hash[str.charAt(i)]++;
		}
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		while(n-- >0) {
			char c =scan.next().charAt(0);
			System.out.println(Hash[c]);
		}
		
	}
}
 