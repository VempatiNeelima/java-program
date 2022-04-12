//Write a Java program to input any alphabet and check whether it is vowel or consonant
  import java.util.Scanner;
public class VowelOrConsonant {

    public static void main(String[] args) {

        char ch = 'p';

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }
}