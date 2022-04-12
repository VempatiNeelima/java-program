//Write a Java program to count number of digits in a number.
import java.util.Scanner;
public class CountNofDinN {
public static void main(String[] args) {
int count = 0, num = 24353416;
for (; num != 0; num /= 10, ++count) {
    }
System.out.println("Number of digits: " + count);
  }
}