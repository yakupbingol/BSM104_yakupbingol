import java.io.*;
import java.util.*;
public class Vocabulary {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner input = new Scanner(new File("test.txt"));
		
		ArrayList<String> list=new ArrayList<String>();
		list = getWords(input);
		System.out.println(list);

	}
	public static ArrayList<String> getWords(Scanner input){
		ArrayList<String> words=new ArrayList<String>();
		while(input.hasNext()) {
			words.add(input.next().toLowerCase()); // ne varsa hepsini yazar ama k���k
			/*String next = input.next().toLowerCase();   // bu k�s�m da ayni �eyden 1>ise  1 tane yazar.
			if(!words.contains(next)) // ! var i�ermiyorsa di�er sat�ra ge� ve ekle
				words.add(next); */
		}
		
		return words;
		
	}

}
