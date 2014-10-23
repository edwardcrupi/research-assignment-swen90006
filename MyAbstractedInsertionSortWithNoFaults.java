public class MyAbstractedInsertionSort {
 
    public static void main(String a[]){
        int[] arr1 = {1,2,5,3,4,6,8};
        int[] arr2 = doInsertionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }
     
    public static int[] doInsertionSort(int[] input){
        for (int i = 1; i < input.length; i++) {
			 input = insert(i, input);
        }
        return input;
    }

	
	public static int[] insert (int upper,int[] input){
        for( int i = upper; i>0; i-- ){
			if (input[i] < input[i-1]){
				input =  exeInsert(i, input);
			}
		}
		return input;
	}
	
	public static int[] exeInsert (int index, int[] input){
			int temp;
			temp = input[index];
			input[index] = input [index-1];
			input[index-1] = temp;
		return input;
	}
}