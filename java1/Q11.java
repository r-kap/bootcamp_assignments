package Demo.Assignment;

//parent class for all the banks
class Bank
{
    double rateOfInterest;
    String bankName;
    String branchLocation;

    //parameterized constructor for subclass constructor reference
    public Bank(String b_name, String br_name, double roi)
    {
        this.bankName = b_name;
        this.branchLocation = br_name;
        this.rateOfInterest = roi;
    }

    public Bank()
    {

    }

    public void getDetails()
    {
        System.out.println("bank name: "+ bankName);
        System.out.println("branch location: "+ branchLocation);
        System.out.println("ROI: "+ rateOfInterest);
    }
}


//class SBI
class SBI extends Bank
{
    double rateOfInterest;
    String bankName;
    String branchLocation;

    public SBI(String b_name, String br_name, double roi)
    {
        super();
        this.bankName = b_name;
        this.branchLocation = br_name;
        this.rateOfInterest = roi;
    }

    public void getDetails()
    {
        System.out.println("bank name: "+ bankName);
        System.out.println("branch location: "+ branchLocation);
        System.out.println("ROI: "+ rateOfInterest);
    }
}


//class BOI
class BOI extends Bank
{
    double rateOfInterest;
    String bankName;
    String branchLocation;

    public BOI(String b_name, String br_name, double roi)
    {
        super();
        this.bankName = b_name;
        this.branchLocation = br_name;
        this.rateOfInterest = roi;
    }
    public void getDetails()
    {
        System.out.println("bank name: "+ bankName);
        System.out.println("branch location: "+ branchLocation);
        System.out.println("ROI: "+ rateOfInterest);

    }

}


//class ICICI
class ICICI extends Bank
{
    double rateOfInterest;
    String bankName;
    String branchLocation;

    public ICICI(String b_name, String br_name, double roi)
    {
        super();
        this.bankName = b_name;
        this.branchLocation = br_name;
        this.rateOfInterest = roi;
    }

    public void getDetails()
    {
        System.out.println("bank name: "+ bankName);
        System.out.println("branch location: "+ branchLocation);
        System.out.println("ROI: "+ rateOfInterest);

    }
}


//driver code
public class Q11
{
    public static void main(String[] args)
    {
        Bank b = new Bank();
        Bank b1 = new SBI("SBI", "Bombay", 8.2);
        Bank b2 = new ICICI("ICICI", "Chandigarh", 7.8);
        Bank b3 = new BOI("BOI", "New Delhi", 8.3);

        b.getDetails();
        b1.getDetails();
        b2.getDetails();
        b3.getDetails();
    }
}
