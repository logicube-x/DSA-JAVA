package control_flow;

import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double price=sc.nextDouble();

        double dis=0;

        if(price<=5000){
            dis=0;
        }
        else if(price<=7000){
            dis=(0.05*price);
        }
        else if(price<=9000){
            dis=(0.1*price);
        }
        else {
            dis=0.2*price;
        }

        System.out.printf("The price is %.2f",(price-dis));

    }

}
