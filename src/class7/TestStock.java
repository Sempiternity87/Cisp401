/*******************************************************************************
* TestStock.java
*===============================================================================
* @author Chadd Klaus
* @date   Mar 14, 2013
*******************************************************************************/
package class7;

/*******************************************************************************
* Test Stock
*******************************************************************************/
class TestStock
  {
  /*****************************************************************************
  * main */
  /**
  * Driver
  *****************************************************************************/
	public static void main(String[] args)
	  {
    /*--------------------*/
	  /* Create the stocks. */
	  /*--------------------*/
		Stock myStock1 = new Stock("es", "S&P500 emini");
		Stock myStock2 = new Stock("ORCL", "Oracle Corporation");

    /*----------------------------*/
		/* Set prices for the stocks. */
		/*----------------------------*/
		myStock1.setPreviousClosePrice(1534);
		myStock1.setCurrentPrice(1555);
		myStock2.setPreviousClosePrice(34.5);
		myStock2.setCurrentPrice(34.35);

    /*--------------------------------*/
		/* Display the stock information. */
		/*--------------------------------*/
		myStock1.printStock();
		myStock2.printStock();
  	}
  }