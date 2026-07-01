package basics;

import java.util.Scanner;

public class AgeAndName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();
        int age=sc.nextInt();

        System.out.println("Your name is "+name+" and your age is "+age);
    }

}
