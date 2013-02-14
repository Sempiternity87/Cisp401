/*******************************************************************************
* ComputeChange.java
*===============================================================================
* @author Chadd Klaus
* @date   Jan 30, 2013
*******************************************************************************/
package class1;

import java.util.Scanner;
/*******************************************************************************
* Compute Change
*******************************************************************************/
public class ComputeChange
  {
  public static void main(String[] args)
    {
    /*****************************************************************************
    * Properties
    *****************************************************************************/
    Scanner input = new Scanner(System.in);
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
    input.close();

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
  }
