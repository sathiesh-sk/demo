import java.util.Scanner;
class sqhollowpattern{
    public static void main(String args[])
    {
        Scanner sk = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = sk.nextInt();

        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0 || i==n || j==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}                