package week9;

public class ReferenceMystery {

	public static void main(String[] args) {
		String name="Janet";
		int money=30;
		Account account = new Account(name,money);
		
		mystery(name,money,account);
		System.out.println(name + " , " + money + " , " + account);
		
		money=money + 10;
		account.name="Billy";
		
		mystery(name, money,account);
		System.out.println(name + " , " + money + " , " + account);
		

	}
	static void mystery(String name,int money,Account account) {
		account.money++;
		name="Susan";
		System.out.println(name + " , " + money + " , " + account);
	}

}
