//Write a Java program to print all alphabets from a to z. - using while loop
import java.util.Scanner;
public class Printatoz{
public static void main(String[] args) {
char character = 'a';
System.out.print("\n");
		character = 'a';
		System.out.print("Alphabets from a to z \n");
		while (character <= 'z') {
			System.out.print(character + " ");
			character++;
		}
	}
}