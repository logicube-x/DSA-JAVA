package loops;

import java.util.Scanner;

public class evenOdd_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int eSum=0;
        int oSum=0;
        for (int i=1;i<=n;i++){
            if(i%2==0){
                eSum+=i;
            }
            else {
                oSum+=i;
            }

        }
        System.out.println("Even sum :"+eSum);
        System.out.println("Odd sum :"+oSum);
    }

}
