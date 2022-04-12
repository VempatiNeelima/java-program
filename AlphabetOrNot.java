//Write a Java program to check whether a character is alphabet or not
  public class AlphabetOrNot {

    public static void main(String[] args) {

        char c = 'a';

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");
    }
}