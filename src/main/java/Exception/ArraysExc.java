package Exception;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysExc {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("enter no's");
        try {
            for (int i = 0; i < 6; i++) {
                arr[i] = s.nextInt();
            }
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println("you exceed size of array!!!");
            System.out.println("\033[1;31m"+a);
        }
        System.out.println("\033[1;32m"+Arrays.toString(arr));
    }
}
