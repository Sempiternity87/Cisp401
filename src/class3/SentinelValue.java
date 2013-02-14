/*******************************************************************************
* SentinelValue.java
*===============================================================================
* @author Chadd Klaus
* @date   Feb 13, 2013
*******************************************************************************/
package class3;

import java.util.Scanner;

/*******************************************************************************
* Sentinel Value
*******************************************************************************/
public class SentinelValue
  {
  /*****************************************************************************
  * Driver
  *****************************************************************************/
  public static void main (String[] args)
    {
    Scanner input = new Scanner(System.in);
    int     data  = 0;
    int     sum   = 0;

    /*--------------------------------------------------------------*/
    /* Continue executing until we are given the termination value. */
    /*--------------------------------------------------------------*/
    do
      {
      sum += data;
      
      System.out.println("Enter an integer (the input ends if it is 0): ");
      data = input.nextInt();
      }
    while (data != 0);
    
    input.close();
    System.out.printf("The sum is %d.", sum);
    }
  }
