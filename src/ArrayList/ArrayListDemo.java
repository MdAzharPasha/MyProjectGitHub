package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList a1 = new ArrayList();
	ArrayList a2 = new ArrayList();
	
	a1.add("Hi");
	a1.add(90);
	a1.add("hy");
	System.out.println(a1);
	a1.remove(2);
	System.out.println(a1);
	a1.remove(1);
	System.out.println(a1);
}
}
