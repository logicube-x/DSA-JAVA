package temp;

import basics.SumOfTwoNumbers;

import java.util.Scanner;

public class temp1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int copy=n;
    int digit;
    int rev=0;


        while(n>0){
            digit=n%10;
            rev=(rev*10)+digit;
            n/=10;
        }
        System.out.println(rev==copy?"Palindrome":"Not Palindrome");
    }
}
