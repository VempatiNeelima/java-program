//Write a Java program to find sum of all natural numbers between 1 to n
  import java.util.Scanner;
public class SumofNB1ton
{  
//method that returns the sum of n natural numbers   
static int naturalNumberSum(int n)   
{   
int sum = 0;   
//executes until the condition becomes false  
for (int i = 1; i <= n; i++)    
//adding the value of i to the sum variable  
sum = sum + i;   
return sum;   
}   
//main method  
public static void main(String args[])   
{   
int n = 25;   
//calling method and prints the sum  
System.out.println("Sum of Natural Numbers is: "+naturalNumberSum(n));  
}    
}   