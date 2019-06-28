package DivideAndConquer;

import java.util.StringJoiner;

import utilities.Util;

public class MergeSortAlgo {

	public static void main(String[] args) {
		int[] a = { 5, 2, 3, 1, 0 };
		StringJoiner sj = new StringJoiner(",", "[", "]");
		for (int i : a)
			sj.add(Integer.toString(i));
		
		System.out.println("Unsorted array :: " + sj.toString());

		mergeSort(a, 0, a.length - 1);

		sj = new StringJoiner(",", "[", "]");
		for (int i : a)
			sj.add(Integer.toString(i));

		System.out.println("Sorted array :: " + sj.toString());
	}

	public static void mergeSort(int[] a, int low, int high) {

		if (low < high) {
			int mid = (high + low) / 2;
			mergeSort(a, low, mid);
			mergeSort(a, mid + 1, high);
			merge(a, low, mid, high);
		}
	}

	public static void merge(int[] a, int low, int mid, int high) {
		int lowArrayLen = mid - low + 1;
		int highArrayLen = high - mid;

		int[] lowArray = new int[lowArrayLen];
		int[] highArray = new int[highArrayLen];

		for (int i = 0; i < lowArrayLen; i++) {
			lowArray[i] = a[low + i];
		}

		for (int j = 0; j < highArrayLen; j++) {
			highArray[j] = a[mid + 1 + j];
		}

		int i = 0, j = 0, k = low;
		while (i < lowArrayLen && j < highArrayLen) {
			if (lowArray[i] <= highArray[j])
				a[k++] = lowArray[i++];
			else
				a[k++] = highArray[j++];
		}

		while (i < lowArrayLen) {
			a[k++] = lowArray[i++];
		}

		while (j < highArrayLen) {
			a[k++] = highArray[j++];
		}

	}
}
