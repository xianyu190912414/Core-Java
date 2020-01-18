import java.util.*;
import 第五章Inheritance.Employee;

/**
 * This program demonstrates the arraylist class
 * @version 1.10 2020-1-18
 * @author 19091
 *
 */
public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Employee> staff = new ArrayList<>();
		//fill the staff array with three Employee objects
		staff.add(new Employee("Carl Craker", 75000, 1987, 12, 15));
		staff.add(new Employee("Harry Hacker", 50000, 1989, 10, 1));
		staff.add(new Employee("Tony Tester", 40000, 1990, 3, 15));
		
		//raise everyone's salary by 5%
		for(Employee e : staff)
			e.raiseSalary(5);
		
		//print out information about all employee objects
		for(Employee e : staff)
			System.out.println("name= " + e.getName() + ", salary= " + e.getSalary()
			+ ", hireDay= " + e.getHireDay());
		System.out.println("Now the information is print out over! Thank you!");
	}
}
