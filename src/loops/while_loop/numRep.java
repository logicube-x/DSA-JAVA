package loops.while_loop;

import java.util.Scanner;

public class numRep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n;
        do{
            n=sc.nextInt();
            System.out.println("Hello");
            System.out.println("Enter other number to stop");


//            System.out.println("Hello");
//            System.out.println("Enter other number to stop");
//            n=sc.nextInt();
        }while(n==1);
    }

}
