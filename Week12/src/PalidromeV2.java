import java.util.*;
public class PalidromeV2 {

	public static void main(String[] args) {
		System.out.println("Lütgen bir string girin: ");
		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		
		System.out.println(isPalindrome(inputString));
	}		
		
		public static boolean isPalindrome(String text) {
			if(text== null || isAlpha(text)) {
				return false;
			}
			int left = 0;
			int right = text.length()-1;
			while(left < right) {
				if(text.charAt(left++) != text.charAt(right--)) {
					return false;
				}
			}
			return true;
		}
			public static boolean isAlpha(String s) {
				char[] charArr = s.toCharArray();
				for(char c : charArr) {
					if(!Character.isLetter(c)) {
						return false;
					}
				}
				return true;
			}

}
