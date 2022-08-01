import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int bracket_1 = (a*a*a+b*b*b);
        int bracket_2 = (b*b-b*a+a*a);
        int of = bracket_2*c;
        int div = bracket_1/of;
        System.out.println("Value is:"+div);
        
        
        
        
    }
}