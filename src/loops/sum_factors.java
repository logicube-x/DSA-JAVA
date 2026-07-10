package loops;

import java.util.Scanner;

public class sum_factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       int n=sc.nextInt();
       int sum=0;
       for(int i=1;i<=n/2;i++){
           if(n%i==0){
               sum+=i;

           }
       }
       sum+=n;
       System.out.println(sum);

    }

}
