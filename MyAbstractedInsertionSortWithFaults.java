public class MyAbstractedInsertionSortWithFaults {
 
    public static void main(String a[]){
        int[] arr1 = {10,34,2,56,7,67,88,42};
        int[] arr2 = doInsertionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }
     
    public static int[] doInsertionSort(int[] input){
        for (int i = 0; i <= input.length; i++) {
			 input = insert(i, input);
        }
        return input;
    }

	
	public static int[] insert (int upper,int[] input){
        for( int i = upper-1; i>=0; i-- ){
			if (input[i] =< input[i+1]){
				input =  exeInsert(i+1, input);
			}
		}
		return input;
	}
	
	public static int[] exeInsert (int index, int[] input){
			int temp;
			temp = input[index];
			input[index] = input [index+1];
			input[index+1] = temp;
		return input;
	}
}