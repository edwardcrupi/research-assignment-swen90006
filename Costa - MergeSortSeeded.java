package com.java2novice.sorting;
 

/*
**Merge Sort Algorithm Implementation in Java
**For Software Engineering Methods Semester 2 2014
**Research Assignment
**Ed Crupi, 538156
**
**NOTE: This sorting algorithm was taken from
**http://www.java2novice.com/java-sorting-algorithms/merge-sort/
**on Thursday 24th of October without express permission of the owner.
*/
public class MyMergeSort {
    
	//Initialize global private variables 
    private int[] array;
    private int[] tempMergArr;
    private int length;
 
	//This is a basic run of the merge sort algorithm
    public static void main(String a[]){
         
		//Initialize variables for a basic run of the merge sort
        int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
        MyMergeSort mms = new MyMergeSort();
        mms.sort(inputArr);
        for(int i:inputArr){
            System.out.print(i);
            System.out.print(" ");
        }
    }
    
	//Sorts an input array of integers by instantiating a temporary merge array of the same length
    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }
 
	//Performs a mergesort if the value at the lower index is less than the value at the higher indexx
    private void doMergeSort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex + lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
 
	//Merges the 3 parts of the array together
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i < middle && j < higherIndex) {
            if (tempMergArr[i] < tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i < middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
 
    }

}