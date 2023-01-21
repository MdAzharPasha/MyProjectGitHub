package Arrays;

import java.util.Iterator;

public class ReverseArray {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
//	for (int i = a.length-1; i>=0 ; i--) {
//		System.out.println(a[i]);
	//if(a[0]> a[1]) {
		int temp = a[0];
		a[0]=a[1];
		a[1]=temp;
	//}
	System.out.println("after sorting the value of a[0] is"+a[0]);
	System.out.println("after sorting the value of a[0] is"+a[1]);
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println(a[3]);
	System.out.println(a[4]);
//	}
//}
//	public static void main(String[] args) {
//	int a = 20;
//	int b = 30;
//	int temp=a;
//	a = b;
//	b=temp;
//	System.out.println("the value of a after sorting is"+a);
//	System.out.println("the value of b after sorting is"+b);
//	}
}
}
