package loops;

import java.util.Scanner;

public class aPb {
    public static void main(String[] args) {

        int a=2;
        int b=10;

        int result=1;
        int count=0;
//        for (int i=1;i<=b;i++){
//            result=result*a;
//        }
//        System.out.println(result);

        while(count<b){
            result*=a;
            count++;
        }
        System.out.println(result);
    }

}
