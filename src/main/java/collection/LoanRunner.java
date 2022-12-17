package collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoanRunner {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\USER\\Desktop\\study\\loan.csv";

        try{
            File d = new File(path);
            Scanner file =new Scanner(d);
//            file.nextLine();
            System.out.println(file.nextLine());
            System.out.println(file.nextLine());
        }
        catch (FileNotFoundException e){

        }
    }
}