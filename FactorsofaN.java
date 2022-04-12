//Write a Java program to find all factors of a number
import java.util.Scanner;
public class FactorsofaN {
public static void main(String[] args) {
		//number
		int num = 20;
		
		//find all factors
		for(int i = 1; i <= num; ++i) {
			//check if i is a factor of num
			if(num % i == 0) {
				System.out.print(i+" ");
			}
		}
	}
}