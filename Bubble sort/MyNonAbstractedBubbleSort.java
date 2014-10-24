public class MyNonAbstractedBubbleSort {
  
    // logic to sort the elements
    public static int[] bubble_srt(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n-1 ; i++) {
                k = i;
                if (array[i] > array[k]) {
                	int temp;
                    temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
            }
          
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("\n");
        return array;
    }
}