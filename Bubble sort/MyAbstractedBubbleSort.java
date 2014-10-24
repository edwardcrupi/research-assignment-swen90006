public class MyAbstractedBubbleSort {
  
    // logic to sort the elements
    public static int[] bubble_srt(int array[]) {
        int n = array.length;
        for (int m = n; m >= 0; m--) {
        	//iterate the whole array n times
        	array = iterateArray (n,array);
        }
        return array;
      }
    
    //
    public static int[] iterateArray (int n, int[] array){
    	int k;
    	for (int i =0; i < n-1; i++){
    		k = i+1;
            if (array[i] > array[k]) {
                array = swapNumbers(i, k, array);
            }
    	}
    	return array;
    }
    
    public static int[] swapNumbers(int i, int j, int[] array) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }
    
  
}