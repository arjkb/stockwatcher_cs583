package com.google.gwt.sample.stockwatcher.client;

import com.google.gwt.junit.client.GWTTestCase;

/**
 * GWT JUnit tests must extend GWTTestCase.
 */
public class StockWatcherTest extends GWTTestCase {

  /**
   * Must refer to a valid module that sources this class.
   */
	
	StockWatcher sw;
  public String getModuleName() {
    return "com.google.gwt.sample.stockwatcher.StockWatcher";
  }
  
  @Override
	protected void gwtSetUp() throws Exception {
		// TODO Auto-generated method stub
		super.gwtSetUp();
		
		sw = new StockWatcher();
		sw.onModuleLoad();
		
	}
  
  @Override
	protected void gwtTearDown() throws Exception {
		// TODO Auto-generated method stub
		super.gwtTearDown();
		
		sw = null;
	}

  /**
   * Add as many tests as you like.
   */
  public void testSimple() {
    assertTrue(true);
  }
  
  // positive test case -- Arjun Krishna Babu
  public void testAddStock_validInp()	{
	  // ensure that stocks is initially empty
	  assertEquals(true, sw.stocks.isEmpty());
	  
	  String validItems[] = {
			  "A", 			// 1 character input
			  "ABCDEFGHIJ", // 10 character input
			  
			  "FOO10", 	// input with number at the end
			  "3KINGS", // input with number in the beginning
			  "H3LLO", 	// input with number in between
			  
			  ".COM", 		// input with dot at start
			  "SPACE.Z", 	// input with a dot in between
			  "HI." 		// input with dot at the end
			  };
	  
	  for (String item: validItems)	{
		  sw.newSymbolTextBox.setText(item);
		  sw.addStock();
	  }
	  
	  // ensure that stocks are no longer empty
	  assertEquals(false, sw.stocks.isEmpty());
	  
	  // ensure that there are expected number of items in stocks
	  assertEquals(validItems.length, sw.stocks.size());
	  
	  for (int i = 0; i < validItems.length; i++)	{
		  assertEquals(validItems[i], sw.stocks.get(i));
	  }
  }
  
  // negative test case -- Arjun Krishna Babu
  public void testAddStock_invalidInp()	{
	  assertEquals(true, sw.stocks.isEmpty());
	  
	  String invalidItems[]	=	{
			  "ABCDEFGHIJK", // 11 character inputs
			  "HELLO WORLD", // input with space
			  "HI!THERE"	 // input with invalid symbol 
	  };
	  
	  // attempt to add items to list
	  for (String item:invalidItems)	{
		  sw.newSymbolTextBox.setText(item);
		  sw.addStock();
	  }
	  
	  // ensure that stocks are still empty
	  assertEquals(true, sw.stocks.isEmpty());
  }

}
