package practice;
import java.util.Scanner;
import java.util.HashMap;




public class FrequencyElement {
	
void frequency(int arr[],int size) {
		
		HashMap <Integer,Integer> mpp =new HashMap<>();
		for(int i =0;i<size;i++) {
		mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);
		}
        for (int key : mpp.keySet()) {
	      System.out.println("Element: " + key + " Frequency: " + mpp.get(key));
	        }
		
	}
	
	public static void main(String args[]) {
		 int arr[] = {10,5,10,15,10,5};
		 int n =arr.length ;
		 FrequencyElement element = new FrequencyElement();
		 element.frequency(arr, n);
		
		
		
	}

}
