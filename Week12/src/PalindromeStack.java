import java.util.*;
public class PalindromeStack {

	public static void main(String[] args) {
		
		System.out.println("L�tfen bir string girin:");
		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		Stack stack = new Stack();
		
		for(int index = 0; index < inputString.length(); index++) {
			stack.push(inputString.charAt(index));
			
		}
		String reverseString="";
		while(!stack.isEmpty()) {
			reverseString = reverseString + stack.pop();
		}
		if(inputString.equals(reverseString)) {
			System.out.println("Girilen sayi palidromdur.");
			
		}
		else {
			System.out.println("Girilen sayi palidrom de�ildir.");
		}
		
		
	}

}
