import java.util.Scanner;
public class Person 
{

 public static void main(String args[])
   {
      String name;
      Scanner in = new Scanner(System.in);
 
      System.out.println("Hello, World! I am new to programming");
      System.out.println("What is your name?");
      name = in.nextLine();
      System.out.println("You entered the name "+name);
   }
}