import java.util.*;
public class SortExampleMain {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("kalem");
		words.add("bilgisayar");
		words.add("bart�n");
		words.add("yakup");
		words.add("kitap");
		
		System.out.println("s�ralanmadan �nce: " + words); 
		System.out.println(words.get(0));  // indeksteki de�eri yazar
		//a-z ye s�ralama yapt�
		Collections.sort(words);
		System.out.println("s�ralanmadan sonra: " + words); 
		
		Collections.shuffle(words);
		System.out.println(words);
		
		
		
		
		

	}

}
