package Numbersgreaterthantwenty;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class A {
public static void main(String[] args) {
//List<Integer> list= Arrays.asList(21,12,24,53,13);
//	
//Stream<Integer> stream = list.stream();
//Stream<Integer> fileterdlist = stream.filter(i-> i>20);
//fileterdlist.forEach(i-> System.out.println(i));
//list.stream().filter(i->i>20 ).forEach(i-> System.out.println(i));
List<String> names =Arrays.asList("Raj","Nir","Pad","yas","azh");
//Stream<String> stream = names.stream();
//Stream<String> fileterlist = stream.filter(i->i.startsWith("a"));
//fileterlist.forEach(i->System.out.println(i));
names.stream().filter(i->i.startsWith("a")).forEach(i-> System.out.println(i));
}


}


