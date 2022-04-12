//Write a Java program to find sum of all even numbers between 1 to n
import java.util.Scanner;
public class SumofEvenB1ton {
public static void main(String[] args) {
        int n, sum = 0;
      System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        //Sum of all even numbers between 1 to n
        for(int i = 2; i <= n; i++) {
            //If number is divisible by 2, 
             //then it's a even number
              if(i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("The sum of all even numbers between 1 to " + n + " is " + sum);
    }
  }
