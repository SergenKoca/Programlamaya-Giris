import java.util.Scanner;


public class FibonacciSerisi 
{
    static Scanner s=new Scanner(System.in);
    static int a,b,c;
    
    public static void main(String args[])
    {
        System.out.println("Bir sayı giriniz : ");
        int sayi=s.nextInt();
        System.out.print(" 1 1 ");
        a=1; b=1; 
        for(int i=1;i<=sayi;i++)
        {
            c=a+b;
            a=c;
            b=a;
            System.out.print(c+" ");
        }
        
        
    }
}
