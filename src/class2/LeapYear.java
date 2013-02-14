/******************************************************************************
* LearpYear.java
* 
* @author Chadd Klaus
* @date   1/31/2013
******************************************************************************/
package class2;

import java.util.Scanner;

/******************************************************************************
* Leap Year
******************************************************************************/
public class LeapYear
  {
  public static void main (String[] args)
    {
    /**************************************************************************
    * Properties
    **************************************************************************/
    Scanner input = new Scanner(System.in);
    int     year;
    boolean isLeapYear;
    
    System.out.print("Enter a year: ");
    year = input.nextInt();
    
    isLeapYear = (year % 4 == 0 && year % 100 != 0) || (  year % 400 == 0);
    
    System.out.println(String.format("%d is a leap year? %s",
                                     year, String.valueOf(isLeapYear)));
    }
  }