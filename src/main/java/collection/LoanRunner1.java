package collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LoanRunner1 {
    public static void main(String[] args) {
        String path="C:\\Users\\USER\\Desktop\\study\\loan.csv";
        List<LoanData> m=new LinkedList<>();

        try{
            File f=new File(path);
                Scanner file = new Scanner(f);
                file.nextLine();
                while (file.hasNext())
                {
                    String arr[] =file.nextLine().split(",");
                    String Loan_ID=arr[0].trim();
                    String Gender=arr[1].trim();
                    String Married=arr[2].trim();
                    String Dependents=arr[3].trim();
                    String Education=arr[4].trim();
                    String Self_Employed=arr[5].trim();
                    int ApplicantIncome=Integer.parseInt(arr[6].trim());
                    int CoapplicantIncome=Integer.parseInt(arr[7].trim());
                    int LoanAmount=Integer.parseInt(arr[8].trim());
                    int Loan_Amount_Term=Integer.parseInt(arr[9].trim());
                    int Credit_History=Integer.parseInt(arr[10].trim());
                    String Property_Area=arr[11].trim();
                    String Loan_Status=arr[12].trim();
                    LoanData l=new LoanData(Loan_ID,Gender,Married,Dependents,Education,Self_Employed,ApplicantIncome,CoapplicantIncome,LoanAmount,Loan_Amount_Term,Credit_History,Property_Area,Loan_Status);
                    m.add(l);

                }
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        System.out.println(m);
    }
}
