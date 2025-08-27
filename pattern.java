import java.util.Scanner;
class Num{
    public static void main(String args[])
    {
        Scanner sk = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = sk.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}                 

import java.util.Scanner;
class Num{
    public static void main(String args[])
    {
        Scanner sk = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = sk.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}      

import java.util.Scanner;
class Num{
    public static void main(String args[])
    {
        Scanner sk = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = sk.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}   

import java.util.Scanner;
class Num{
    public static void main(String args[])
    {
        Scanner sk = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = sk.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}     

import java.util.Scanner;
class Num{
    public static void main(String args[])
    {
        Scanner sk = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = sk.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=n;j>=n-i+1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}    

import java.util.Scanner;
class Num{
    public static void main(String args[])
    {
        Scanner sk = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = sk.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=n;j>=n-i+1;j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }

}    

import java.util.Scanner;
class pascal{
    public static void main(String args[])
    {
        Scanner sk = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = sk.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }  

        for(int i=5;i>=1;i--){
            for(int j=5;j>=n-i+1;j--){
                 System.out.print("*"+" ");
            }
           System.out.println(" ");

        }  
    }
}        

import java.util.Scanner;
class pascal{
    public static void main(String args[])
    {
        Scanner sk = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = sk.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=n;j>=n-i+1;j--){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }  

        for(int i=2;i<=5;i++){
            for(int j=1;j<=i;j++){
                 System.out.print("*"+" ");
            }
           System.out.println(" ");

        }  
    }
}   

import java.util.Scanner;
class Matrix{
    public static void main(String args[])
    {
        Scanner sk = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = sk.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0)
                {
                    System.out.print(1+" ");
                }
                else
                {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}               

     
                



























