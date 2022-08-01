import java.util.*;
public class Main 
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double unit = sc.nextDouble();
        double amount = 0;
        if (unit >= 0 && unit <= 50){
            amount = unit * 3.50;
        }
        else if (unit > 50 && unit <= 150){
            amount = 50 * 3.50 +(unit - 50)*4.00;
        }
        else if (unit > 150 && unit <= 250){
            amount = 50 * 3.50 +100 * 4 +(unit - 150) * 5.20;
        }
        else if (unit > 250 ){
            amount = 50 * 3.50 +100 * 4 + 250 * 5.20+ (unit - 250) * 6.50;
        }
        System.out.println(amount);
    }
}