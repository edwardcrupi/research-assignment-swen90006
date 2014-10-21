#include <stdio.h>

void TopDownMergeSort(int A[], int B[], int n);
void CopyArray(int B[], int iBegin, int iEnd, int A[]);
void TopDownSplitMerge(int A[], int iBegin, int iEnd, int B[]);
void TopDownMerge(int A[], int iBegin, int iMiddle, int iEnd, int B[]);

int main(int argc, char** argv)
{
    int n = 10;
    int A[] = {10,9,8,7,6,5,4,3,2,1};
    int B[10] = {0};
    int i = 0;
    TopDownMergeSort(A, B, n);


    for(i = 0; i < n; i++)
    {
        printf("%d ", A[i]);
    }
    return 0;
}

void TopDownMergeSort(int A[], int B[], int n)
{
    TopDownSplitMerge(A, 0, n, B);
}
 
void CopyArray(int B[], int iBegin, int iEnd, int A[])
{
    int k = 0;
    for(k = iBegin; k < iEnd; k++)
        A[k] = B[k];
}
 
// iBegin is inclusive; iEnd is exclusive (A[iEnd] is not in the set)
void TopDownSplitMerge(int A[], int iBegin, int iEnd, int B[])
{
    if(iEnd - iBegin < 2)                       // if run size == 1
        return;                                 //   consider it sorted
    // recursively split runs into two halves until run size == 1,
    // then merge them and return back up the call chain
    int iMiddle = (iEnd + iBegin) / 2;              // iMiddle = mid point
    TopDownSplitMerge(A, iBegin,  iMiddle, B);  // split / merge left  half
    TopDownSplitMerge(A, iMiddle,    iEnd, B);  // split / merge right half
    TopDownMerge(A, iBegin, iMiddle, iEnd, B);  // merge the two half runs
    CopyArray(B, iBegin, iEnd, A);              // copy the merged runs back to A
}
 
//  left half is A[iBegin :iMiddle-1]
// right half is A[iMiddle:iEnd-1   ]
void TopDownMerge(int A[], int iBegin, int iMiddle, int iEnd, int B[])
{
    int i0 = iBegin;
    int i1 = iMiddle;
    int j = 0;
 
    // While there are elements in the left or right runs
    for (j = iBegin; j < iEnd; j++) {
        // If left run head exists and is <= existing right run head.
        if (i0 < iMiddle && (i1 >= iEnd || A[i0] <= A[i1])) 
        {
            B[j] = A[i0];
            i0 = i0 + 1;
        }
        else
        {
            B[j] = A[i1];
            i1 = i1 + 1;
        }
    }
}