/*******************************************************************************
* FindNearestPoints.java
*===============================================================================
* @author Chadd Klaus
* @date   Feb 27, 2013
*******************************************************************************/
package class5;

import java.util.Scanner;

/*******************************************************************************
* Find Nearest Points
*******************************************************************************/
public class FindNearestPoints
  {
  /*****************************************************************************
  * main */
  /**
  * Driver
  *****************************************************************************/
  public static void main (String[] args)
    {
    /***************************************************************************
     * Properties
     **************************************************************************/
    Scanner    input = new Scanner(System.in);
    int        numberOfPoints;
    int        p1 = 0;
    int        p2 = 0;
    double     distance;
    double     shortestDistance;
    double[][] points;

    /*------------------------------*/
    /* Set the length of the array. */
    /*------------------------------*/
    System.out.print("Enter a number of points: ");
    points = new double[numberOfPoints = input.nextInt()][2];

    /*----------------------------------*/
    /* Enter the points into the array. */
    /*----------------------------------*/
    System.out.printf("Enter %d points: ", numberOfPoints);
    for (int i = 0; i < points.length; i++)
      {
      points[i][0] = input.nextDouble();
      points[i][1] = input.nextDouble();
      }
    input.close();

    /*-----------------------------*/
    /* Find the shortest distance. */
    /*-----------------------------*/
    p1 = 0;
    p2 = 1;
    shortestDistance = distance(points[p1][0], points[p1][1],
                                points[p2][0], points[p2][1]);
    
    /*-------------------------------------------*/
    /* Loop through each of the pairs and        */
    /* evaluate the distance from another point. */
    /*-------------------------------------------*/
    for (int i = 0; i < points.length; i++)
      for (int j = i + 1; j < points.length; j++)
        {
        distance = distance(points[i][0], points[i][1],
                            points[j][0], points[j][1]);

        /*---------------------------------------------------*/
        /* Save the current points as the shortest distance. */
        /*---------------------------------------------------*/
        if (shortestDistance > distance)
          {
          p1 = i;
          p2 = j;
          shortestDistance = distance;
          }
        }

    /*---------------------------------*/
    /* Display the two closest points. */
    /*---------------------------------*/
    System.out.printf("The closest two points are (%f, %f) and (%f, %f)\n",
                      points[p1][0], points[p1][1], points[p2][0], points[p2][1]);
    }
  
  /*****************************************************************************
  * distance */
  /**
  * Calculates the distance between the two points using Pythagoreon's
  * Theorem.
  *****************************************************************************/
  public static double distance(double x1, double y1, double x2, double y2)
    {
    return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
  }
