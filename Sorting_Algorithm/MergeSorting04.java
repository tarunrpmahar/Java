/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;


public class MergeSorting04 {
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int low = 0, high = arr.length-1;
        
        mergeSort(arr, low, high);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
    
    public static void mergeSort(int arr[], int low, int high)
    {
        if(low < high)    //if((high-low)<2)
        {
            int mid = (high+low)/2;
            
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
        
    }
    
    public static void merge(int arr[], int low, int mid, int high)
    {
        
        int nL = mid - low + 1;
        int nR = high - mid;
        
        int leftArray[] = new int[nL];
        int rightArray[] = new int[nR];
        
        for (int i = 0; i < nL; i++) {
            leftArray[i] = arr[low + i];
        }
        for (int j = 0; j < nR; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }
        
        int i=0, j=0;
        int k = low;
        
        while(i < nL && j < nR)
        {
            if(leftArray[i] <= rightArray[j])
            {
                arr[k] = leftArray[i];
                i++;
            }
            else
            {
                arr[k] = rightArray[j];
                j++;
            }
            k++;            
        }
        while(i<nL)
        {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while(j<nR)
        {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
//        int i = low, j = mid+1, k = low;
//        int dupArr[] = new int[high+1];
//        while(i <= mid && j <= high)
//        {
//            if(arr[i] <= arr[j])
//            {
//                dupArr[k] = arr[i];
//                i++;
//            }
//            else
//            {
//                dupArr[k] = arr[j];
//                j++;
//            }
//            k++;
//        }
//
//            while(j <= high)
//            {
//                dupArr[k] = arr[j];
//                j++;
//                k++;
//            }
//        
//            while(i <= mid)
//            {
//                dupArr[k] = arr[i];
//                i++;
//                k++;
//            }
//        
//        
//        for (int l = 0; l <= high; l++) { 
//            arr[l] = dupArr[l];
//        }
    }
}
