package Iterator;

import java.util.ArrayList;
import java.util.ListIterator;



public class Listiterator {
public static void main(String[] args) {
	ArrayList<String> a1= new ArrayList<>(); 
	a1.add("Goa");
	a1.add("bangalore");
	a1.add("noida");
	a1.add("Delhi");
	System.out.println(a1);
			ListIterator <String> listiterator = a1.listIterator();
			while(listiterator.hasNext()) {
				String next = listiterator.next();
				System.out.println(next);
			}
}
}
