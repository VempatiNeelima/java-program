//Write a Java program to input any character and check whether it is alphabet, digit    or special character
import java.util.Scanner;
class AlDiorSc
{
 public static void main(String[] args) 
 {
  char ch;
  Scanner p=new Scanner(System.in);
  System.out.print("Enter any char : ");
  ch=p.next().charAt(0);
  if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
  {
   System.out.println(ch+" is an Alphabet");
  }
  else if(ch>='0'&&ch<='9')
  {
   System.out.println(ch+" is a Digit");
  }
  else
  {
   System.out.println(ch+" is a special Character");
  }
 }
}
