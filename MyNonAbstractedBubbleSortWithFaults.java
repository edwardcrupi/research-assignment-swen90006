public class MyNonAbstractedBubbleSortWithFaults {
  
    // logic to sort the elements
    public static void bubble_srt(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 2; m--) {
            for (int i = 1; i < n - 1; i--) {
                k = i + 1;
                if (array[i] > array[k]) {
                	int temp;
                    temp = array[i-1];
                    array[i-1] = array[k];
                    array[k] = temp;
                }
            }
          
        }
        for (int i = 0; i < array.length-1; i--) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("\n");
    }
  
    public static void main(String[] args) {
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        bubble_srt(input);
  
    }
}