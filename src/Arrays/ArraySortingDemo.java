package Arrays;

import java.lang.reflect.Array;
import java.util.Iterator;

public class ArraySortingDemo {
public static void main(String[] args) {
	int arr[] = {9,2,3,4,1,5,6,8,7};
	int max = arr[arr.length-1];
	int min = arr[0];
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]>max) {
		max= arr[i];
		}
		if (arr[i]<min) {
			min = arr[i];
	}
		
	System.out.println("min element is" +min);
	System.out.println("max element is" +max);
}}
}