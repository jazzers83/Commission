/**
 *
 * @author ejaazali
 */

import java.util.Scanner;
public class Person
{
   private String FirstName;                     
   private String LastName;  
    
   public void SetFirstName(String firstName)
   {
      FirstName = firstName; // Store the First Name
   }
   
   public void SetLastName(String lastName)
   {
      LastName = lastName; // Store the Last Name
   }
   public static void main ( String [] args)
   {
      Scanner input = new Scanner(System.in);         
      System.out.println("Hello, World! I am new to programming.");
      
      // Get the person's first name    
      System.out.println("What is the your first name?");
      Person.SetFirstName(input.nextLine());
      
      // Get the persons last name
      System.out.println("What is your last name?");
      Person.SetLastName(input.nextLine());      
   }
}
