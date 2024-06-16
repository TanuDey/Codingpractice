package practice;

public class StringPalindrome {
public static void main(String args[]) {
	String str="ABCDCBA";
	
	int start =0;
	int end =str.length()-1;
	int flag =1;
	while(start<end ) {
		if(str.charAt(start)!=str.charAt(end)) {
			flag=0;
			break;
		}
		else {
			
			start++;
			end--;
		}
	}
	if(flag ==1) {
		System.out.print(" palindrome");
	}
	else {
		System.out.print("Not palindrome");
	}
	
}
}
