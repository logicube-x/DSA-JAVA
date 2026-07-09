package control_flow;

import java.util.Scanner;

public class electricity {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double units=sc.nextDouble();
        double price=0;

        if(units>400){
            price+=(units-400)*13;
            units=400;
        }
         if(units>200){
            price+=(units-200)*8;
            units=200;
        }
         if(units>100){
            price+=(units-100)*6;
            units=100;
        }
        price+=units*4.2;
System.out.printf("Your bill is %.2f",price);

    }

}
