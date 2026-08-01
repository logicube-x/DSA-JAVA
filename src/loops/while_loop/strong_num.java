package loops.while_loop;

import java.util.Scanner;

public class strong_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int copy=n;
        int digit;
        int sum=0;
        while(n>0){
            int fact=1;
            digit=n%10;
            n/=10;

            for(int i=1;i<=digit;i++){
                fact*=i;

            }
            sum+=fact;
        }

        System.out.println(sum==copy?"Strong Number":"Not strong number");
    }

}
