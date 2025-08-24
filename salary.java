import java.util.Scanner;
class salary{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int Salary = scan.nextInt();
        int age = scan.nextInt();
        if(Salary>=20000 || age<25)
        {
            System.out.println("Eligible to get loan");
            int loan = scan.nextInt();

            if(loan<50000)
            {
                System.out.print("Loan available");
            }
            else{
                System.out.print("Loan not available");
            }
        }
        else
        {
            System.out.print("Not-Eligible to get loan");
        }
    }
}        