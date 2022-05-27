
public class InsertionSort {
	void insertionSort(int [] array) {
		for(int i=1; i<array.length;i++) {
			int key = array[i];
			int j = i -1;
			while(j >= 0 && array[j] > key) {
				array [j+1] = array[j];
				j--;
			}
			array[j+1] = key;
		}
	}
	void printArray(int [] array) {
		for(int i =0; i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int [] array = {9,7,6,11,15,24,29,34,25};
		InsertionSort ob = new InsertionSort();
		System.out.println("Siralanmamis dizi: ");
		ob.printArray(array);
		System.out.println("Siralanmis dizi: ");
		ob.insertionSort(array);
		ob.printArray(array);
	

	}
}