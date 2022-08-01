import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        print_chars('(','z',20);
    }
    public static void print_chars(char char1, char  char2, int n){
        for (int ctr=1 ; char1 <= char2 ;ctr++, char1++ ){
            System.out.print(char1 + " ");
            if(ctr % n ==0) 
            System.out.println("");
        }
        System.out.print("\n");
    }
        
        
        
        
    
}