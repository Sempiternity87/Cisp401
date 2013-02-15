/*******************************************************************************
* ForecastTuition.java
* ==============================================================================
* Suppose that the tuition for university is 10,000 dollars this year increases
* 5 percent every year. Write a program that computes the tuition in 10 years
* and the total cost of 4 years worth of tuition starting 10 years from now.
* ==============================================================================
* @author Chadd Klaus
* @date   Feb 13, 2013
*******************************************************************************/
package class3;

import javax.swing.JOptionPane;

/*******************************************************************************
* Forecast Tuition
*******************************************************************************/
public class ForecastTuition
  {
  /*****************************************************************************
  * Constants
  *****************************************************************************/
  public static final const double TUITION    = 10000;
  public static final const double PERCENTAGE = 0.05;
  
  /*****************************************************************************
  * Properties
  *****************************************************************************/
  public double currentTuition = TUITION;
  public int    currentYear;
  
  /*****************************************************************************
  * totalPayment */
  /**
  * Calculates the total tuition to be paid in a four year stay.
  *****************************************************************************/
  public double totalPayment()
    {
    double totalPayment = 0;
    for (int i = 0; i < 4; i++)
      {
      totalPayment += currentTuition;
      nextYear();
      }
    
    return totalPayment;
    }
  
  /*****************************************************************************
  * nextYear */
  /**
  * Calculate the tuition for the next year and save that as the
  * <i>currentTuition</i>. Increase the <i>currentYear</i>
  *****************************************************************************/
  public void nextYear()
    {
    currentTuition = currentTuition * (1+PERCENTAGE);
    currentYear++;
    }
  
  /*****************************************************************************
  * Driver
  *****************************************************************************/
  public static void main (String[] args)
    {
    currentYear = Integer.parseInt(JOptionPane.showInputDialog("What year is it?"));
    ForecastTuition ft = new ForecastTuition();
    
    for (int i = 0; i < 10; i++)
      ft.nextYear();
    
    JOptionPane.showMessageDialog(String.format("The tuition will be $%.2f in the year %d.",
                                                ft.currentTuition, ft.currentYear));
    JOptionPane.showMessageDialog(String.format("The total payment for a four year stay will be %.2f", ft.totalPayment());
    }
  }
