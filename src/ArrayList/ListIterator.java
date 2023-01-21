package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {
public static void main(String[] args) {
	List a = new ArrayList();
    a.add(100);
    a.add(200);
    a.add(300);
    a.add("Hi");
    //first approach to get iterate the element 
   for (int i = 0; i < a.size(); i++) {
		System.out.println(a.get(i));
	}
    //second approach to iterage the elemnt
    for(Object obj:a) {
    	System.out.println(obj);
    }
    //third approach
    Iterator iter = a.iterator();
    while (iter.hasNext()) {
    	System.out.println(iter.next());
		//type type = (type) en.nextElement();	
	}
    //fourth approach
   ListIterator listiterator = (ListIterator) a.listIterator();
   
}
}
