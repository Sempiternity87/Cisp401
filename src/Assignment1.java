/*******************************************************************************
* Assignment1.java
*===============================================================================
* @author Chadd Klaus
* @date   Jan 30, 2013
*******************************************************************************/
import java.math.BigDecimal;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Assignment1
  {
  public static Scanner input = new Scanner(System.in);
  
  public static void main(String[] args)
    {
    welcomeInMessageDialogBox();
    System.out.println();
    salesTax();
    System.out.println();
    computeLoan();
    System.out.println();
    computeChange();
    System.out.println();
    showCurrentTime();
    System.out.println();
    testScanner();
    
    input.close();
    }
  
  /*****************************************************************************
  * welcomeInMessageDialogBox */
  /**
  * 
  *****************************************************************************/
  public static void welcomeInMessageDialogBox()
    {
    JOptionPane.showMessageDialog(null,  "Welcome to Java!");
    }
  
  /*****************************************************************************
  * salesTax */
  /**
  * 
  *****************************************************************************/
  public static void salesTax()
    {
    /***************************************************************************
    * Properties
    ***************************************************************************/
    double  purchaseAmount;
    double  tax;
    
    System.out.print("Enter purchase amount: ");
    purchaseAmount = input.nextDouble();
    
    tax = purchaseAmount * 0.06;
    System.out.println("Sales tax is $" + (int)(tax*100)/100.0);
    }

  /*****************************************************************************
  * computeLoan */
  /**
  * 
  *****************************************************************************/
  public static void computeLoan()
    {
    /***************************************************************************
    * Properties
    ***************************************************************************/
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

  /*****************************************************************************
  * computeChange */
  /**
  * 
  *****************************************************************************/
  public static void computeChange()
    {
    /***************************************************************************
    * Properties
    ***************************************************************************/
    int     dollars;
    int     quarters;
    int     dimes;
    int     nickels;
    int     pennies;
    double  amount;

    /*---------------------------------------------------------*/
    /* Get the amount and break it into the number of pennies. */
    /* Return the least number of each denomination to return. */
    /*---------------------------------------------------------*/
    System.out.print("Enter an amount, for example, 11.56: ");
    amount = input.nextDouble();

    /*---------*/
    /* Pennies */
    /*---------*/
    pennies = (int)(amount * 100);

    /*---------*/
    /* Dollars */
    /*---------*/
    dollars = pennies / 100;
    pennies = pennies % 100;

    /*----------*/
    /* Quarters */
    /*----------*/
    quarters = pennies / 25;
    pennies  = pennies % 25;

    /*-------*/
    /* Dimes */
    /*-------*/
    dimes   = pennies / 10;
    pennies = pennies % 10;

    /*---------*/
    /* Nickels */
    /*---------*/
    nickels = pennies / 5;
    pennies = pennies % 5;

    /*--------------------*/
    /* Print out results. */
    /*--------------------*/
    System.out.println(String.format("Your amount %.2f consists of \n" +
        "\t%d dollars\n"                                               +
        "\t%d quarters\n"                                              +
        "\t%d dimes\n"                                                 +
        "\t%d nickels\n"                                               +
        "\t%d pennies", amount, dollars, quarters, dimes, nickels, pennies));
    }

  /*****************************************************************************
  * showCurrentTime */
  /**
  * 
  *****************************************************************************/
  public static void showCurrentTime()
    {
    /***************************************************************************
    * Properties
    ***************************************************************************/
    long totalMilliseconds = System.currentTimeMillis();
    long totalSeconds      = totalMilliseconds / 1000;
    long currentSecond     = totalSeconds      % 60;
    long totalMinutes      = totalSeconds      / 60;
    long currentMinute     = totalMinutes      % 60;
    long totalHours        = totalMinutes      / 60;
    long currentHour       = totalHours        % 24;
    
    System.out.println(String.format("Current time is %d:%d:%d GMT", currentHour, currentMinute, currentSecond));
    }
  
  /*****************************************************************************
  * testScaanner */
  /**
  * 
  *****************************************************************************/
  public static void testScanner()
    {
    /***************************************************************************
    * Properties
    ***************************************************************************/
    int     intValue;
    double  doubleValue;
    String  string;
    
    System.out.print("Enter an integer: ");
    intValue = input.nextInt();
    System.out.println("You entered the integer " + intValue);
    
    System.out.print("Enter a double value: ");
    doubleValue = input.nextDouble();
    System.out.println("You entered the double " + doubleValue);
    
    System.out.print("Enter a String without a space: ");
    string = input.next();
    System.out.println("You entered the string " + string);
    }
  }
