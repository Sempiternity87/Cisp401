/*******************************************************************************
* ComputeLoan.java
*===============================================================================
* @author Chadd Klaus
* @date   Jan 30, 2013
*******************************************************************************/
package class1;

import java.math.BigDecimal;
import java.util.Scanner;

/*******************************************************************************
* Compute Load
*******************************************************************************/
public class ComputeLoan
  {
  public static void main(String[] args)
    {
    /***************************************************************************
    * Properties
    ***************************************************************************/
    Scanner input = new Scanner(System.in);
    double  annualInterestRate;
    double  principal;
    double  rate;
    int     time;
    int     numberOfYears;
    double  monthlyPayment;
    double  totalPayment;

    /*----------------------*/
    /* Retrieve user input. */
    /*----------------------*/
    System.out.print("Enter annual interest rate, e.g., 7.25% ");
    annualInterestRate = input.nextDouble();
    
    System.out.print("enter number of years as an integer, e.g., 5: ");
    numberOfYears = input.nextInt();
    
    System.out.print("Enter loan amount, e.g., 120000.95: ");
    principal = input.nextDouble();
    
    input.close();

    /*--------------------------------------*/
    /* Get the rate as a decimal per month. */
    /*--------------------------------------*/
    rate = annualInterestRate / 1200;
    time = numberOfYears * 12;
    
    monthlyPayment      = principal * rate / (1 - (1 / Math.pow(1 + rate, time)));
    totalPayment        = monthlyPayment * time;
    
    System.out.println(String.format(
        "The monthly payment is $%.2f\n" +
    		"The total payment is $%.2f",
    		new BigDecimal(monthlyPayment).setScale(2, BigDecimal.ROUND_FLOOR).doubleValue(),
    		new BigDecimal(totalPayment)  .setScale(2, BigDecimal.ROUND_FLOOR).doubleValue()));
    }
  }
