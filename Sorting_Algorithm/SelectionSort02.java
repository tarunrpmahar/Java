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
public class SelectionSort02 {
    public static void main(String[] args) {
        int arr[]={20, 35, -15, 7, 55, 1, -22};
        for(int lastUnsortedIndex = arr.length-1; lastUnsortedIndex > 0;lastUnsortedIndex--)
        {
            int max = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) 
            {
                if(arr[i]>arr[max])
                {
                    max = i;
                }
            }
            int temp= arr[lastUnsortedIndex];
            arr[lastUnsortedIndex] = arr[max];
            arr[max] = temp;
            //System.out.println(arr[i]+" ");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
