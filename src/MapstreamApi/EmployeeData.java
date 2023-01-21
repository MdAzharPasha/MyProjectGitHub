package MapstreamApi;

import java.util.stream.Stream;

public class EmployeeData {
public static void main(String[] args) {
	

		Employee e1 = new Employee("kete",23,33000);
		Employee e2 = new Employee("lete",83,33000);
		Employee e3= new Employee("mete",23,300000);
		Employee e4 = new Employee("iete",33,33000);
		Stream<Employee> name = Stream.of(e1,e4,e2,e3);
		name.filter(e->e.eSalary>=50000).map(e->e.eName+"-"+e.eAge).forEach(e->System.out.println(e));
	}
}

