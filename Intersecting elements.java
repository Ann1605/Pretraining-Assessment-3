import java.util.*;

public class Main 
{
    public static void main(String[] args)
    {
        int n,m;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the size of arr1:");
        n = in.nextInt();
        
        int [] arr1 = new int[30];
        System.out.print("Enter the size of arr2:");
        m = in.nextInt();
        
        int [] arr2 = new int[30];
        System.out.print("Enter the elements of arr1:");
        for(int i=0;i<n;i++)
        {
            arr1[i] = in.nextInt();
        }
        System.out.print("Enter the elements of arr2:");
        for(int i=0;i<m;i++)
        {
            arr2[i] = in.nextInt();
        }
        System.out.print("Common elements are:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr1[i] == arr2[j])
                {
                    System.out.println(arr1[i]);
                }
            }
        }
        
        
    }
}