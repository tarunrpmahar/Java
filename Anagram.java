package javaapplication;

/**
 *
 * @author Shubham Singh Mahar
 */
public class Anagram {
    public static void main(String[] args) {
        String s1="Tarun";
        String s2="aruntq";
        String str1=s1.toLowerCase();
        String str2=s2.toLowerCase();
        char ch[]=new char[256];
        for(int i=0;i<str1.length();i++)
        {
            ch[str1.charAt(i)]++;
        }
        for(int i=0;i<str2.length();i++)
        {
            ch[str2.charAt(i)]--;
        }
        
        for (int i = 0; i < 256; i++) {
            if(ch[i]!=0)
            {
                System.out.println("Not anagram");
            }
        }
        System.out.println("anagram");
    }
}
