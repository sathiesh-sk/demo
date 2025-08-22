import java.lang.System;
import java.util.Scanner;
class scanner{
     public static void main(String args[])
     {
        Scanner SK = new Scanner(System.in);
        String a = SK.nextLine();
        int b = SK.nextInt();
        SK.nextLine();
        String c = SK.nextLine();
        System.out.println("My Name is :"+ a);
        System.out.println("My Age is :"+ b);
        System.out.println("My Address is :"+ c);
     }
}