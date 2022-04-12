//Write a Java program to find second largest element in an array.
import java.util.Arrays;
public class SecondLArray {
public static void main(String args[]){
int array[] = {10, 15, 20, 25, 30, 35, 40};
int size = array.length;
      Arrays.sort(array);System.out.println("Sorted Array ::"+Arrays.toString(array));
      int res = array[size-2];
System.out.println("Second largest element is ::"+res);
   }
}