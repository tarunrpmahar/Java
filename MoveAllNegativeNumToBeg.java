/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author Shubham Singh Mahar
 */
public class MoveAllNegativeNumToBeg {
    public static void main(String[] args) {
        int arr[]={-1, 2, -3, 4, 5, 6, -7, 8, 9};
        int n=arr.length;
        int low=0, high=arr.length-1;
        //twoPointerApproach(arr, low, high);
        quickPartition(arr, n);
    }
    // -12, 11, -13, -5, 6, -7, 5, -3, -6
    public static void quickPartition(int arr[], int n)
    {
        int marklarge=0, temp;
        for (int i = 0; i < n; i++) {
            if(arr[i]<0)
            {
                if(i!=marklarge)
                {
                    temp = arr[i];
                    arr[i] = arr[marklarge];
                    arr[marklarge] = temp;
                }
                marklarge++;
            }
        }
        System.out.println("using QuickPartition");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+" "); 
        }
        System.out.println("");
    }
    
    public static void twoPointerApproach(int arr[], int low, int high)
    {
        while(low<=high) {
            if(arr[low]<0 && arr[high]<0)
            {
                low++;
            }
            else if(arr[low]>0 && arr[high]<0)
            {
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
            else if(arr[low]<0 && arr[high]>0)
            {
                low++;
                high--;
            }
            else
            {
                high--;
            }
            
        }
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+" "); 
        }
        System.out.println("");
    }
}
