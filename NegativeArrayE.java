//Write a Java program to print all negative elements in an array.
import java.util.Scanner;
public class NegativeArrayE {
	public static void main(String[] args) {
		int j = 0;
		int[] Neg_arr = {10, 25, -46, 54, -32, 8, -9, 67};
		System.out.print("\nList of Negative Numbers in NEG Array : ");
		while(j < Neg_arr.length) 
		{
			if(Neg_arr[j] < 0) {
				System.out.format("%d ", Neg_arr[j]);
			}
			j++;
		}
	}
}