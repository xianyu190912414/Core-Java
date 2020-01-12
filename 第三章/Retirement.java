import java.util.*;

/**
 * This program demonstrates a <code>while</code> loop
 * @version 1.10 2020-1-12
 * @author Micheal
*/

public class Retirement {
    public static void main(String[] args) {
        //read input
        Scanner in = new Scanner(System.in);

        System.out.println("How much money do you need to retire?");
        double goal = in.nextDouble();

        System.out.println("How much money will you contribute every year?");
        double payment = in.nextDouble();

        System.out.println("Interest rate in %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        double years = 0;

        while(balance < goal) {
            //add this year's payment and interest
            balance += payment;
            double interest = interestRate * balance / 100;
            balance += interest;
            years ++;
        }

        System.out.println("You will retire in " + years + " years.");
    }
}
