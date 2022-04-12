//Write a Java program to calculate factorial of a number
import java.util.Scanner;
public class FactorialOfaN {
 public static void main(String[] args) {
        //number
        int n = 5;
         
        //store factorial in this
        int factorial = 1;
         
        //compute factorial
        int i=1;
        while(i<=n) {
            factorial *= i; //factorial = factorial * i
            i++;
        }
         
        System.out.print(n+"! = "+factorial);
    }
}