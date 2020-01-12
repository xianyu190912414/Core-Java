/**
 * This program demonstrate console input.
 * @version 1.10 2020-1-12
 * @author Micheal
 */
import java.util.*;
public class InputTest {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = in.nextLine();

        System.out.println("How old are your?");
        int age = in.nextInt();

        System.out.println("Hello," + name + ", next year you will be " + (age + 1) + " years old!");
    }
}
