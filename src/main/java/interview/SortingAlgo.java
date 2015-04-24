package interview;

import java.util.Arrays;
import java.util.Scanner;

public class SortingAlgo {
	private int[] s;

	public void print() {
		if (s != null) {
			System.out.println(Arrays.toString(s));
		}
	}

	public SortingAlgo(int[] s) {
		this.s = s;
	}

	public void insertionSort(int[] s) {
		for (int i = 1; i < s.length; i++) {
			int temp = s[i];
			for (int j = i - 1; j >= 0 && temp < s[j]; j--) {
				s[j + 1] = s[j];
				s[j] = temp;
			}
		}
		System.out.println("Insertion sort");
		System.out.println(Arrays.toString(s));
	}

	public void quickSort(int left, int right) {
		int part = partition(s, left, right);
		if (left < part - 1) {
			quickSort(left, part - 1);
		}
		if (part < right) {
			quickSort(part, right);
		}

	}

	private int partition(int[] s, int left, int right) {
		int pivotal = (left + right) / 2;
		int i = left, j = right;
		int temp;
		while (i <= j) {
			while (s[i] < s[pivotal]) {
				i++;
			}
			while (s[j] > s[pivotal]) {
				j--;
			}
			if (i <= j) {
				temp = s[j];
				s[j--] = s[i];
				s[i++] = temp;
			}
		}
		return i;
	}

	public void bubleSort(int[] s) {
		for (int i = s.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (s[j] > s[j + 1]) {
					int temp = s[j + 1];
					s[j + 1] = s[j];
					s[j] = temp;
				}

			}
		}
		System.out.println("bubble sort");
		System.out.println(Arrays.toString(s));
	}

	public void mergeSort(int[] s) {

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] s = new int[a];
		for (int i = 0; i < a; i++) {
			s[i] = sc.nextInt();
		}
		SortingAlgo al = new SortingAlgo(s);
		al.insertionSort(s);
		al.quickSort(0, a - 1);
		System.out.println("quick sort");
		System.out.println(Arrays.toString(s));
		al.bubleSort(s);
	}

}
