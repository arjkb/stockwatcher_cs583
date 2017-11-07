package com.google.gwt.sample.stockwatcher.client;

import com.google.gwt.junit.client.GWTTestCase;

public class StockPriceTest extends GWTTestCase {

	@Override
	public String getModuleName() {
		// TODO Auto-generated method stub
		return "com.google.gwt.sample.stockwatcher.StockWatcher";
	}
	
	public void testSimple()	{
		assertTrue(true);
	}
	
	// positive test case -- Arjun Krishna Babu
	public void testConstructor()	{
		StockPrice sp = new StockPrice("foo",10.0,2.0);
		
		assertEquals("foo", sp.getSymbol());
		assertEquals(10.0, sp.getPrice(), 0);
		assertEquals(2.0, sp.getChange(), 0);
	}
	
	// positive test case -- Arjun Krishna Babu
	public void testChangePercent()	{
		StockPrice sp = new StockPrice();
		
		sp.setPrice(10.0);
		sp.setChange(2.0);
		assertEquals(20.0, sp.getChangePercent(), 0);
		
		sp.setPrice(60.0);
		sp.setChange(15.0);
		assertEquals(25.0, sp.getChangePercent(), 0);
		
		sp.setPrice(10.0);
		sp.setChange(-5.0);
		assertEquals(-50.0, sp.getChangePercent(), 0);
	}

}
