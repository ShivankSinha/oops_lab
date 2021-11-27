
import java.util.Scanner;

/**
 *
 * @author student
 */
public class L4Q1 {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int n,i,j, flag;
        int arr[] = new int[50];
        System.out.println("Enter the number of elements of the array: ");
        n = sn.nextInt();
        System.out.println("Enter the elements: ");
        for(i=0;i<n;i++)
        {
            arr[i] = sn.nextInt();
        }
        
        System.out.println("\n");
        
        for(i=0;i<n;i++){
            flag = 0;
            for(j=2;j<=arr[i]/2;j++){
                if(arr[i]%j==0)
                {flag = 1;
                break;
                }
            }
            if(flag==0)
            {System.out.println(arr[i] + " is prime");
        }
    }
    
}
}
