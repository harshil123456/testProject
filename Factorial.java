import java.util.Scanner;
/**
 *Factorial program takes an number from the user and calculates the factorial using tail recursion....
 */
public class Factorial {
	public static void main (String args[]) {
		int getNum;
		System.out.println("Enter the number to calculate factorial for:");
		Scanner num = new Scanner(System.in);
		getNum = num.nextInt();
		int factorialVal = factorial(getNum);
		System.out.println("Factorial is: "+ factorialVal);
	}
	/**
	 *factorial method recursively calculates the factorial.
	 *@param number the number for which factorial value is calculated
	 *@return the factorial calculated for the parameter number.
	 */
	public static int factorial (int number){
		if (number == 0) 
			return 1; //base condition
		else 
			return number*factorial(number-1); //recursive call
	}
}