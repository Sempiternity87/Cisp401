/*******************************************************************************
* AdditionTutor.java
*===============================================================================
* @author Chadd Klaus
* @date   Feb 2, 2013
*******************************************************************************/
package class2;

import javax.swing.JOptionPane;

/*******************************************************************************
* Addition Tutor
*******************************************************************************/
public class AdditionTutor
  {
  public static void main (String[] args)
    {
    /***************************************************************************
    * Properties
    ***************************************************************************/
    int    number1, number2, answer;
    String answerString;
    
    number1 = (int)(System.currentTimeMillis() % 10);
    number2 = (int)(System.currentTimeMillis() * 7 % 10);
    
    answerString = JOptionPane.showInputDialog(String.format("What is %d + %d? ", number1, number2));
    
    answer = Integer.parseInt(answerString);
    
    JOptionPane.showMessageDialog(null, String.format("%d + %d = %d is %b", number1, number2, answer, (number1 + number2 == answer)));
    }
  }
