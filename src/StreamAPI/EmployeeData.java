package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeData{
public static void main(String[] args) {
	List<Employee> emps = new ArrayList<Employee>();
	emps.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
	emps.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
	emps.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
	emps.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
	emps.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
	emps.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
	emps.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
	emps.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
	emps.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
	emps.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
	emps.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
	emps.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
	emps.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
	emps.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
	emps.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
	emps.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));
	//------------------------How many male and female employees are there in the organization ?------------------------
    	Map<String, Long>map1 =emps.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
    	System.out.println(map1);
	
    //------------------------Print the name of all departments in the organization ?------------------------
	//	emps.stream().map(Employee::getDepartment).distinct().forEach(name->System.out.println(name));
	
	//------------------------ What is the average age of male and female employees ?------------------------
//	Map<String, Double>map2 =emps.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
//	System.out.println(map2);
	//------------------------ Get the details of highest paid employee in the organization ?------------
//	Optional<Employee> optional =emps.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
//	if (optional.isPresent()) {
//		Employee employee= optional.get();
//		System.out.println(employee);
	//------------------------ Get the names of all employees who have joined after 2015 ------------------------
//	emps.stream()
//	.filter(e -> e.yearOfJoining > 2015)
//	.map(e -> e.name)
//	.forEach(name -> System.out.println(name));
	
	//------------------------ Count the number of employees in each department ?------------------------ 
//	Map<String, Long>map1 =emps.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//    	System.out.println(map1);
//	------------------------ What is the average salary of each department ------------------------ 
//	Map<String, Double> map = emps.stream()
//			.collect(Collectors.groupingBy(Employee::getDepartment,
//			Collectors.averagingDouble(Employee::getSalary)));
//			System.out.println(map);
	//------------------------ Get the details of youngest male employee in the Development department ?------------------------ 
//	Optional<Employee> optional = emps.stream()
//			.filter(e -> e.getGender().equals("Male") &&
//			e.getDepartment().equals("Development"))
//			.min(Comparator.comparing(Employee::getAge));
//			if(optional.isPresent()) {
//			System.out.println(optional.get());
//			}
//	------------------------		9. Who has the most working experience in the organization ?------------------------
//					Optional<Employee> optional = emps.stream()
//					.collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
//					if(optional.isPresent()) {
//					System.out.println(optional.get());
//					}
//	------------------------	10. How many male and female employees are there in the Sales team ?------------------------
//			Map<String, Long> map = emps.stream()
//			.filter(e ->
//			e.getDepartment().equals("Sales"))
//			.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//			System.out.println(map);
	/*
	 * List<Employee>collect=emps.stream().sorted(Comparator.comparing(Employee::
	 * getSalary).reversed()).collect(Collectors.toList());
	 * System.out.println(collect);
	 */
}
}

