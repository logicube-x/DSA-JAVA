package control_flow;

import java.util.Scanner;

public class gender_valid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        char gender=sc.next().charAt(0);

        if(gender=='M'||gender=='m') System.out.println("Hello Sir");
        else if(gender=='F'||gender=='f') System.out.println("Hello Madam");

        else System.out.println("Invalid input");
    }

}
