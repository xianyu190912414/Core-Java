import java.util.*;

/**
 * This program demonstrates <code>switch</code>
 * @version 1.10
 * @author Micheal
 */

 public class switchPra {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);

         System.out.println("How old are you?(1,2,3,4)");
         int age = in.nextInt();
         
         //case的值必须严格与age参数的值相等
         switch(age) {
             case 1:
             System.out.println("You will go to primary school!");
             break;

             case 2:
             System.out.println("You will go to junior high school!");
             break;

             case 3:
             System.out.println("You will go to senior high school!");
             break;

             case 4:
             System.out.println("You will go to university!");
             break;

             default:
             System.out.println("You should enter your age.");
             break;
         }
     }
 }
