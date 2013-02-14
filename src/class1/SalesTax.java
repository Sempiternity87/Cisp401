/*******************************************************************************
* SalesTax.java
*===============================================================================
* @author Chadd Klaus
* @date   Jan 30, 2013
*******************************************************************************/
package class1;

import java.util.Scanner;
/*******************************************************************************
* Sales Tax
*******************************************************************************/
public class SalesTax
  {
  public static void main(String[] args)
    {
    /***************************************************************************
    * Properties
    ***************************************************************************/
    Scanner input = new Scanner(System.in);
    double  purchaseAmount;
    double  tax;
    
    System.out.print("Enter purchase amount: ");
    purchaseAmount = input.nextDouble();
    input.close();
    
    tax = purchaseAmount * 0.06;
    System.out.println("Sales tax is $" + (int)(tax*100)/100.0);
    }
  }
