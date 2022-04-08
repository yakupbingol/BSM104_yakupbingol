import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[]= {18,4,3,9,4,2};
		
		Queue<Integer> q = new LinkedList<Integer>();
		//q.add(18);
		//q.add(7);   .......
		
		for(int n:data) {
			q.add(n);
		}
		System.out.println("Queue = "+q);
		removeAll(q,4);
		System.out.println("Queue = " + q);

	}
	
	public static void removeAll(Queue<Integer> q, int value) {
		int size=q.size();
		for(int i=0; i<size;i++) {
			int n= q.remove();
			System.out.println(n+" elemaný çýkartýldý");
			System.out.println("Current Queue = " +q);
			if(n!=value) {
				q.add(n);
				System.out.println(n+" elemaný eklendi");
			}
		}
				
	}

}
