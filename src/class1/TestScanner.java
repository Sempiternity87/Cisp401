/*******************************************************************************
* TestScanner.java
*===============================================================================
* @author Chadd Klaus
* @date   Jan 30, 2013
*******************************************************************************/
package class1;

import java.util.Scanner;
/*******************************************************************************
* Test Scanner
*******************************************************************************/
public class TestScanner
  {
  public static void main(String[] args)
    {
    /***************************************************************************
    * Properties
    ***************************************************************************/
    Scanner scanner = new Scanner(System.in);
    int     intValue;
    double  doubleValue;
    String  string;
    
    System.out.print("Enter an integer: ");
    intValue = scanner.nextInt();
    System.out.println("You entered the integer " + intValue);
    
    System.out.print("Enter a double value: ");
    doubleValue = scanner.nextDouble();
    System.out.println("You entered the double " + doubleValue);
    
    System.out.print("Enter a String without a space: ");
    string = scanner.next();
    System.out.println("You entered the string " + string);
    
    scanner.close();
    }
  }
