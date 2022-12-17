package Pratice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUserInput2 {
    int Print(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=s.nextInt();
        int a[]=new int[size];
        for (int i = 0; i <size ; i++) {
            System.out.println("enter vlu");
            a[i]=s.nextInt();
            System.out.println(Arrays.toString(a));
        }
        System.out.println(Arrays.toString(a));
        return 0;
    }

    public static void main(String[] args) {
        ArrayUserInput2 b=new ArrayUserInput2();
        int user=b.Print();
    }
}
