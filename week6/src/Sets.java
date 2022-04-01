import java.util.*;
public class Sets {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();		// her şeyi yazar
		list.add("kalem");
		list.add("masa");
		list.add("bilgisayar");
		list.add("defter");
		list.add(3, "dolap");
		list.add("kalem");
		list.add("masa");
		System.out.println(list);
		
		Set<String> sets = new HashSet<String>();			// aynı şeyden 2 tane varsa 1 tane yazar
		
		sets.add("kalem");
		sets.add("masa");
		sets.add("bilgisayar");
		sets.add("defter");
		sets.add("masa");
		
		System.out.println(sets);
		System.out.println(sets.size());
		System.out.println(sets.contains("dolap"));  	// dolap varmı diye bakıyor
		
		sets.clear();
		System.out.println(sets);
		sets.addAll(list);
		
		System.out.println(sets);
		System.out.println(list.get(2));			
		

	}

}
