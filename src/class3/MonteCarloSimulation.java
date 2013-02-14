/*******************************************************************************
* MonteCarloSimulation.java
*===============================================================================
* @author Chadd Klaus
* @date   Feb 13, 2013
*******************************************************************************/
package class3;

import java.util.Random;

/*******************************************************************************
* Monte Carlo Simulation
*******************************************************************************/
public class MonteCarloSimulation
  {
  /*****************************************************************************
  * Properties
  *****************************************************************************/
  public static final int NUMBER_OF_TRIALS = 10000000;
  
  /*****************************************************************************
  * Driver
  *****************************************************************************/
  public static void main (String[] args)
    {
    int    numberOfHits = 0;
    double x;
    double y;
    double pi;
    
    for (int i = 0; i < NUMBER_OF_TRIALS; i++)
      {
      x = Math.random() * 2.0 - 1;
      y = Math.random() * 2.0 - 1;
      
      if (Math.pow(x, 2) + Math.pow(y, 2) <= 1)
        numberOfHits++;
      }
    
    pi = 4.0 * numberOfHits / NUMBER_OF_TRIALS;
    System.out.printf("PI is %f", pi);
    }
  }
