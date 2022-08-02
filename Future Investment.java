 import java.util.Scanner;
public class Main 
{
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the investment Amount: ");
    double investment = in.nextDouble();
    System.out.print("Enter the rate of interst: ");
    double rate = in.nextDouble();
    System.out.print("Enter the number of Years: ");
    int year = in.nextInt();
    rate = rate/100;
    System.out.println("Years      FutureValue");
    for(int i=1; i<=year; i++)
    {
        int formatter = 19;
        if(i>=10) formatter = 18;
        System.out.printf(i + "%" +formatter+".2f\n",futureinvestmentValue(investment, rate/12,i));
    }
    }
    public static double futureinvestmentValue(double investmentAmount, double monthlyInterestRate,int years)
    {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
    
}