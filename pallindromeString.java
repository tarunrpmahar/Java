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
public class pallindromeString {
    public static void main(String[] args) {
        String s="abbac"; 
        char ch[]=s.toCharArray();
        int n=s.length();
        int low=0, high=n-1;
        while(low<high)
        {
            if(ch[low]!=ch[high])
            {
                System.out.println("NO");
                break;
            }
            low++;
            high--;
        }
        System.out.println("YES");
    }
}
