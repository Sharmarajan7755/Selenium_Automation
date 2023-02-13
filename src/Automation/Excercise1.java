package Automation;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Q. Write a method named isNumeric(String s) that returns true if the given string argument is an integer, otherwise returns false.  
 *    And write the tests for it. For example: isNumeric("123") should return true.
 *    
 *    --implement isNumeric(String s)
 *    --write test methods (use dataprovider)
 *    --identify test inputs
 *    
 */

public class Excercise1 {

	boolean isNumeric(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}

	@DataProvider(name = "data")
	Object[][] data() {
		return new Object[][] {

				{ "123" },
				{ "-122323" } 
		};
	}
	 
	@Test(dataProvider = "data")
	void isNumericTest(String input) {
		Assert.assertTrue(isNumeric(input));
	}
	

	@DataProvider(name = "Negative-data")
	Object[][] invalidData() {
		return new Object[][] {

				{"abc"},
				{"122abc"},
				{""},
				{"21474836479"},
				{"123.23"},
				
		};
	}
	 
	@Test(dataProvider = "Negative-data")
	void isNumericNegativeTest(String input) {
		Assert.assertFalse(isNumeric(input));
	}


}
