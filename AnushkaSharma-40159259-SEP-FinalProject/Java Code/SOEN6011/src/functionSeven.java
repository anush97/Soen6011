import java.util.Scanner;

public class functionSeven {
	/**
	 * @author -  Anushka Sharma
	 * Implementation of Function 7 - (x) raised to the power y
	 */
  public static int iterations = 13;
  /**
 *Recursive Power Function.
 *Divide and Conquer Algorithm.
 *@param x,y
 *@return recursive
 */
  
  public static double basicPower(double x, int y) { // various cases
    if (y == 0) {
      return 1; 
    } else if (y % 2 == 0)  { // if exponent is even
      return basicPower(x, y / 2) * basicPower(x, y / 2); 
    } else {
      return x * basicPower(x, y / 2) * basicPower(x, y / 2); // if exponent is odd
    }
  }
  
 
  /**
 * Function to calculate factorial of a number.
 * 
 * @param number
 * @return fact
 */


  public static int factorial(int number) {
    int fact = 1;
    for (int i = 1; i <= number; i++) { 
      fact = fact * i; 
    } 
    return fact;
  }
  
  /**
 * Function to calculate power of base and exponent.
 * @param three double values - power, base,expo
 * @return the result of computation double value 
 */
  public static double decimalExp(double power, double baseValue, double expValue) {
    int iteration = iterations;
    float result = 1; 
    int fatorial;
    while (iteration > 0) {
      fatorial = factorial(iteration);
      result += basicPower(power, iteration) / fatorial;
      iteration--;
    }
    if (baseValue < 0) {
      return result * basicPower(-1.0, (int) expValue);
    }
    return result;
  }
  
  /**
 * Function to calculate log value of a number.
 * @input a double - number
 * @return result
 */
  
  public static double logN(double number) {
    if (number < 0)  {
      number = -number;
    }
    double modNum1 = number - 1;
    double modNum2 = number + 1;
    double mix = modNum1 / modNum2;
    double result = 0;
    int iteration = 100;
    while (iteration > 0) {
      if (iteration % 2 != 0) {
        result += basicPower(mix, iteration) / iteration;
      }
      iteration--;
    } 
    return result * 2;
  }
   /**
 * Main function with UI and function calling
 */
  public static double calculate(double baseValue, double exponentValue) {

	double result = 0;
    try {
			    	
			        if (baseValue == 0.0) {
			        	if (exponentValue == 0.0) {
			        		System.out.println("\nIndeterminate - \"0 raised to the power 0\"");
			        		result= 0;
			        	} else {
			        		System.out.println("0 to the power anything is 0");
			        		result= 0;
			        	}
				      } else {
				        result = decimalExp(exponentValue * logN(baseValue), baseValue, exponentValue);
				        if ((baseValue > 0 && baseValue < 20) && (exponentValue > 0 && exponentValue < 5)) {
				          System.out.println(result - (result % 1)); //floor function (scratch)
				        } else {
				          System.out.println((result));
				          
				        }
				      }
				    } catch (NumberFormatException e) {
				      System.out.println("Exception : Entered input is not a double value ");
				      result= 0;
				    }
	System.out.println(result);		
	return result;
  }
  public static void main(String[] args) {
	    double baseValue;
	    double exponentValue;
	    Scanner sc = new Scanner(System.in);
	    
	    
	    int i=0;
		System.out.println("------------Welcome to Function 7 - power function (x^y)------------");
		while(i!=2)
		{
			System.out.println("Menu: ");
			System.out.println("1. Proceed to power function");
			System.out.println("2. Exit");
			System.out.print("Please enter your option: ");
			i=Integer.parseInt(sc.nextLine());

			switch(i)
			{
				case 1:
				{
				    
				    	System.out.println("Enter the Base value:");
				        String base = sc.nextLine();
				        System.out.println("Enter the Exponent value:");
				        String exponent = sc.nextLine();
				        baseValue = Double.parseDouble(base);
				        exponentValue = Double.parseDouble(exponent);
				    	double ans = calculate(baseValue,exponentValue);
				    
				}
				case 2:
				{
					System.out.println("System will now exit");
					System.out.println("Thank you!!");
					System.exit(0);
					
					
				}
				default:
					System.out.println("Please enter either 1 or 2!");
					}
			}
		}
  }

