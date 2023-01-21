package Numbersgreaterthantwenty;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeData {
public static void main(String[] args) {
	EMployeeSalary e1= new EMployeeSalary("raj",1,30000);
	EMployeeSalary e2= new EMployeeSalary("baj",2,40000);
	EMployeeSalary e3= new EMployeeSalary("naj",3,20000);
	EMployeeSalary e4= new EMployeeSalary("kaj",4,50000);
List<EMployeeSalary> list = Arrays.aslist(e1,e2,e3,e4);
Optional<EMployeeSalary> max = list.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.eSalary)));

	Stream<EMployeeSalary> salary= Stream.of(e1,e2,e3,e4);
salary.st

}

}
