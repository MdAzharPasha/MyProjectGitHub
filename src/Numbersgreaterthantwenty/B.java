package Numbersgreaterthantwenty;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class B {
public static void main(String[] args) {
	List<String> list =Arrays.asList("japan","saudi","America","Australia");
//	Stream<String> filter = list.stream();
//	Stream<String> fill=filter.filter(i->i.startsWith("s"));
//	fill.forEach(i->System.out.println(i));
//	list.stream().filter(i->i.startsWith("A")).forEach(i->System.out.println(i));
	list.stream().map(i->i.toUpperCase()).forEach(n->System.out.println(n));
}
}
