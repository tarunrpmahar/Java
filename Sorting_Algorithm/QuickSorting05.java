/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;


/**
 *
 * @author Shubham Singh Mahar
 */
// 10, 80, 30, 90, 40, 50, 70
public class QuickSorting05 {
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int low = 0, high = arr.length-1;
        
        quickSort(arr, low, high);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void quickSort(int arr[], int low, int high)
    {
        if(low<high)
        {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }
    // 10, 80, 30, 90, 40, 50, 70
    public static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int pivotIndex= 0;
        for (int j = 0; j <= high-1; j++) {
            if(arr[j]<=pivot)
            {
                int temp = arr[j];
                arr[j] = arr[pivotIndex];
                arr[pivotIndex] = temp;
                pivotIndex++;
            }
        }
        int temp=arr[pivotIndex];
        arr[pivotIndex]=arr[high];
        arr[high]=temp;
        return pivotIndex;
    }
}
