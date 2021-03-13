/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.*;

/**
 *
 * @author Shubham Singh Mahar
 */
public class SortAnArrayOf012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        sort012(arr, n);
        
    }
    // 0 2 1 2 0
    public static void sort012(int arr[], int n)
    {
        // tricky solution
        int low=0, mid=0, high=n-1;
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else if(arr[mid]==2)
            {
                int temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
            }
           
        }
        
        
        
        //simple counting
//        int count0=0, count1=0, count2=0;
//        for (int i = 0; i < n; i++) {
//            if(arr[i]==0)
//            {
//                count0++;
//            }
//            else if(arr[i]==1)
//            {
//                count1++;
//            }
//            else if(arr[i]==2)
//            {
//                count2++;
//            }
//        }
//        for (int i = 0; i < count0; i++) {
//            arr[i]=0;
//        }
//        for (int i = count0; i < count0+count1; i++) {
//            arr[i]=1;
//        }
//        for (int i = count0+count1; i < n; i++) {
//            arr[i]=2;
//        }
        
        // Using sort method O(nlogn)
//        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}
