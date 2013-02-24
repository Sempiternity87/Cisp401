/*******************************************************************************
* Pig.java
* ==============================================================================
* The game of Pig is a very simple jeopardy dice game in which two players race
* to reach 100 points. Each turn, a player repeatedly rolls a die until either a
* 1 is rolled or the player holds and scores the sum of the rolls (i.e. the turn
* total). At any time during a player's turn, the player is faced with two
* decisions:
* 
* roll - If the player rolls a
* 1:     the player scores nothing and it becomes the opponent's turn.
* 2 - 6: the number is added to the player's turn total and the player's turn
*        continues.
* hold:  The turn total is added to the player's score and it becomes the
*        opponent's turn.
* 
* Set your program up so a human and a computer can play together. Program a
* simple computer opponent, ie perhaps a rule 'always roll 3 times', 'roll a die
* and take that many rolls' or something like that. The human player goes first.
* You can use the console or the GUI, whichever you are most comfortable with.
* 
* Bragging Rights - You can do other things to make your program more
* interesting. Examples may be: a more sophisticated AI, very nice GUI, display
* probablility of winning for each roll, etc, etc. Depending upon how well done
* your enhancement(s) is(are) I will award a few bonus points. You don't need to
* do this to get an 'A' however. If you take advantage of this, include a
* comment section at the bottom of your code explaining what you've done.
* ==============================================================================
* @author Chadd Klaus
* @date   Feb 20, 2013
*******************************************************************************/
package class4;

import java.util.Scanner;
import java.util.Random;

/*******************************************************************************
* Pig
*******************************************************************************/
public class Pig
  {
  public static void main (String[] args)
    {
    Game game = new Game();
    game.start();
    }
  }

/*******************************************************************************
* Class: Game */
/**
* 
*******************************************************************************/
class Game
  {
  /*******************************************************************************
  * Constants
  *******************************************************************************/
  public static final String ROLL = "roll";
  public static final String HOLD = "hold";
  
  /*******************************************************************************
  * Properties
  *******************************************************************************/
  /** Current Players. */    protected Player[] mPlayers;
  /** Current Turn Score. */ protected int      mTurnScore;
  /** Input. */              protected Scanner  mInput = new Scanner(System.in);
  /** Current Turn. */       protected int      mTurn;
  
  /*-----------*/
  /* Accessors */
  /*-----------*/
  /** Current Player. */ public Player getCurrentPlayer() { return mPlayers[mTurn % 2]; }
  
  /*******************************************************************************
  * Constructor
  *******************************************************************************/
  public Game()
    {
    System.out.print("What's your name? ");
    mPlayers    = new Player[2];
    mPlayers[0] = new Player(mInput.nextLine(), true);
    mPlayers[1] = new Player("Computer");
    mTurnScore  = 0;
    mTurn       = 0;
    }
  
  /*******************************************************************************
  * checkForWinner */
  /**
  * 
  *******************************************************************************/
  public boolean checkForWinner()
    {
    for (Player p : mPlayers)
      if (p.score >= 100)
        return true;
    
    return false;
    }
  
  /*******************************************************************************
  * endTurn */
  /**
  * The turn has ended so we need to add the turn score to the current player
  * and reset the score.
  *******************************************************************************/
  public boolean endTurn()
    {
    getCurrentPlayer().score += mTurnScore;
    System.out.printf("\n%s finishes the turn, scoring %d, earning a total of %d\n",
                      getCurrentPlayer().name, mTurnScore, getCurrentPlayer().score);
    
    mTurnScore = 0;
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    
    if (checkForWinner())
      return true;
    
    mTurn++;
    return false;
    }
  
  /*******************************************************************************
  * rollDice */
  /**
  * 
  *******************************************************************************/
  public boolean rollDice()
    {
    int rolledNumber = new Random().nextInt(6) + 1;
    System.out.printf("and rolled a %d. ", rolledNumber);
    if (rolledNumber == 1)
      {
      mTurnScore = 0;
      return endTurn();
      }
    
    mTurnScore += rolledNumber;
    System.out.printf("Current Turn Total: %d\n", mTurnScore);
    return startTurn();
    }
  
  /*******************************************************************************
  * start */
  /**
  * 
  *******************************************************************************/
  public void start()
    {
    while (!startTurn()) {}
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.printf("%s is the winner!\n", getCurrentPlayer().name);
    System.out.printf(
        "            Name | Score\n" +
                    "%16s | %d\n" +
                    "%16s | %d", mPlayers[0].name, mPlayers[0].score, mPlayers[1].name, mPlayers[1].score);
    
    }
  
  /*******************************************************************************
  * startTurn */
  /**
  * Player makes decision to roll or hold.
  *******************************************************************************/
  public boolean startTurn()
    {
    boolean roll;
    
    //TODO move this decision to the Player class.
    if (getCurrentPlayer().human)
      {
      System.out.printf("Would you like to \"%s\" or \"%s\"? ", ROLL, HOLD);
      roll = mInput.next().equalsIgnoreCase(ROLL);
      }
    else
      {
      //TODO run through the ai.
      /*------------------------*/
      /* Computer is "thinking" */
      /*------------------------*/
      try { Thread.sleep(2000); }
      catch (InterruptedException e) { e.printStackTrace(); }
      
      roll = getCurrentPlayer().score + mTurnScore < 100;
      if (mTurnScore >= 10)
        roll = false;
      }
    
    System.out.printf("%s decided to %s ",
                      getCurrentPlayer().name, roll ? "roll" : "hold");
    if (roll) return rollDice();
    return endTurn();
    }
  }

/*******************************************************************************
* Class: Player */
/**
* 
*******************************************************************************/
class Player
  {
  /*******************************************************************************
  * Properties
  *******************************************************************************/
  /** Player is human flag. */ public boolean human;
  /** Player's name. */        public String  name;
  /** Player's total score. */ public int     score;
  
  /*******************************************************************************
  * Constructor */
  /**
  * 
  * 
  * @param name
  *******************************************************************************/
  public Player(String name) { this(name, false); }
  public Player(String name, boolean human)
    {
    this.human = human;
    this.name  = name;
    }
  }
