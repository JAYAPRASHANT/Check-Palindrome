package ispalindrome;
import java.util.*;
public class ispalindrome {

	 static int isPalindrome(String s){
	        if (s.length()==0||s.length()==1){
	            return 1;
	        }
	        if(s.charAt(0)==s.charAt(s.length()-1)){
	            return isPalindrome(s.substring(1,s.length()-1));
	        }else{
	            return 0;
	        }
	        }
		public static void main(String[] args) {
		
			Scanner sc = new Scanner (System.in);
			String s = sc.next();
			int st = isPalindrome(s);
			System.out.println(st);
		}
}
