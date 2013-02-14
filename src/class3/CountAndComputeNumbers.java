/*******************************************************************************
* CountAndComputeNumbers.java
*===============================================================================
* @author Chadd Klaus
* @date   Feb 13, 2013
*******************************************************************************/
package class3;

import javax.swing.JOptionPane;

/*******************************************************************************
* Count And Compute Numbers
* 
* Write a program that reads an unspecified number of integers, determines how
* many positive and negative integers have been read, and computes the total
* average of the input value (not counting 0). Your program ends with the
* input 0. Display the average as a floating point number.
*******************************************************************************/
public class CountAndComputeNumbers
  {
  /*****************************************************************************
  * Properties
  *****************************************************************************/
  protected int mDivisor = 0;
  protected int mTotal   = 0;
  
  /*****************************************************************************
  * nextInt */
  /**
  * Takes input from the user.
  * 
  * @return  true=Valid input. false=Terminator entered.
  *****************************************************************************/
  public boolean nextInt()
    {
    int value = Integer.parseInt(JOptionPane.showInputDialog("Enter integer (0 to exit): "));
    
    if (value == 0)
      return false;
    
    mDivisor++;
    mTotal += value;
    
    return true;
    }
  
  /*****************************************************************************
  * showAvg */
  /**
  * Displays the average of the numbers entered. If <i>mDivisor</i> is 0, avoid
  * a DivideByZeroException by just displaying 0, otherwise calculate the
  * average and display it.
  *****************************************************************************/
  public void showAvg()
    {
    double average = 0.0;
    
    if (mDivisor > 0)
      average = ((double)mTotal / (double)mDivisor);
    
    JOptionPane.showMessageDialog(null, average);
    }
  
  /*****************************************************************************
  * Driver
  *****************************************************************************/
  public static void main (String[] args)
    {
    CountAndComputeNumbers count = new CountAndComputeNumbers();

    /*------------------------------------------------------*/
    /* Continue receiving input until the terminating value */
    /* is reached. Nothing is done in the body of the loop  */
    /* since the work is processed within the condition.    */
    /*------------------------------------------------------*/
    while(count.nextInt()) {}
    
    count.showAvg();
    }
  }
