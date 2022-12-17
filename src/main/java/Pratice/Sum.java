package Pratice;

import java.util.Scanner;
//method
public class Sum {
    int sum(int a,int b){
        return a+b;
    }
//main method
    public static void main(String[] args) {
        //input method
        Scanner obj=new Scanner(System.in);
        //user input
        System.out.println("Enter vlu of a");
        int a= obj.nextInt();
        System.out.println("Enter vlu of b");
        int b=obj.nextInt();
        //method obj cre
        Sum s=new Sum();
        //method call with output
        System.out.println("sum is"+s.sum(a,b));
    }
}
