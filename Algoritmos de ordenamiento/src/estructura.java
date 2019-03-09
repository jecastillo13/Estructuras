import java.io.Serializable;
import java.util.Random;

public class estructura {
	public static void main(String[] args) {

	}
	public static int[] generateArrays (int size) {
		int[] array =new int [size];
		Random rd=new Random();
		for (int i = 0; i < size; i++) {
			array[i]= rd.nextInt();
		}
		return null;
	}
	public static int binarySearch(int[] array,int value,int lowerBound,int upperBound ) {
		int index =-1;
		int middle=(lowerBound+ upperBound)/2;
		if (array[middle]==value) {
			index=middle;
		}else {
			if (value < array[middle]) {
				index=binarySearch(array, value, lowerBound, upperBound-1);
			}else {
				index=binarySearch(array, value, middle + 1, upperBound);
			}
		}
		return index;		
	}
}
