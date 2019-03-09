
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;



public class sort {
	public static void main(String[] args) {
		Scanner entrada=new Scanner (System.in);

		int array[],nElements;

		nElements=Integer.parseInt(JOptionPane.showInputDialog("write the length of your array"));
		array=new int [nElements];

		for (int i = 0; i < nElements; i++) {
			array[i]= (int) (Math.random()*100)+1;
			//System.out.print(array[i]+",");
		}
//		System.out.println();
		for (int r = 1; r <=30; r++) {
			long timeStart=System.nanoTime();
			//bubblesort(array);
			
			insertionSort(array);
			//1000
			//mergeSort(array);
			//1000
				long timefinal=System.nanoTime();
				double timeTotal= (timefinal-timeStart)*Math.pow(10,-9 );
				System.out.println(timeTotal);
		}
	}
	public  static int[] bubblesort(int []a) {
		int temp;
		boolean swapped=false;
		do {
			swapped=false;
			for (int i = 0; i < a.length-1; i++) {
				if(a[i]>a[i+1]) {
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					swapped =true;
				}
			}
		} while (swapped);
		return a;
	}
	public static void insertionSort(int []a) {
		int temp,index;
		for (int i = 1; i < a.length; i++) {
			index=i; temp =a[i];
			while(index > 0 && temp < a[index -1]) {
				a[index]=a[index-1];
				index-=1;
			}
			a[index]=temp;
		}	
	}
	public static  int[] mergeSort(int[]a) {
		int size=a.length;
		if (size>1) {
			int size_par=size/2;
			int[]a_1=new  int [size_par];
			int[]a_2=new int [size-size_par];
			for (int i = 0; i < size_par; i++) {
				a_1[i]=a[i];
			}
			for (int i = 0; i < size_par; i++) {
				a_2[i]=a[i];

				a_1=mergeSort(a_1);
				a_2=mergeSort(a_2);

				a=merge(a_1,a_2);
			}

		}
		return a;
	}
	private static int[] merge(int[] a_1, int[] a_2) {
		int[] resp=new int [a_1.length+a_2.length];
		int  index_a1=0,index_a2=0,index=0;
		while(index_a1 < a_1.length&& index_a2 < a_2.length) {
			if(a_1[index_a1]<a_2[index_a2]) {
				resp[index]= a_1[index_a1];
				index +=1; index_a1 +=1;
			}
			else {
				resp[index]=a_2[index_a2];
				index +=1; index_a2=1;
			}
			if (index_a1 < a_1.length) {
				for (int i = index_a1; i < a_1.length; i++) {
					resp[index]=a_1[i];
					index +=1;
				}
			}
			else {
				for (int i =index_a2 ; i < a_2.length; i++) {
					resp[index]=a_2[i];
					index +=1;
				}
			}
			return resp;
		}
		return null;
	}
	public static int[] quickSort(int a[]) {
		if (isSort(a)) {
			return a;
		}else {
			int pos_1=0;
			int pos_2=a.length-1;
			int array2[]=new int [a.length];

			for (int i = 1; i < a.length; i++) {
				if (a[0]>a[i]) {
					array2[pos_1]=a[i];
					pos_1++;
				}
				if (a[0]<a[i]) {
					array2[pos_2]=a[i];
					pos_2--;
				}
			}
			array2[pos_1]=a[0];
			//System.out.println(Arrays.toString(array2));
			return quickSort(array2);
		}
	}
	public static boolean isSort(int a[]) {
		for (int i = 1; i < a.length; i++) {
			if((a[i]<=a[i-1])) {
				//System.out.println(false);
				return false;
			}
		}
		//System.out.println(true);
		return true;
	}
}