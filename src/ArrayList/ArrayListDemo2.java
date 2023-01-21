package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo2 {
public static void main(String[] args) {
	ArrayList a = new ArrayList();
    a.add(100);
    a.add(200);
    a.add(300);
    a.add("Hi");
    System.out.println(a);
    a.remove(1);
    System.out.println(a);
    System.out.println(a);
    ArrayList a1 = new ArrayList();
    a1.add(0, 100);
    a1.add(1,200);
    a1.add(2,300);System.out.println("the element of array a1 is"+a1);
    a.addAll(1,a1);
    System.out.println("the elemnent of a1 is added to a is"+a);
    a.contains(a1);
    System.out.println(a);
}
}
