package loops.while_loop;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,num1,num2;
        do{

            System.out.println("Enter 1 for addition\n"+
                    "Enter 2 for subtraction\n"+
                    "Enter 3 for multiplication\n"+
                    "Enter 4 for division\n"+
                    "Enter 5 to exit the calculator");

            n=sc.nextInt();

            if(n==1){
                System.out.println("Enter two number");
                num1=sc.nextInt();
                num2=sc.nextInt();
                System.out.println("The Addition is "+(num1+num2));
            }

            else if(n==2){
                System.out.println("Enter two number");
                num1=sc.nextInt();
                num2=sc.nextInt();
                System.out.println("The Subtraction is "+(num1-num2));
            }

            else if(n==3){
                System.out.println("Enter two number");
                num1=sc.nextInt();
                num2=sc.nextInt();
                System.out.println("The Multiplication is "+(num1*num2));
            }

            else if(n==4){
                System.out.println("Enter two number");
                num1=sc.nextInt();
                num2=sc.nextInt();
                if(num2==0) System.out.println("Cannot divide by zero");
                System.out.println("The  Division is "+(num1/num2));
            }

            else if(n==5){
                System.exit(0);
            }
            else System.out.println("Invalid Input");


        }while (true);
    }

}
