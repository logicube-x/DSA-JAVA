package loops.while_loop;

import java.util.Scanner;

public class digit_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int digit;
        int sum=0;

        while(n!=0){
            digit=n%10;
            sum+=digit;
            n=n/10;
        }
        System.out.println(sum);
    }

}
