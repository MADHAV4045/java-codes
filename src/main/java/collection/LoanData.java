package collection;

public class LoanData {
    String Loan_ID;
    String Gender;
    String Married;
    String Dependents;
    String Education;
    String Self_Employed;
    int ApplicantIncome;
    int CoapplicantIncome;
    int LoanAmount;
    int Loan_Amount_Term;
    int Credit_History;
    String Property_Area;
    String Loan_Status;
    public  LoanData(String Loan_ID,String Gender,String Married,String Dependents,String Education,String Self_Employed,int ApplicatIncome,int CoapplicantIncome,int LoanAmount,int Loan_Amount_Term,int Credit_History,String Property_Area,String Loan_Status){

        this.Loan_ID=Loan_ID;
        this.Gender=Gender;
        this.Married=Married;
        this.Dependents=Dependents;
        this.Education=Education;
        this.Self_Employed=Self_Employed;
        this.ApplicantIncome=ApplicatIncome;
        this.CoapplicantIncome=CoapplicantIncome;
        this.LoanAmount=LoanAmount;
        this.Loan_Amount_Term=Loan_Amount_Term;
    }

    public String getLoan_ID() {
        return Loan_ID;
    }

    public void setLoan_ID(String loan_ID) {
        Loan_ID = loan_ID;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getMarried() {
        return Married;
    }

    public void setMarried(String married) {
        Married = married;
    }

    public String getDependents() {
        return Dependents;
    }

    public void setDependents(String dependents) {
        Dependents = dependents;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    public String getSelf_Employed() {
        return Self_Employed;
    }

    public void setSelf_Employed(String self_Employed) {
        Self_Employed = self_Employed;
    }

    public int getApplicantIncome() {
        return ApplicantIncome;
    }

    public void setApplicantIncome(int applicantIncome) {
        ApplicantIncome = applicantIncome;
    }

    public int getCoapplicantIncome() {
        return CoapplicantIncome;
    }

    public void setCoapplicantIncome(int coapplicantIncome) {
        CoapplicantIncome = coapplicantIncome;
    }

    public int getLoanAmount() {
        return LoanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        LoanAmount = loanAmount;
    }

    public int getLoan_Amount_Term() {
        return Loan_Amount_Term;
    }

    public void setLoan_Amount_Term(int loan_Amount_Term) {
        Loan_Amount_Term = loan_Amount_Term;
    }

    public int getCredit_History() {
        return Credit_History;
    }

    public void setCredit_History(int credit_History) {
        Credit_History = credit_History;
    }

    public String getProperty_Area() {
        return Property_Area;
    }

    public void setProperty_Area(String property_Area) {
        Property_Area = property_Area;
    }

    public String getLoan_Status() {
        return Loan_Status;
    }

    public void setLoan_Status(String loan_Status) {
        Loan_Status = loan_Status;
    }

    @Override
    public String toString() {
        return "LoanData{" +
                "Loan_ID='" + Loan_ID + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Married='" + Married + '\'' +
                ", Dependents='" + Dependents + '\'' +
                ", Education='" + Education + '\'' +
                ", Self_Employed='" + Self_Employed + '\'' +
                ", ApplicantIncome=" + ApplicantIncome +
                ", CoapplicantIncome=" + CoapplicantIncome +
                ", LoanAmount=" + LoanAmount +
                ", Loan_Amount_Term=" + Loan_Amount_Term +
                ", Credit_History=" + Credit_History +
                ", Property_Area='" + Property_Area + '\'' +
                ", Loan_Status=" + Loan_Status +
                '}'+'\n';
    }
}
