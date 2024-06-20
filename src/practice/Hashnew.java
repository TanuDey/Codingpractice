package practice;
import java.util.Scanner;

public class Hashnew {

	
	
	public static void main (String args[]) {
	
		Scanner scanner = new Scanner(System.in);

       
        int n = scanner.nextInt();
        int[] arr = new int[n];

        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

       
        int[] r = new int[13];
        for (int i = 0; i < n; i++) {
            r[arr[i]] += 1;
        }

        
        int q = scanner.nextInt();
        while (q-- > 0) {
            int number = scanner.nextInt();
            
            System.out.println(r[number]);
        }

        scanner.close();

}}
