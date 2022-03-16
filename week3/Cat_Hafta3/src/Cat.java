
public class Cat {
	int age;
	String name;
	String color;
	
	public Cat() {
		this.age = 0;
		this.color = "Renk Girilmedi";
		this.name = "Ýsim Girilmedi";
	}
	
	public Cat(String name , int yas) {
		this.name = name;
		this.age = yas;
	}
	
	public Cat(String name , String renk ,int yas) {
		this.name = name;
		this.color = renk;
		this.age = yas;
	}

}
