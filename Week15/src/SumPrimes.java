import java.util.*;
import java.util.stream.IntStream;
public class SumPrimes {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
				
		System.out.println("Kac tane asal sayisi toplamak istiyorsun ? ");
		int count = kb.nextInt();
		int sum = sumPrimes(count);
		System.out.println("sum = " + sum);

	}
	
	public static int sumPrimes(int count) {
		if(count <= 0)
			return 0;
		else {
			long start = System.currentTimeMillis();
			int sum = IntStream.iterate(1, n -> n+2).filter(SumPrimes::isPrime).limit(count).sum()+2;
			double elapsed =(System.currentTimeMillis()-start);
			System.out.println("Time = " + elapsed);
			return sum;
		}
		
			
	}
	/* 
	 DAHA HÝZLÝDÝR.
	 
	public static int sumPrimes2(int count) {
		if(count <= 0)
			return 0;
		else {
			long start = System.currentTimeMillis();
			int sum = IntStream.iterate(1, n -> n)
					.filter(SumPrimes::isPrime2)
					.limit(count).sum();
			double elapsed =(System.currentTimeMillis()-start);
			System.out.println("Time Primes2 = " + elapsed);
			return sum;
		}
	}
	*/
	public static boolean isPrime(int n) {
		//1 2 3 4 5  
		return IntStream.range(1, n+1).filter(x -> n%x ==0).count()==2;
	}
	public static boolean isPrime2(int n) {
		if(n==1)
			return false;
		else {
			int root = (int)Math.sqrt(n);
			return IntStream.range(1, root+1).filter(x -> n % x ==0).count()==1;
		}
	}

}
