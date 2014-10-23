import static org.junit.Assert.*;
import junit.framework.AssertionFailedError;

import org.junit.Test;


public class MyAbstractedInsertionSortWithFaultsNoPreconditionsTest {
	
	// sorted list
	@Test 
	public void testDoInsertionSort() {
		int[] input = {1,2};
		assertArrayEquals(input,MyAbstractedInsertionSortWithFaults.doInsertionSort(input));
	}
	
	//unsorted list && 1 swap
	@Test
	public void testDoInsertionSort2() {
		int[] input = {2,1}; int[] answer={1,2};
		assertArrayEquals(answer,MyAbstractedInsertionSortWithFaults.doInsertionSort(input));
	}
	
	//unsorted list && many swaps
	@Test
	public void testDoInsertionSort3() {
		int[] input = {4,2,3,1}; int[] answer={1,2,3,4};
		assertArrayEquals(answer,MyAbstractedInsertionSortWithFaults.doInsertionSort(input));
	}
	
	//singleton list
	@Test
	public void testDoInsertionSort4() {
		int[] input = {1}; ;
		assertArrayEquals(input,MyAbstractedInsertionSortWithFaults.doInsertionSort(input));
	}
	
	//empty list
	@Test
	public void testDoInsertionSort5() {
		int[] input = {}; ;
		assertArrayEquals(input,MyAbstractedInsertionSortWithFaults.doInsertionSort(input));
	}
	
	
	
	
	
	//invalid: upper >= input.length-1
	@Test(expected=Exception.class) 
	public void testInsert1() {
		int upper = 1; int[] input = {1,2};
		MyAbstractedInsertionSortWithFaults.insert(upper, input);
	}
	
	//invalid: upper < 0
	@Test(expected=Exception.class)  
	public void testInsert2() {
		int upper = -1; int[] input = {1,2};
		MyAbstractedInsertionSortWithFaults.insert(upper, input);
	}
	
	//valid: (upper >= 0)  &&  (upper < input.length-1) && (no swaps)
	@Test
	public void testInsert3() {
		int upper = 0; int[] input = {1,2};
		assertArrayEquals(input,MyAbstractedInsertionSortWithFaults.insert(upper, input));
	}
	
	//valid: (upper >= 0)  &&  (upper < input.length-1) && (all swaps)
	@Test
	public void testInsert4() {
		int upper = 1; int[] input = {3,2,1}; int[] answer = {1,3,2};
		assertArrayEquals(answer,MyAbstractedInsertionSortWithFaults.insert(upper, input));
	}

	
	
	

	//invalid: (index < 0) && (input.length >= 2)
	@Test(expected=Exception.class)
	public void swapTest1() {
		int index = -1; int[] input = {1,2};
		MyAbstractedInsertionSortWithFaults.swap(index, input); 
	}
	
	//invalid: (index >= input.length) && (input.length >= 2)   
	@Test(expected=Exception.class)
	public void swapTest2() {
		int index = 3; int[] input = {1,2};
		MyAbstractedInsertionSortWithFaults.swap(index, input); 
	}

	//invalid: (index >= 0) && (index < input.length) && (input.length < 2) 
	@Test(expected=Exception.class)
	public void swapTest3() {
		int index = 1; int[] input = {1};
		MyAbstractedInsertionSortWithFaults.swap(index, input);
	}
	
	//valid: (index >= 0) && (index < input.length) && (input.length >= 2) 
	@Test
	public void swapTest4() {
		int index = 1; int[] input = {1,2,3,4}; int[] answer = {1,3,2,4};
		assertArrayEquals(answer, MyAbstractedInsertionSortWithFaults.swap(index, input));
	}

	
}
