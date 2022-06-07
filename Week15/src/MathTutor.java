import java.util.Random;
import java.util.Scanner;
import java.util.function.IntBinaryOperator;
public class MathTutor {

	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		giveProblems(kb, 3, "*", ((x,y) -> x*y));

	}
	// (parametres)  -> exp
	public static void giveProblems(Scanner kb, int numProblems, String text, IntBinaryOperator operator) {
		
		Random r = new Random();
		int numRight = 0;
		for(int i=0; i<numProblems;i++) {
			int x=r.nextInt(12)+1; // 0-12 arasinda rastgele sayi
			int y=r.nextInt(12)+1;
			System.out.println(x + " "+ text + " "+y+" = ");
			System.out.println("Lütfen cevabi girin:");
			int response = kb.nextInt();
			int answer = operator.applyAsInt(x,y);			
			if(response ==answer) {
				System.out.println("dogru");
				numRight++;
		}
			else
				System.out.println("Yanlis. Cevap : "+answer);
			
			
		}
		System.out.println(numProblems + " cevaptan dogru sayisi : " + numRight);
	}

}
