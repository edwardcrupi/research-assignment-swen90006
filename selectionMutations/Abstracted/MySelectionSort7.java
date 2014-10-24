
//Error introduced in to line 32: should be ```elements[index1] = elements[index2];```
public class MySelectionSort6 {

    public static int[] doSelectionSort(int[] arr){
        
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            
            index = findSmallestElement(arr, index, i);
            
            arr = swapElements(arr, index, i);
        }
        return arr;
    }
    
    public static int findSmallestElement(int[] elements, int index, int startPosition){
        for (int j = startPosition + 1; j < elements.length; j++)
        	index = isSmallerElementSwapIndex(elements, j, index);
        return index;
    }
    
    public static int isSmallerElementSwapIndex(int[] elements, int currentIndex, int index){
        if (elements[currentIndex] < elements[index]) 
            index = currentIndex;
        return index;
    }
    
    public static int[] swapElements(int[] elements, int index1, int index2){
        int smallerNumber = elements[index1];  
        elements[index1] += elements[index2];
        elements[index2] = smallerNumber;
    	return elements;
    }
	
    public static void main(String a[]){
         
        int[] arr1 = {10,34,2,56,7,67,88,42};
        int[] arr2 = doSelectionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }
	
}
