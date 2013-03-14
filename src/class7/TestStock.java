package class7;

class TestStock {
/**Tests exercise 8.2 on p.330. */
	public static void main(String[] args) {
		Stock myStock1 = new Stock("es", "S&P500 emini");
		Stock myStock2 = new Stock("ORCL", "Oracle Corporation");

		myStock1.setPreviousClosePrice(1534);
		myStock1.setCurrentPrice(1555);

		myStock2.setPreviousClosePrice(34.5);
		myStock2.setCurrentPrice(34.35);

		myStock1.printStock();	//		es	S&P500 emini	-1.3689700130378095%
		myStock2.printStock();	//		ORCL	Oracle Corporation	0.434782608695648%
	}

}