/*******************************************************************************
* SubtractionTutor.java
*===============================================================================
* @author Chadd Klaus
* @date   Feb 7, 2013
*******************************************************************************/
package class2;

import javax.swing.JOptionPane;

/*******************************************************************************
* Subtraction Tutor
*******************************************************************************/
public class SubtractionTutor
  {
  public static void main(String[] args)
    {
    /***************************************************************************
    * Properties
    ***************************************************************************/ 
    int    number1;
    int    number2;
    int    max;
    int    min;
    int    correctAnswer;
    int    answer;
    String answerString;
    String replyString;
    
    /*---------------------*/
    /* Initialize numbers. */
    /*---------------------*/
    number1 = (int)(Math.random() * 10);
    number2 = (int)(Math.random() * 10);
    
    /*------------------------------*/
    /* Find the min and max values, */
    /* and get the correct answer.  */
    /*------------------------------*/
    max           = Math.max(number1, number2);
    min           = Math.min(number1, number2);
    correctAnswer = max - min;
    
    /*------------------------*/
    /* Get the user response. */
    /*------------------------*/
    answerString = JOptionPane.showInputDialog(String.format("What is %d - %d?", max, min));
    answer       = Integer.parseInt(answerString);
    
    /*-------------------*/
    /* Grade the answer. */
    /*-------------------*/
    replyString  = correctAnswer == answer ? "You are correct!"
                                           : String.format("Your answer is wrong.\n%d - %d should be %d",
                                                           max, min, correctAnswer);
    JOptionPane.showMessageDialog(null, replyString);
    }
  }
