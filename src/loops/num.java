package loops;

import java.util.Scanner;

public class num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        int n=sc.nextInt();
        int m=sc.nextInt();

    for(int i=1;i<=n;i++){
        System.out.printf(i+" ");
    }
        System.out.println();
    for(int j=m;j>=1;j--){
        System.out.printf(j+" ");
    }

    }

}
