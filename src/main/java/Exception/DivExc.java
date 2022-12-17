package Exception;
import java.util.Scanner;

public class DivExc {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter no");
        int a=s.nextInt();
        System.out.println("enter 2nd no");
        int b=s.nextInt();
        int c=0;
       try {
            c=a/b;
        }
        catch (ArithmeticException d)
        {
            System.out.println("\033[1;31m"+d);

        }
        System.out.println("\033[1;32m"+"ans is :- "+c);

    }
}
