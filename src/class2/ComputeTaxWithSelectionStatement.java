/*******************************************************************************
* ComputeTaxWithSelectionStatement.java
*===============================================================================
* @author Chadd Klaus
* @date   Feb 2, 2013
*******************************************************************************/
package class2;

import java.math.BigDecimal;

import javax.swing.JOptionPane;

/*******************************************************************************
* Compute Tax With Selection Statement
*******************************************************************************/
public class ComputeTaxWithSelectionStatement
  {
  /*****************************************************************************
  * Properties
  *****************************************************************************/
  protected int mBracket1 = 0;
  protected int mBracket2 = 0;
  protected int mBracket3 = 0;
  protected int mBracket4 = 0;
  protected int mBracket5 = 0;
  
  /*****************************************************************************
  * main */
  /**
  * Driving method.
  *****************************************************************************/
  public static void main (String[] args)
    {
    int    status;
    double income;
    double tax = 0;

    /*---------------------------------------*/
    /* Get the filing status and the income. */
    /*---------------------------------------*/
    status = Integer.parseInt(JOptionPane.showInputDialog("Enter the filing status\n\n" +
                                                          "0-Single Filer\n" +
                                                          "1-Married Jointly\n" +
                                                          "2-Married Separately\n" +
                                                          "3-Head of Household"));
    income = Double.parseDouble(JOptionPane.showInputDialog("Enter the taxable income: "));

    /*--------------*/
    /* Get the tax. */
    /*--------------*/
    switch (status)
      {
      case 0  : tax = new Single()           .getTax(income); break;
      case 1  : tax = new MarriedJointly()   .getTax(income); break;
      case 2  : tax = new MarriedSeparately().getTax(income); break;
      case 3  : tax = new HeadOfHousehold()  .getTax(income); break;
      default : System.out.println("Error: Invalid Status");
      }
    
    JOptionPane.showMessageDialog(null, String.format("Tax is %.2f (using brackets from 2002)",
                                                      new BigDecimal(tax).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue()));
    }
  
  /*****************************************************************************
  * getTax */
  /**
  * Calculates personal income tax based on <b>status</b> and the amount of
  * taxable <b>income</b>
  * 
  * @param  income  Taxable Income
  *****************************************************************************/
  public double getTax(double income)
    {
    double tier1 =                         Math.min(income, mBracket1)              * 0.10;
    double tier2 = (income > mBracket1 ? ((Math.min(income, mBracket2) - mBracket1) * 0.15)  : 0);
    double tier3 = (income > mBracket2 ? ((Math.min(income, mBracket3) - mBracket2) * 0.27)  : 0);
    double tier4 = (income > mBracket3 ? ((Math.min(income, mBracket4) - mBracket3) * 0.30)  : 0);
    double tier5 = (income > mBracket4 ? ((Math.min(income, mBracket5) - mBracket4) * 0.35)  : 0);
    double tier6 = (income > mBracket5 ? ((         income             - mBracket5) * 0.386) : 0);
    
    return tier1 + tier2 + tier3 + tier4 + tier5 + tier6;
    }
  
  /*****************************************************************************
  * Class: Single
  *****************************************************************************/
  public static class Single extends ComputeTaxWithSelectionStatement
    {
    public Single()
      {
      super();
      
      mBracket1 = 6000;
      mBracket2 = 27950;
      mBracket3 = 67700;
      mBracket4 = 141250;
      mBracket5 = 307050;
      }
    }
  
  /*****************************************************************************
  * Class: MarriedJointly
  *****************************************************************************/
  public static class MarriedJointly extends ComputeTaxWithSelectionStatement
    {
    public MarriedJointly()
      {
      mBracket1 = 12000;
      mBracket2 = 46700;
      mBracket3 = 112850;
      mBracket4 = 171950;
      mBracket5 = 307050;
      }
    }
  
  /*****************************************************************************
  * Class: MarriedSeparately
  *****************************************************************************/
  public static class MarriedSeparately extends ComputeTaxWithSelectionStatement
    {
    public MarriedSeparately()
      {
      mBracket1 = 6000;
      mBracket2 = 23350;
      mBracket3 = 56425;
      mBracket4 = 85975;
      mBracket5 = 153525;
      }
    }
  
  /*****************************************************************************
  * Class: HeadOfHousehold
  *****************************************************************************/
  public static class HeadOfHousehold extends ComputeTaxWithSelectionStatement
    {
    public HeadOfHousehold()
      {
      mBracket1 = 10000;
      mBracket2 = 37450;
      mBracket3 = 96700;
      mBracket4 = 15600;
      mBracket5 = 307050;
      }
    }
  }
