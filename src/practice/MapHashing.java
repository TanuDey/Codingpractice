package practice;
import java.util.Scanner;
import java.util.HashMap;

public class MapHashing {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int []arr =new int[size];
		for(int i =0;i<size;i++) {
			arr[i]=scan.nextInt();
		}
		
		HashMap<Integer,Integer> mpp = new HashMap<>();
		for(int i =0;i<size;i++) {
			mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
		}
		
		
		
		int q = scan.nextInt();
		while(q-->0) {
			int number = scan.nextInt();
			System.out.println(mpp.getOrDefault(number,0));
		}
		
	}

}
