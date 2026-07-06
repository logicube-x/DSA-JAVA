package basics;

import java.util.Scanner;

public class compoundInt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double p=sc.nextDouble();
        double r=sc.nextDouble();
        double t=sc.nextDouble();

        double A=p*(Math.pow((1+r/100),t));

        double CI=A-p;

        System.out.printf("The Compound intrest is %.2f%n ",CI);
    }

}
