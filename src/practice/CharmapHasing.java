package practice;
import java.util.Scanner;
import java.util.HashMap;

public class CharmapHasing {
	public static void main(String args[]) {
		String str ="abcdabehf";
		Scanner scan = new Scanner(System.in);
		HashMap<Character,Integer>mp = new HashMap<>();
		for(int i =0;i<str.length();i++) {
			
			mp.put(str.charAt(i),mp.getOrDefault(str.charAt(i),0)+1);
		}
		
		int q = scan.nextInt();
		while(q-- >0) {
			char c = scan.next().charAt(0);
			System.out.println(mp.getOrDefault(c,0));
		}
		
	}

}
