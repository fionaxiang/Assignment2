import java.util.Scanner;


public class WhileLoops {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username  ,password ;
		String x = "fionaliu";
		String y = "cl20879";
		Scanner keyboard = new Scanner(System.in);

		 System.out.println("Enter the username");
			username=keyboard.nextLine();
			System.out.println("Enter the password");
			password = keyboard.nextLine();
		while((username.equals(x))&&(password.equals(y)));
		{
			x = "fionaliu";
			y = "cl20879";
			username=keyboard.nextLine();
			password =keyboard.nextLine();
		}
		if((username.equals(x))&&(password.equals(y)))
		       System.out.println("Welcome" + username);
		       else
		       System.out.println("Enter the username and password again");
		       
		
	
}
}