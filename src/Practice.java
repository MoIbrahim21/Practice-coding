import java.util.Scanner;

/**
 * 
 * @author mibrahim21
 *
 */
public class Practice {

	public static void main(String[] args) 
	{	//printing
		System.out.print("I know how to print.");
		
		// printing the value of a variable
		int number = 2; // declared
		number = 10; // initializing --> first assignment
		
		double decimal = 3.75; //declared and initialized in one line 
		
		String str = " something can go here";// declared and initialized a string variable 
		
		// print the value of each 
		
		System.out.println("\n" + number);// if you want it to be a variable don't use quotes
		// in order to create a back slash n with the varibale need to use the + sign 
		System.out.println(decimal);
		System.out.println(str);
		
		number = number + 30;
		decimal = decimal - 25.012345;
		str = "more stuff" + str; 
		
		System.out.println(" number:  " + number);
		System.out.println("Decimal:  " + decimal);
		System.out.println("str:  " + str);
		
		Scanner mo = new Scanner(System.in); // created a scanner for input
		
		String sports;
		System.out.print("\n Please enter your favorite sport:  ");
		System.out.print(" My favorite is:  ");
		String fav = mo.nextLine();
		
		
				
		
				
		
		
		
		
		
		
				
		
		
		
		
		

	}

}
