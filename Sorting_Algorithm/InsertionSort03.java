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
public class InsertionSort03 {
    public static void main(String[] args) {
        int arr[] = {20, 35, -15, 7, 55, 1, -22};
        int n = arr.length;
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < n; firstUnsortedIndex++) {
            int key = arr[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && arr[i-1]>key; i--) {
               arr[i]=arr[i-1];                                
            }
            arr[i] = key;
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}