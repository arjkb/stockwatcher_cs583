package com.google.gwt.sample.stockwatcher.client;

import java.util.ArrayList;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.ui.Button;

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
  
  
  

}
