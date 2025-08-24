import java.util.Scanner;
class nested{
    public static void main(String args[])
    {
        Scanner mark = new Scanner(System.in);
        int a = mark.nextInt();
        int b = mark.nextInt();
        int c = mark.nextInt();
        int d = mark.nextInt();
        int e = mark.nextInt();
        int f = a+b+c+d+e;
        int g = f/5;
        
        System.out.println("Mark ="+f);
        System.out.println("Average ="+g);
        
        if(g<35)
        {
           System.out.print("Remark =" + "Additional class is required");
        }
        else
        {
           System.out.print("Remark =" + "You are good to go");
        }
         
    }
}    