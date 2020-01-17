package 第五章abstractClasses;
/**
 * This program demonstrates abstract classes
 * @version 1.10 2020-1-17
 * @author 19091
 *
 */
public class PersonTest {
	public static void main(String[] args) {
		Person[] people = new Person[2];
		
		//fill the person array with Student and Employee objects
		people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		people[1] = new Student("Maria Morris", "computer science");
		
		//print out names and descriptions of all Person object
		for(Person p : people)
			System.out.println(p.getName() + ", " + p.getDescription());
	}
}
