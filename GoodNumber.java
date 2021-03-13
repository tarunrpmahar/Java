/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.Scanner;


public class GoodNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	//GoodNumber obj = new GoodNumber();
	while(t-- > 0)
	{
            int n = sc.nextInt();
            //obj.goodNumber(n);
            goodNumber(n);
	}
    }

    static void goodNumber(int n) {
        long i=1;
        long num=0,count=0;
        while(i>0)
        {
            if(count==n)
            {
                System.out.println(num);
                break;
            }
            if(checkGoodNumber(i))
            {
                num=i;
                count++;
            }
            
            i++;
        }
    }

    static boolean checkGoodNumber(long i) {
        boolean flag=false;
        while(i!=0)
        {
            long temp=i%10;
            if(temp==1 || temp==2)
            {
                flag=true;
            }
            else
            {
                return false;
            }
            i=i/10;
        }
        return flag;
    }
}
