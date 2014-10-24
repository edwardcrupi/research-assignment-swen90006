
import static org.junit.Assert.*;
import org.junit.Test;


public class MyNonAbstractedBubbleSortTest {

	@Test
	public void test1() {
		int[] input = {};
		int[] output = {};
		assertArrayEquals(output,MyNonAbstractedBubbleSort.bubble_srt(input));
	}
	
	@Test
	public void test2() {
		int[] input = {2};
		int[] output = {2};
		assertArrayEquals(output,MyNonAbstractedBubbleSort.bubble_srt(input));
	}
	@Test
	public void test3() {
		int[] input = {-3};
		int[] output = {-3};
		assertArrayEquals(output,MyNonAbstractedBubbleSort.bubble_srt(input));
	}
	
	@Test
	public void test4() {
		int[] input = {4,1,2,6,3};
		int[] output = {1,2,3,4,6};
		assertArrayEquals(output,MyNonAbstractedBubbleSort.bubble_srt(input));
	}
	
	@Test 
	public void test5() {
		int[] input = {4,3,2,6,2};
		int[] output = {2,2,3,4,6};
		assertArrayEquals(output,MyNonAbstractedBubbleSort.bubble_srt(input));
	}
	
	@Test
	public void test6() {
		int[] input = {-1,-10,-2,-5,-3};
		int[] output = {-10,-5,-3,-2,-1};
		assertArrayEquals(output,MyNonAbstractedBubbleSort.bubble_srt(input));
	}
	
	@Test
	public void test7() {
		int[] input = {-1,-4,-2,-10,-4};
		int[] output = {-10, -4, -4, -2, -1};
		assertArrayEquals(output,MyNonAbstractedBubbleSort.bubble_srt(input));
	}
	
	@Test
	public void test8() {
		int[] input = {2,4,-1,3,-10};
		int[] output = {-10, -1, 2, 3, 4};
		assertArrayEquals(output,MyNonAbstractedBubbleSort.bubble_srt(input));
	}
	
	@Test
	public void test9() {
		int[] input = {6,-1,10,3,-1};
		int[] output = {-1, -1, 3, 6, 10};
		assertArrayEquals(output,MyNonAbstractedBubbleSort.bubble_srt(input));
	}
	
	
	
}
