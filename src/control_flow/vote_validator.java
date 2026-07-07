package control_flow;

import java.util.Scanner;

public class vote_validator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();
        int age=sc.nextInt();

        if(age<18){
            System.out.println("Hello "+name+" you will be eligible to vote in "+(18-age)+" years");
        }
        else if(age>=18){
            System.out.println("Hello "+name+" you are a voter");
        }



    }

}
