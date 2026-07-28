package temp;

import basics.SumOfTwoNumbers;

import java.util.Scanner;

public class temp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int digit;
        int revv=0;
        while (n!=0){
            digit=n%10;
            revv=(revv*10)+digit;
            n/=10;

        }
        System.out.println(revv);
    }
}
