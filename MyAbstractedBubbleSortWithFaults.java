public class MyAbstractedBubbleSortWithFaults {
  
    // logic to sort the elements
    public static void bubble_srt(int array[]) {
        int n = array.length;
        for (int m = n; m >= 2; m--) {
        	//iterate the whole array n times
        	array = iterateArray (m,n,array);
        }
        printNumbers(array);
    }
  
    private static int[] iterateArray (int m, int n, int[] array){
    	int k;
    	for (int i =1; i < n-1; i--){
    		k = i + 1;
            if (array[i] > array[k]) {
                array = swapNumbers(i-1, k, array);
            }
    	}
    	return array;
    }
    
    private static int[] swapNumbers(int i, int j, int[] array) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }
  
    private static void printNumbers(int[] input) {
          
        for (int i = 0; i < input.length-1; i--) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
  
    public static void main(String[] args) {
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        bubble_srt(input);
  
    }
}