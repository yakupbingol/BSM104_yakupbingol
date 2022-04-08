import java.util.*;
public class ParemthesisMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(a+(b*c)-d -> dengeli
		// (a*((d-e)+b  ->dengesiz
		Scanner input = new Scanner (System.in);
		System.out.println("kontrol etmek istedi�iniz ifadeyi girin : ");
		String exp = input.next();
		
		if(isMatching(exp)) {
			System.out.println("Dengelidir.");
		}
		else {
			System.out.println("Dengesizdir.");
		}
	}
		
		public static boolean isMatching(String exp) {
			Stack<Character> s = new Stack<Character>();
			
			for(int i=0; i < exp.length(); i++) {
				
				if(exp.charAt(i) =='(')
					s.push(exp.charAt(i));
				
				else if(exp.charAt(i)==')')
					if(!s.isEmpty())
						s.pop();
					else
						return false;
			}
			return (s.isEmpty());
		}
	
	}
	

