import java.util.Scanner;

/**
 *
 * @author Tarun Singh Mahar
 */
public class BubbleSort01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        
        for (int i = 0; i < n-1; i++) {
            int count=0;
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count++;
                }
            }
            if(count==0)
            {
                //System.out.println("i is "+i);
                break;
            }          
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
