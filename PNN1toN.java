// Write a Java program to print all natural numbers from 1 to n. - using while loop
import java.util.Scanner;
class PNN1toN{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.print("Enter the maximum numbers for n:");
int n=scan.nextInt();
System.out.print("First n Natural numbers are\n");
int i=0;
while(i<=n){
  System.out.print(i+" ");
   i++;
}
}
}