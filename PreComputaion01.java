package javaapplication;

import java.util.*;

/**
 *
 * @author Shubham Singh Mahar
 */
public class PreComputaion01 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();  //1
        int r=sc.nextInt();  //5
        PrefixSum(arr);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        
        int sum=arr[r]-arr[l-1];
        System.out.format("Sum of array from %d to %d is %d",l,r,sum); //.format or .printf
        System.out.println("");
        
    }
    
    public static void PrefixSum(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            arr[i]=arr[i]+arr[i-1];
        }
    }
    
}
