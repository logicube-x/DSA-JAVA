package basics;

import java.util.Scanner;

public class RectareaPeri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int l=sc.nextInt();
        int b=sc.nextInt();

        int peri=2*(l+b);
        int area=l*b;

        System.out.println("The area is "+area+" and perimeter is "+peri);

    }

}
