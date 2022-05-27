
public class MergeSort {
	
	void sort(int [] array,int left,int right) {
		if(left<right) {
			int mid = left + (right-left)/2;
			
			sort(array,left,mid);
			sort(array,mid+1,right);
			merge(array,left,mid,right);

		}
	}
	void merge(int [] array, int left, int mid, int right) {
		int number1=mid - left + 1;
		int number2 = right - mid;
		
		int [] L = new int [number1];
		int [] R = new int [number2];
		
		for(int i = 0; i< number1; i++) {
			L[i] = array[left+i];
		}
		for(int i = 0; i< number2; i++) {
			R[i] = array[mid+1+i];
		}
		
		int i = 0 , j = 0;
		int k = left;
		while(i < number1 && j < number2) {
			if(L [i] <= R[j]) {
				array[k] = L[i];
				i++;
			}
			else {
				array[k] = R[j];
				j++;
			}
			k++;
		}
		//kalan elemanlari kopyalamak icin
		while(i<number1) {
			array[k] = L[i];
			i++;
			k++;
		}
		while(j<number2) {
			array[k] = R[j];
			j++;
			k++;
		}
	}
	void printArray(int [] array) {
		for(int i =0; i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		MergeSort ms = new MergeSort();
		int [] array = {5,9,7,6,4,11,17};
		System.out.println("Siralanmamis dizi: ");
		ms.printArray(array);
		System.out.println("Siralanmis dizi: ");
		ms.sort(array,0,array.length-1);
		ms.printArray(array);
		
	}

}
