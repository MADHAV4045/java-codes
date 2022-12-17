package Pratice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter arr size");
        int size=s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <size; i++) {
            System.out.println("enter vlu");
             arr[i]=s.nextInt();
        }
        //for (int i=0;i<size;i++) {
            System.out.println("valu is" + Arrays.toString(arr));
        //}

    }
}
