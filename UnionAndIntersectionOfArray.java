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
public class UnionAndIntersectionOfArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={1,2,3};
        int count=doUnion(a,5,b,3);
        System.out.println(count);
        doIntersection(a,5,b,3);
    }
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        Set<Integer> st=new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            st.add(a[i]);
        
        }
        for (int i = 0; i < m; i++) {
            st.add(b[i]);
        }
        st.forEach((i) -> {      //for(int i:st){
            System.out.print(i+" ");
        });
        System.out.println("");
        return st.size();
    }
    
    public static void doIntersection(int a[], int n, int b[], int m)
    {
        Set<Integer> intersectionSet = new HashSet<Integer>();
        int i=0,j=0;
        while(i<n && j<m)
        {
            if(a[i]<b[j])
            {
                i++;
            }
            else if(a[i]>b[i])
            {
                j++;
            }
            else
            {
                intersectionSet.add(a[i]);
                i++;
                j++;
            }
        }
        intersectionSet.forEach((k)->{
             System.out.print(k+" ");
        });
    }
}
