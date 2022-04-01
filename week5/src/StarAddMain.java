import java.util.*;
public class StarAddMain {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("kalem");
		words.add("bilgisayar");
		words.add("bartýn");
		words.add("yakup");
		words.add("kitap");
		
		System.out.println("döngü öncesi: " + words);
		System.out.println("Liste uzunluðu: " + words.size());
		for(int index=0; index <words.size(); index+=2) {
			words.add(index, "*");
		}
		System.out.println("döngü sonrasý: " + words);
		System.out.println("Liste uzunluðu: " + words.size());
		for(int index=0; index<words.size(); index+=1) {
			words.remove(index);
		}
		System.out.println("silme sonrasý: " + words);
		System.out.println("silme liste uzunluðu: " + words.size());

	}

}
