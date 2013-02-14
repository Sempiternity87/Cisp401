/*******************************************************************************
* ShowCurrentTime.java
*===============================================================================
* @author Chadd Klaus
* @date   Jan 30, 2013
*******************************************************************************/
package class1;

/*******************************************************************************
* Show Current Time
*******************************************************************************/
public class ShowCurrentTime
  {
  public static void main (String[] args)
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
  }
