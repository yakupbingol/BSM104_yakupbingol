package week4;
import java.util.*;

public class StockMain {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("�lk magaza ismi : ");
		String store1 = console.next();
		Stock stock1 = new Stock(store1);
		int profit1 = makePurchases(stock1, console);
		
		System.out.print("ikinci magaza ismi : ");
		String store2 = console.next();
		Stock stock2= new Stock(store2);
		int profit2 = makePurchases(stock2,console);
		
		if(profit1 > profit2) {
			System.out.println(store1 + " daha yararl�d�r.");
		} else if(profit2 > profit1) {
			System.out.println(store2 + " daha yararl�d�r.");
		} else {
			System.out.println(store1 + " ve " + store2 + " e�ittir.");
		}
		
	}
	
	public static int makePurchases(Stock currentStock, Scanner console) {
		System.out.println("Ka� kez sat�n alma yapt�n: ");
		int numPurchases = console.nextInt();
		for(int i=1; i<=numPurchases; i++) {
			System.out.print(i + ": al�mda ka� tane ald�n ? Birim fiyat� nedir");
			int numShares=console.nextInt();
			int pricePerShare = console.nextInt();
			currentStock.purchase(numShares, pricePerShare);
		}
		System.out.print("G�ncel birim fiyati ?  ");
		int currentPrice = console.nextInt();
		
		int profit = currentStock.getProfit(currentPrice);
		System.out.println("net kazanc/kay�p: " + profit + "TL");
		System.out.println();
		return profit;
		
	}

}
