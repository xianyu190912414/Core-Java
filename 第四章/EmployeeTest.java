import java.time.LocalDate;

/**
 * This program tests the employee class
 * @version 1.10
 * @author 19091
 *
 */
public class EmployeeTest {
	public static void main(String[] args) {
		//fill the staff array with three Employee object
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Carl Craker", 75000, 1987, 12, 15);
		staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
		
		//raise employee's salary by 5%
		for(Employee e : staff)
			e.raiseSalary(5);
		
		//print out information about all Employee objects
		for(Employee e : staff)
			System.out.println("name=" + e.getName() + ", salary=" + e.getSalary() + ", hireDay=" +
		e.getHireDay());
	}
}

class Employee {
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String name, double salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public LocalDate getHireDay() {
		return hireDay;
	}
	
	public void raiseSalary(double raisePercent) {
		double raise = salary * raisePercent / 100;
		salary += raise;
	}
	
}
