	/*package com.java2novice.sorting;*/
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
	public class MyMergeSortAbstracted {

	//Initialize global private variables, used everywhere.
		private int[] array;
		private int[] tempMergArr;
		private int length;

	//This is a basic run of the merge sort algorithm
		public static void main(String a[]){

	//Initialize variables for a basic run of the merge sort
			int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
			MyMergeSortAbstracted mms = new MyMergeSortAbstracted();
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
		whileBlock(i, j, k, middle, higherIndex);
		while (i < middle) {
			array[k] = tempMergArr[i];
			k++;
			i++;
		}

	}

		// While the i < middle index and j < higher index check for which
		// index in the array holds the lower value and put it in the index k of the
		// new array
		private void whileBlock(int i, int j, int k, int middle, int higherIndex)
		{
			while (i < middle && j < higherIndex) {
				ifElseBlock(i, j, k);
				k++;
			}
		}

		// Checks if i < lowerIndex and j < higherIndex then performs some on the 
		// original array
		private void ifElseBlock(int i, int j, int k)
		{
			ifBlock(i, j, k);
			elseBlock(i, j, k);
		}

		// Checks if the array of the lower temporary array element is less than 
		// the higher temporary array element and if so assigns the lower value to
		// the array at point k and increments i
		private void ifBlock(int i, int j, int k)
		{
			if (tempMergArr[i] < tempMergArr[j])
			{
				array[k] = tempMergArr[i];
				i++;
			}
		}

	// Checks if the conditions for the ifBlock were false and if so assigns 
	// the lower value to the array at point k and increments j
		private void elseBlock(int i, int j, int k)
		{
			if(!(tempMergArr[i] < tempMergArr[j])) 
			{
				array[k] = tempMergArr[j];
				j++;
			}
		}
	}