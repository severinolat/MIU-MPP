package lambdastreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessingEmployees {
	public static void main(String[] args)
	   {
	      // initialize array of Employees
	      Employee[] employees = {
	         new Employee("Jason", "Red", 5000, "IT"),
	         new Employee("Ashley", "Green", 7600, "IT"),
	         new Employee("Matthew", "Indigo", 3587.5, "Sales"),
	         new Employee("James", "Indigo", 4700.77, "Marketing"),
	         new Employee("Luke", "Indigo", 6200, "IT"),
	         new Employee("Jason", "Blue", 3200, "Sales"),
	         new Employee("Wendy", "Brown", 4236.4, "Marketing")};

	      // get List view of the Employees
	      List<Employee> list = Arrays.asList(employees);

	      // display all Employees
	      System.out.println("Complete Employee list:");
	      list.stream().forEach(System.out::println);   //A method reference.
	      
	      // Predicate (boolean-valued function) that returns true for salaries 
	      //in the range $4000-$6000
	      Predicate<Employee> fourToSixThousand = 
	         e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);

	      // Display Employees with salaries in the range $4000-$6000
	      // sorted into ascending order by salary
	      System.out.printf(
	         "%nEmployees earning $4000-$6000 per month sorted by salary:%n");

	      list.stream()
	          .filter(fourToSixThousand)
	          .sorted(Comparator.comparing(Employee::getSalary))
	          .forEach(System.out::println);

	      // Display first Employee with salary in the range $4000-$6000
	      System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n",
	         list.stream()
	             .filter(fourToSixThousand)
	             .findFirst()
	             .get());

	      // Functions for getting first and last names from an Employee
	      Function<Employee, String> byFirstName = Employee::getFirstName;
	      Function<Employee, String> byLastName = Employee::getLastName;

	      // Comparator for comparing Employees by first name then last name
	      Comparator<Employee> lastThenFirst = 
	         Comparator.comparing(byLastName).thenComparing(byFirstName);

	      // sort employees by last name, then first name 
	      System.out.printf(
	         "%nEmployees in ascending order by last name then first:%n");
	      list.stream()
	          .sorted(lastThenFirst)
	          .forEach(System.out::println);

	      // sort employees in descending order by last name, then first name
	      System.out.printf(
	         "%nEmployees in descending order by last name then first:%n");
	      list.stream()
	          .sorted(lastThenFirst.reversed())
	          .forEach(System.out::println);

	      // display unique employee last names sorted
	      System.out.printf("%nUnique employee last names:%n");
	      list.stream()
	          .map(Employee::getLastName)
	          .distinct()
	          .sorted()
	          .forEach(System.out::println);

	      // display only first and last names
	      System.out.printf(
	         "%nEmployee names in order by last name then first name:%n"); 
	      list.stream()
	          .sorted(lastThenFirst)
	          .map(Employee::getName)
	          .forEach(System.out::println);

	      // group Employees by department
	      System.out.printf("%nEmployees by department:%n"); 
	      Map<String, List<Employee>> groupedByDepartment =
	         list.stream()
	             .collect(Collectors.groupingBy(Employee::getDepartment));

	      groupedByDepartment.forEach(
	         (department, employeesInDepartment) -> 
	         {
	            System.out.println(department);
	            employeesInDepartment.forEach(
	               employee -> System.out.printf("   %s%n", employee));
	         }
	      );

	      // count number of Employees in each department
	      System.out.printf("%nCount of Employees by department:%n"); 

	      Map<String, Long> employeeCountByDepartment =
	         list.stream()
	             .collect(Collectors.groupingBy(Employee::getDepartment, 
	                TreeMap::new, Collectors.counting()));

	      employeeCountByDepartment.forEach(
	         (department, count) -> System.out.printf(
	            "%s has %d employee(s)%n", department, count));

	/*  Output looks something like :

	        HR  4
	        IT  8
	        Sales  12
	*/


	      // sum of Employee salaries with DoubleStream sum method
	      System.out.printf(
	         "%nSum of Employees' salaries (via sum method): %.2f%n",
	         list.stream()
	             .mapToDouble(Employee::getSalary)
	             .sum());

	      // calculate sum of Employee salaries with Stream reduce method
	      System.out.printf(
	         "Sum of Employees' salaries (via reduce method): %.2f%n",
	         list.stream()
	             .mapToDouble(Employee::getSalary)
	             .reduce(0, (value1, value2) -> value1 + value2));  

	      // average of Employee salaries with DoubleStream average method
	      System.out.printf("Average of Employees' salaries: %.2f%n",
	         list.stream()
	             .mapToDouble(Employee::getSalary)
	             .average()
	             .getAsDouble());    
	      
	      //1
	      System.out.printf("Number of last names begin with B: %d",
	    	list.stream()
	      		.filter(n -> n.getLastName().startsWith("B"))
	      		.count());
	      
	      
	      //2
	      System.out.println("List of employees whose last name begins with B in sorted order");
	      list.stream()
	      .filter(n -> n.getLastName().startsWith("B"))
	      .sorted(lastThenFirst)
	      .forEach(System.out::println);
	      
	      
	      
	      //3
	      System.out.println("List of employees whose last name begins with B and last name in capitalize");
	      list.stream()
	    
	      .map(n-> new Employee(n.getFirstName().toUpperCase(),n.getLastName().toUpperCase(),n.getSalary(),n.getDepartment()))
	      .filter(n -> n.getLastName().startsWith("B"))
	      .forEach(System.out::println);
	      

	
	   
	      
	      //4
	      System.out.println("List of all employees but if the last name begins with the letter B,  then capitalize all the letters in the last name");
	      
	      
	      Consumer<Employee> consumEmployee = employee -> {
	    	  if(employee.getLastName().startsWith("B")) {
	    		  employee.setLastName(employee.getLastName().toUpperCase());
	    		  
	    	  }
	      };
	      System.out.println("Print out All Employee objects");
	      list.stream()
	    		  .forEach(consumEmployee);
	     
	      
	      //4.1
	      System.out.println("Print out All Employee objects Collector.join");
	      String result = list.stream()
	    		  .map(Object::toString)
	    		  .collect(Collectors.joining());
	      System.out.println(result);
	      
	      
	    //4.2
	      System.out.println("Print out All Employee objects with delimeter");
	      String resultsep = list.stream()
	    		  .map(Object::toString)
	    		  .collect(Collectors.joining("\n"));
	      System.out.println(resultsep);
	      
	      
	      //5
	      System.out.println("Print out all of the Employee objects’ last names, whose last name begins with the letter  ‘I’  in sorted order, and get rid of all the duplicates");
	      
	      list.stream()
	      .filter(e -> e.getLastName().startsWith("I"))
	      .map(Employee :: getLastName)
	      .distinct()
	      .sorted()
	      .forEach(System.out::println);
	      
	      
	      //6
	      System.out.printf("Average of all the salaries : %.2f%n",
	      list.stream()
	      .mapToDouble(Employee :: getSalary)
	      .average()
	      .getAsDouble());
	      
	      
	      //7
	      System.out.printf("Total of all the salaries : %.2f%n",
	      list.stream()
	      .mapToDouble(Employee::getSalary)
	      .reduce(0,(a,b)-> a+b));
	      
	      
	      //8
	      System.out.println("Only employees first names");
	      list.stream()
	      .map(Employee ::getFirstName)
	      .forEach(System.out::println);
	      
	      
	      //9
	      Stream<Integer> infinite = Stream.iterate(0,i->i+2);
	      
	    		  infinite.limit(20)
	    		  .forEach(System.out::println);;
	      
	      
	      
	      
	      
	      
	      
	   
	   } // end main
	
	

}
