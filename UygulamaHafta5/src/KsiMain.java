import java.util.ArrayList;

public class KsiMain {

	public static void main(String[] args) {
		ArrayList<KisiClass> bireyler = new ArrayList<>();
		
		bireyler.add(new KisiClass("Ahmet",24));
		bireyler.add(new KisiClass("Kaya",30));
		bireyler.add(new KisiClass("Yakup",23));
		bireyler.add(new KisiClass("Bingöl",25));
		
		/*
		bireyler.forEach(birey ->{
			System.out.println("isim: " +birey.getIsim()+", yas: "+birey.getYas());
		});
		*/
		System.out.println();
		for(KisiClass birey:bireyler) {
			System.out.println("isim: "+birey.getIsim()+", yas: "+birey.getYas());
		}
	}

}
