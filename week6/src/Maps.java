import java.util.*;
public class Maps {

	public static void main(String[] args) {
		Map<Integer , String> citys = new HashMap<Integer , String>();
		//<key , value>
		
		citys.put(34, "Ýstanbul");
		citys.put(06, "Ankara");
		citys.put(35, "Ýzmir");
		citys.put(25, "Erzurum");
		citys.put(06, "Antalya");
		citys.put(44, "Ankara");
		
		System.out.println(citys);
		System.out.println("Ýndeksler - Keys = " + citys.keySet());
		System.out.println(citys.values());
		System.out.println(citys.get(34));
		
		Map <Integer, Set<String>> citys2 = new HashMap<Integer, Set<String>>();
		
		citys2.put(34, new TreeSet<String>());
		citys2.get(34).add("Ýstanbul");
		citys2.get(34).add("Besiktas");
		citys2.get(34).add("Aranvutköy");
		
		citys2.put(6, new TreeSet<String>());
		citys2.get(6).add("Ankara");
		citys2.get(6).add("Cankaya");
		citys2.get(6).add("Mamak");
		
		System.out.println(citys2);
		
		

	}

}
