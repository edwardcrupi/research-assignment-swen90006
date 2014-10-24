import static org.junit.Assert.*;

import org.junit.Test;


public class MyAbstractedBubbleSortTest {
	@Test
	public void test1() {
		int input1 =1 ;
		int input2 =2 ;
		int[] input3 = {2,3,6,1,5};
		
		int[] output = {2,6,3,1,5};
		assertArrayEquals(output,MyAbstractedBubbleSort.swapNumbers(input1, input2, input3));
	}
	
	@Test
	public void test2() {
		int input1 =4 ;
		int input2 =3 ;
		int[] input3 = {5,23,1,6,1};
		
		int[] output = {5,23,1,1,6};
		assertArrayEquals(output,MyAbstractedBubbleSort.swapNumbers(input1, input2, input3));
	}

	@Test
	public void test3() {
		int input1 =3 ;
		int input2 =3 ;
		int[] input3 = {2,5,1,4};
		
		int[] output = {2,5,1,4};
		assertArrayEquals(output,MyAbstractedBubbleSort.swapNumbers(input1, input2, input3));
	}
	
	@Test (expected= Exception.class)
	public void test4 (){
		int input1 = 1;
		int input2 = 2;
		int[] input3 = {1};
		
		MyAbstractedBubbleSort.swapNumbers(input1, input2, input3);
	}
	
	@Test (expected = Exception.class)
	public void test6 (){
		int input1 = 2;
		int input2 = 5;
		int[] input3 = {1,4,5,2};
		
		MyAbstractedBubbleSort.swapNumbers(input1, input2, input3);
	}
	
	@Test (expected = Exception.class)
	public void test7 (){
		int input1 = 4;
		int input2 = 3;
		int[] input3 = {1,4,2};
		
		MyAbstractedBubbleSort.swapNumbers(input1, input2, input3);
	}
	
	@Test (expected = Exception.class)
	public void test8 (){
		int input1 = 3;
		int input2 = 3;
		int[] input3 = {1};
		
		MyAbstractedBubbleSort.swapNumbers(input1, input2, input3);
	}
	
	@Test
	public void test9() {
		int input1 =1;
		int[] input2 = {2};
		
		int[] output = {2};
		assertArrayEquals(output,MyAbstractedBubbleSort.iterateArray(input1, input2));
	}
	
	@Test
	public void test10() {
		int input1 =0;
		int[] input2 = {2,3,54,1,4};
		
		int[] output = {2,3,54,1,4};
		assertArrayEquals(output,MyAbstractedBubbleSort.iterateArray(input1, input2));
	}
	
	@Test
	public void test11() {
		int input1 =1;
		int[] input2 = {34,3,5,1,45};
		
		int[] output = {34,3,5,1,45};
		assertArrayEquals(output,MyAbstractedBubbleSort.iterateArray(input1, input2));
	}
	
	@Test
	public void test12() {
		int input1 =3;
		int[] input2 = {2,54,12,5,6,1};
		
		int[] output = {2,12,54,5,6,1};
		assertArrayEquals(output,MyAbstractedBubbleSort.iterateArray(input1, input2));
	}

	@Test (expected = Exception.class)
	public void test13 (){
		int input1 = 3;
		int[] input2 = {};
		
		MyAbstractedBubbleSort.iterateArray(input1, input2);
	}
		
	@Test (expected = Exception.class)
	public void test14 (){
		int input1 = 2;
		int[] input2 = {2};
		
		MyAbstractedBubbleSort.iterateArray(input1, input2);
	}
		
	@Test
	public void test15() {
		int[] input = {};
		int[] output = {};
		assertArrayEquals(output,MyAbstractedBubbleSort.bubble_srt(input));
	}
	
	@Test
	public void test16() {
		int[] input = {2};
		int[] output = {2};
		assertArrayEquals(output,MyAbstractedBubbleSort.bubble_srt(input));
	}
	@Test
	public void test17() {
		int[] input = {-3};
		int[] output = {-3};
		assertArrayEquals(output,MyAbstractedBubbleSort.bubble_srt(input));
	}
	
	@Test
	public void test18() {
		int[] input = {4,1,2,6,3};
		int[] output = {1,2,3,4,6};
		assertArrayEquals(output,MyAbstractedBubbleSort.bubble_srt(input));
	}
	
	@Test 
	public void test19() {
		int[] input = {4,3,2,6,2};
		int[] output = {2,2,3,4,6};
		assertArrayEquals(output,MyAbstractedBubbleSort.bubble_srt(input));
	}
	
	@Test
	public void test20() {
		int[] input = {-1,-10,-2,-5,-3};
		int[] output = {-10,-5,-3,-2,-1};
		assertArrayEquals(output,MyAbstractedBubbleSort.bubble_srt(input));
	}
	
	@Test
	public void test21() {
		int[] input = {-1,-4,-2,-10,-4};
		int[] output = {-10, -4, -4, -2, -1};
		assertArrayEquals(output,MyAbstractedBubbleSort.bubble_srt(input));
	}
	
	@Test
	public void test22() {
		int[] input = {2,4,-1,3,-10};
		int[] output = {-10, -1, 2, 3, 4};
		assertArrayEquals(output,MyAbstractedBubbleSort.bubble_srt(input));
	}
	
	@Test
	public void test23() {
		int[] input = {6,-1,10,3,-1};
		int[] output = {-1, -1, 3, 6, 10};
		assertArrayEquals(output,MyAbstractedBubbleSort.bubble_srt(input));
	}
}
