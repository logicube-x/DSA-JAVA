package control_flow;

import java.util.Scanner;

public class max_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        if(a>b) System.out.printf(a+" is maximum");
        else System.out.println(b+" is maximum");
    }

}
