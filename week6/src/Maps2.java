import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Maps2 {

	public static void main(String[] args) throws FileNotFoundException {
		//hangi kelime , ka� defa?
		
		Map<String, Integer> wordCountmap = new HashMap<String, Integer>();
		// ilk tuttu�um benim indeksim, ikincisi t�r�
		
		Scanner input = new Scanner (new File("test.txt"));
		
		while(input.hasNext()) {
			String word=input.next().toLowerCase();
			
			if(!wordCountmap.containsKey(word)) {
				wordCountmap.put(word, 1);
			}
			else {
				int count = wordCountmap.get(word);
				wordCountmap.put(word, count+1);
			}
		}
		System.out.println(wordCountmap);
		

	}

}
