package org.howard.edu.lsp.assignment5;

/**
 * @author stephaniepercy
 * 
 */

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.platform.launcher.TestPlan;

public class IntegerSetTest {

	private static final Object IntegerSet = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testIntegerSet() {
		assertNull("Not yet implemented");
	}

	@Test
	public void testClear() {
		IntegerSet set = new IntegerSet();
		
	       set.clear();
	       
	       assertEquals(0, 0);
	}

	@Test
	public void testLength() {
		
		IntegerSet set = new IntegerSet();
		
	       assertEquals(0, set.length());
	}

	@Test
	public void testEqualsIntegerSet() {
		IntegerSet set1 = new IntegerSet();
	       set1.add(10);
	       
	       set1.add(20);
	       
	       set1.add(30);
	       
	       IntegerSet set2 = new IntegerSet();
	       
	       set2.add(10);
	       
	       set2.add(20);
	       
	       set2.add(30);

	       assertEquals(true, set1.equals(set2));
	   }
		
	

	@Test
	public void testContains() {
		IntegerSet set1 = new IntegerSet();
		
	       set1.add(10);
	       
	       set1.add(20);
	       
	       set1.add(30);
	       
	       IntegerSet set2 = new IntegerSet();
	       
	       set2.add(10);
	       
	       set2.add(20);
	       
	       set2.add(30);

	       assertEquals(true, set1.equals(set2));
	   }
	
	@Test
	public void testContains2() {
	       IntegerSet set1 = new IntegerSet();
	       
	       set1.add(10);
	       
	       set1.add(20);
	       
	       set1.add(30);
	       
	       assertEquals(false, set1.contains(50));

	   }


	@Test
	public void testLargest() {
		 IntegerSet set1 = new IntegerSet();
		 
	       set1.add(10);
	       
	       set1.add(20);
	       
	       set1.add(30);
	       
	       set1.add(5);
	       
	       int expectedValue = 0;
	       
	       try {
	    	   
	           expectedValue = set1.largest();
	           
	       } catch (IntegerSetException e) {
	    	   
	           e.printStackTrace();
	       }
	       assertEquals(30, expectedValue);
	}
	@Test
	public void testLargest2() {
	      
	       IntegerSet set1 = new IntegerSet();
	       
	       int expectedValue = 0;
	       
	       try {
	           expectedValue = set1.largest();
	           
	       } catch (IntegerSetException e) {
	    	   
	           assertNull(e.getMessage());
	       }
	   }
	@Test
	public void testSmallest() {
		IntegerSet set1 = new IntegerSet();
		
	       set1.add(10);
	       
	       set1.add(20);
	       
	       set1.add(30);
	       
	       set1.add(5);
	       
	       int expectedValue = 0;
	       
	       try {
	           expectedValue = set1.smallest();
	           
	       } catch (IntegerSetException e) {
	           e.printStackTrace();
	       }
	       assertEquals(5, expectedValue);
	}
	 @Test
	 public void testSmallest2() {
	       
	       IntegerSet set1 = new IntegerSet();
	       
	       int expectedValue = 0;
	       
	       try {
	    	   
	           expectedValue = set1.smallest();
	           
	       } catch (IntegerSetException e) {
	    	   
	           assertNull(e.getMessage());
	       }
	   }
	@Test
	public void testAdd() {
		
		IntegerSet set1 = new IntegerSet();
		
	       set1.add(10);
	       
	       set1.add(20);
	       
	       set1.add(30);
	       
	       String expectedValue = "10 20 30 ";
	       
	       assertEquals(expectedValue, set1.toString());
	}
	
	

	@Test
	public void testRemove() throws IntegerSetException {
		 IntegerSet set1 = new IntegerSet();
		 
	       set1.add(10);
	       
	       set1.add(20);
	       
	       set1.add(30);
	       
	       set1.remove(20);
	       
	       String expectedValue = "10 30 ";
	       
	       assertEquals(expectedValue, set1.toString());
	}

	@Test
	public void testUnion() throws Exception {
		//TestedOn union = (TestedOn) new TestPlan(false);

	   // assertFalse(((Object) testUnion).isSetb());
	    
	    
	    //Object intSetb;
		//assertNull(((Object) testUnion).add(((Object) intSetb).get();
	}

	@Test
	public void testIntersect() {
		fail("Not yet implemented");
	}

	@Test
	public void testDiff() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsEmpty() {
		
		 IntegerSet set1 = new IntegerSet();
		 
	       set1.add(10);
	       
	       set1.add(20);
	       
	       assertFalse(set1.isEmpty());
	   }
	
	

	@Test
	public void testToString() {
		 IntegerSet set1 = new IntegerSet();
		 
	       set1.add(10);
	       
	       set1.add(20);
	       
	       set1.add(30);
	       
	       String expectedValue = "10 20 30 ";
	       
	       assertEquals(expectedValue, set1.toString());
	}

}
