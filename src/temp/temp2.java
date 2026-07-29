package temp;

import java.util.Scanner;

public class temp2 {
    public static void main(String[] args) {
//        opened hackerrank and explored the platform
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int digit;
        int rev=0;
        int copy=n;
        while(n!=0){
            digit=n%10;
            rev=(rev*10)+digit;
            n/=10;
        }

        System.out.println(rev==copy?"palimdrome":"Not palindrome");

    }

}
