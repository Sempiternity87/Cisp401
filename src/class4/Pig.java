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

/*******************************************************************************
* Pig
*******************************************************************************/
public class Pig
  {
  
  
  /*****************************************************************************
  * Class: Game */
  /**
  * 
  *****************************************************************************/
  public class Game
    {
    
    }
  
  /*****************************************************************************
  * Class: Player */
  /**
  * 
  *****************************************************************************/
  public class Player
    {
    /***************************************************************************
    * Properties
    ***************************************************************************/
    /** Player is human flag. */ public boolean human;
    /** Player's name. */        public String  name;
    /** Player's total score. */ public int     score;
    
    /***************************************************************************
    * Constructor */
    /**
    * 
    * 
    * @param name
    ***************************************************************************/
    public Player(String name) { this(name, false); }
    public Player(String name, boolean human)
      {
      this.name = name;
      }
    }
  }
