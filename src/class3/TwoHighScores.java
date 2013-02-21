/*******************************************************************************
* TwoHighScores.java
*===============================================================================
* Write a program that prompts the user to enter the number of students and each
* student's name and score, and finally displays the student with the highest
* score and the student with the second highest score.
*===============================================================================
* @author Chadd Klaus
* @date   Feb 13, 2013
*******************************************************************************/
package class3;

import java.util.Scanner;

/*******************************************************************************
* Two High Scores
*******************************************************************************/
public class TwoHighScores
  {
  /*****************************************************************************
  * Properties
  *****************************************************************************/
  protected Scanner        mScanner = new Scanner(System.in);
  protected int            mStudents;
  protected StudentScore[] mStudentScores;

  /*-----------*/
  /* Accessors */
  /*-----------*/
  /** Returns {@link mStudents}. */      public int            getStudentNumber() { return mStudents; }
  /** Returns {@link mStudentScores}. */ public StudentScore[] getStudentScores() { return mStudentScores; }
  
  /*****************************************************************************
  * nextScore */
  /**
  * Get the next student name and score.
  * 
  * @param  index  Index of the next student. This should be supplied by a loop
  *                from the caller.
  *****************************************************************************/
  public void nextScore(int index)
    {
    String name;
    int    score;
    
    System.out.print("Student Name: ");
    name = mScanner.next();
    System.out.print("Score: ");
    score = mScanner.nextInt();
    
    mStudentScores[index] = new StudentScore(name, score);
    }
  
  /*****************************************************************************
  * setStudents */
  /**
  * Sets the number of participating students.
  *****************************************************************************/
  public void setStudents()
    {
    System.out.println("How many students participated?");
    mStudents = mScanner.nextInt();
    mStudentScores = new StudentScore[mStudents];
    }
  
  /*****************************************************************************
  * Driver
  *****************************************************************************/
  public static void main (String[] args)
    {
    TwoHighScores ths = new TwoHighScores();
    ths.setStudents();

    /*-------------------------------------------------------*/
    /* Continue getting scores until we have all the scores. */
    /*-------------------------------------------------------*/
    for (int i = 0; i < ths.getStudentNumber(); i++)
      ths.nextScore(i);

    /*-----------------------------------*/
    /* Figure out the two highest scores */
    /*-----------------------------------*/
    StudentScore ss1 = null;
    StudentScore ss2 = null;
    for (StudentScore student : ths.getStudentScores())
      {
      if (ss1 == null)
        ss1 = student;
      else if (student.score > ss1.score)
        {
        ss2 = ss1;
        ss1 = student;
        }
      else if (ss2 == null || student.score > ss2.score)
        ss2 = student;
      }
    
    System.out.printf("Top 2 Students\n1)%s: %2d\n2)%s: %2d", ss1.name, ss1.score, ss2.name, ss2.score);
    }
  
  /*****************************************************************************
  * Class: StudentScore
  *****************************************************************************/
  public class StudentScore
    {
    /***************************************************************************
    * Properties
    ***************************************************************************/
    public String name;
    public int    score;
    
    /***************************************************************************
    * Constructor
    ***************************************************************************/
    public StudentScore(String name, int score)
      {
      this.name  = name;
      this.score = score;
      }
    }
  }
