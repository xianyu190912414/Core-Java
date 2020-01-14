import java.util.*;

/**
 * This program demonstrates array manipulation
 * @version 1.10
 * @author Micheal
 */

public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw?");
        int k = in.nextInt();

        System.out.println("What is the highest number you can draw?");
        int n = in.nextInt();

        //fill a array with number 1,2,3,...n
        int[] numbers = new int[n];
        for(int i = 0; i < numbers.length; i ++) {
            numbers[i] = i +1;
        }

        //draw k numbers and put them into a second array
        int[] results = new int[k];
        for(int i=0; i<results.length; i++) {
            int m = (int)(Math.random() * n);

            results[i] = numbers[m];
            numbers[m] = numbers[n-1];
            n--;
        }
        //print the sorted array
        Arrays.sort(results);
        System.out.println("Bet the following combination. It will make you rich!");
        for(int e : results) {
           System.out.println(e);
        }
    }
} 
