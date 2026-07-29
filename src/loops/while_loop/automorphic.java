package loops.while_loop;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class automorphic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int digit;
        int count=0;
        int copy=n;
        while(n>0){
            count++;
            n=n/10;
        }
        System.out.println((copy*copy)%(int)Math.pow(10,count)==copy?"Automorphic":"Not Automorphic");
    }

}
