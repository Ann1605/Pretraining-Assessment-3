 import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        printMatrix(n);
    }
    public static void printMatrix(int n)
    {
         for(int i=0;i<n;i++)
         {
             for(int j=0; j<n; j++)
             {
                 System.out.print((int)(Math.random() *2) +" ");
             }
             System.out.println();
         }
    }
}