/*******************************************************************************
* Stock.java
*===============================================================================
* Follow the example of the Circle class we saw last week. Create a Stock class,
* which contains:
* 
* - A string variable named symbol containing the stock's symbol.
* - A string variable called name containing the stock's name.
* - A double variable called previousClosingPrice the stores the price for the
*   previous day.
* - Another double variable called currentPrice containing the current stock price.
* - A constructor that creates a stock with the specified symbol and name.
* - A method named getChangePercent that returns the percentage difference between
*   the previous and current price.
* - Any other variables and methods you deem necessary.
* 
* Draw a UML diagram and then implement the class. Write a test program that
* creates a Stock object with the symbol ORCL, name Oracle Cororation, previous
* close of 34.5 and current price of 34.35. Display the price change as a
* percentage.
* 
* I have included my test program, you can modify it as you like. Note: it has
* useful test data. Please ignore my comments - I know they are terrible, do a
* better job than I did.
* 
* Turn in your Stock class and your test program.
*===============================================================================
* @author Chadd Klaus
* @date   Mar 14, 2013
*******************************************************************************/
package class7;

/*******************************************************************************
* Stock
*******************************************************************************/
public class Stock
  {
  /*****************************************************************************
  * Properties
  *****************************************************************************/
  /** Symbol. */                 protected String mSymbol;
  /** Name. */                   protected String mName;
  /** Previous Closing Price. */ protected double mPreviousClosingPrice;
  /** Current Price. */          protected double mCurrentPrice;
  
  /*****************************************************************************
  * Constructor
  *****************************************************************************/
  public Stock(String symbol, String name)
    {
    mSymbol = symbol;
    mName   = name;
    }
  
  /*****************************************************************************
  * getChangePercent */
  /**
  * Returns the percent change from the previous closing.
  *****************************************************************************/
  public double getChangePercent()
    {
    return (mPreviousClosingPrice - mCurrentPrice) / mPreviousClosingPrice * 100;
    }
  
  /*****************************************************************************
  * printStock */
  /**
  * Prints out the properties of the stock along with the percentage change of
  * the price.
  *****************************************************************************/
  public void printStock()
    {
    System.out.printf("%s\t%s\t%f%%\n", mSymbol, mName, getChangePercent());
    }
  
  /*****************************************************************************
  * setPreviousClosePrice */
  /**
  * Sets {@link #mPreviousClosingPrice}.
  *****************************************************************************/
  public void setPreviousClosePrice(double price)
    {
    mPreviousClosingPrice = price;
    }
  
  /*****************************************************************************
  * setCurrentPrice */
  /**
  * Sets {@link #mCurrentPrice}.
  *****************************************************************************/
  public void setCurrentPrice(double price)
    {
    mCurrentPrice = price;
    }
  }
