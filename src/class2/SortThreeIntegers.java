/*******************************************************************************
* SortThreeIntegers.java
* ==============================================================================
* Write a program that sorts three integers. The integers are entered from input
* dialogs and stored in variables num1, num2, and num3, respectively. The
* program sorts the numbers from smallest to largest. You may use the gui or the
* console if you wish.
* 
* Professor Note
* 3.8* p.123 - I think this is what the author means, but is not what he said.
*******************************************************************************/
package class2;

import javax.swing.JOptionPane;

public class SortThreeIntegers
  {
  /*****************************************************************************
  * Driver
  *****************************************************************************/
  public static void main(String[] args)
    {
    /***************************************************************************
    * Properties
    ***************************************************************************/
    int[]  input  = new int[3];
    String sortedString = "";
    
    /*----------------*/
    /* Get the input. */
    /*----------------*/
    for (int i = 0; i < 3; i++)
      input[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter an Integer"));
    
    input = sort(input);
    
    for (int i = 0; i < input.length; i++)
      sortedString += (i > 0 ? ", " : "") + input[i];
    
    JOptionPane.showMessageDialog(null, sortedString);
    }
  
  /*****************************************************************************
  * sort */
  /**
  * Split Sort. Recursion.
  *****************************************************************************/
  protected static int[] sort(int[] arr)
    {
    int[] split1 = new int[new Integer(arr.length/2).intValue()];
    int[] split2 = new int[arr.length - split1.length];
    int   i      = 0;
    int   j      = 0;
    int   k      = 0;
    
    /*---------------------------------------------------*/
    /* If there is only one value in the array, then it  */
    /* is, by nature, already sorted.  If there are two, */
    /* we can easily sort this array and return it.      */
    /*---------------------------------------------------*/
    if (arr.length == 1) return arr;
    if (arr.length == 2)
      if (arr[1] < arr[0])
        {
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
        return arr;
        }
    
    /*--------------------------*/
    /* Split the array in half. */
    /*--------------------------*/
    for (; i < split1.length; i++)   split1[i] = arr[i];
    for (; i < arr.length; i++, j++) split2[j] = arr[i];
    
    /*----------------------------*/
    /* Split/merge each of these. */
    /*----------------------------*/
    split1 = sort(split1);
    split2 = sort(split2);
    
    /*-----------------------*/
    /* Merge the two arrays. */
    /*-----------------------*/
    arr = new int[split1.length+split2.length];
    j   = 0;
    for (i = 0; i < arr.length; i++)
      {
      /*--------------------------------------------------------------*/
      /* First check that we won't have an IndexOutOfBoundsException. */
      /* If we have reached the end of one but not the other, then    */
      /* the value available in the other is our last value.          */
      /*--------------------------------------------------------------*/
      if (split1.length > j && split2.length > k)
        arr[i] = split1[j] < split2[k] ? split1[j++] : split2[k++];
      else if (j >= split1.length)
        arr[i] = split2[k++];
      else
        arr[i] = split1[j++];
      }
    
    return arr;
    }
  }