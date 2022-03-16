
public class main {

	public static void main(String[] args) {
		Cat kedi1 = new Cat();
		System.out.println(kedi1.age + " , " + kedi1.color + " , " + kedi1.name);
		
		Cat kedi2 = new Cat("Tarçýn",2);
		System.out.println(kedi2.age + " , " + kedi2.color + " , " + kedi2.name);
		
		Cat kedi3 = new Cat("Tarçýn","Mor",4);
		System.out.println(kedi3.age + " , " + kedi3.color + " , " + kedi3.name);

	}

}
