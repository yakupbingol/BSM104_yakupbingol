import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Sets2 {

	public static void main(String[] args) throws FileNotFoundException {
		Set<String> words=new HashSet<String>();
		
		words=read();
		System.out.println(words);
		
		for(String word : read()) 	// words.addAll(read()); da olur ayný þey
			words.add(word);
		System.out.println(words);

	}
	public static Set<String> read() throws FileNotFoundException {
		System.out.println("okumak istediðiniz dosya ismi: ");
		Scanner input = new Scanner(System.in);
		
		String file=input.next();
		Scanner in=new Scanner(new File(file));
												 	 //HashSet rasgele sýralama yapar
		Set<String> temp = new HashSet<String>();   // TreeSet küçükten büyüðe a-z ye sýralama yapar
		
		while(in.hasNext()) {
			String word = in.nextLine().toLowerCase();
			temp.add(word);
			}
		return temp;
	}
}
