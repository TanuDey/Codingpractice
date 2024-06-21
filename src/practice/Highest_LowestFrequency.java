package practice;
import java.util.HashMap;

public class Highest_LowestFrequency {
	
	void frequency(int arr[],int size) {
		HashMap <Integer,Integer> map = new HashMap<>();
		for(int i = 0;i<size;i++) {
			map.put(arr[i],map.getOrDefault(arr[i],0)+1);
			
		}
		
		int highestfrequency =Integer.MIN_VALUE;
		int lowestfrequency = Integer.MAX_VALUE;
		int highest_element =-1;
		int lowest_element =1;
		
		
		
		
		for(int key :map.keySet()) {
			int frequency = map.get(key);
			if(frequency >highestfrequency) {
				highestfrequency = frequency;
				highest_element = key;
			}
			if(frequency <lowestfrequency ) {
				lowestfrequency = frequency;
				lowest_element = key;
			}
			System.out.println("Element:"+key +" "+"Frequency:"+map.get(key));	
	}
		System.out.println("ElementWithHigestFrequency:"+highest_element +" "+"Frequency:"+highestfrequency);
		System.out.println("ElementWithLowestFrequency:"+lowest_element +" "+"Frequency:"+lowestfrequency);
		}
	
	public static void main(String args[]) {
		int[] arr = {10,5,10,15,10,5};
		int size = arr.length;
		Highest_LowestFrequency f = new Highest_LowestFrequency();
		
		f.frequency(arr,size);
		
		}
	}
	
	


