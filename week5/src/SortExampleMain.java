import java.util.*;
public class SortExampleMain {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("kalem");
		words.add("bilgisayar");
		words.add("bartýn");
		words.add("yakup");
		words.add("kitap");
		
		System.out.println("sýralanmadan önce: " + words); 
		System.out.println(words.get(0));  // indeksteki deðeri yazar
		//a-z ye sýralama yaptý
		Collections.sort(words);
		System.out.println("sýralanmadan sonra: " + words); 
		
		Collections.shuffle(words);
		System.out.println(words);
		
		
		
		
		

	}

}
