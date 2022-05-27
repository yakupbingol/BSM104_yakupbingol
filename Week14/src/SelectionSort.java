
public class SelectionSort {
	void selectionSort(int[] array) {
		
			
			for(int i =0; i<array.length-1;i++) {
				int min = i;
				for(int j=i+1;j<array.length;j++) {
					if(array[j] < array[min]) {
						min = j;
						
					}	
				}
				int temp=array[i];
				array[i]=array[min];
				array[min] = temp;		
			}
	}
	
	void toString(int [] array) {
		for(int i =0; i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int [] array = {10,8,6,4,2,20};
		SelectionSort ss = new SelectionSort();
		System.out.println("Siralanmamis dizi: ");
		ss.toString(array);
		System.out.println("Siralanmis dizi: ");
		ss.selectionSort(array);
		ss.toString(array);
		
		
		

	}

}
