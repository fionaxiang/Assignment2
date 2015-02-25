import java.util.Scanner;
/**
 * 
 * @author fiona
 *Purpose: Authenticate a user login for Username and Password
 */


public class User{
	  
	  public static void main(String [] args){
	    Scanner keyboard = new Scanner(System.in);
	    String username,password;
	      String x = "fionaliu";
	      String y = "cl20879";
	      
	      System.out.println("Enter the username");
	    username = keyboard.nextLine();
	      System.out.println("Enter the password");
	     password = keyboard.nextLine();
	      
	      if(username.equals(x))
	       System.out.println("Welcome" + username);
	       else
	       System.out.println("Wrong username or password");
	       if(password.equals(y))
	       System.out.println("Welcome" + username);
	       else 
	       System.out.println("Wrong username or password");
	       
	             }
	             }
//Pseudocode
//Flowchart
//Tools to write java application
//cl20879@nvcc.edu
		

