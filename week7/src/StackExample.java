import java.util.*;
public class StackExample {

	public static void main(String[] args) {
		//Stack LIFO
		String data[] = {"Java", "php","python","C","C++"};
		
		Stack<String> s=new Stack<String>();
		// Set -> add ekleme
		//Map --> put ekleme
		//stack  --> push ekleme - pop siler
		for(String word: data) {
			s.push(word);
		}
		System.out.println("Stack = "+s);
		System.out.println(s.size());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println("Stack = "+s);
		System.out.println(s.size());
		System.out.println("-------------------------");
		
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}

	}

}
