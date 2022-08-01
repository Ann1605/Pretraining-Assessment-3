import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        int i,j,k,m=1;
        for(i=9;i>=0;i--)
        {
            for(j=1;j<m;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print(i);
            }
            m++;
            System.out.print("\n");
        }
    }
}