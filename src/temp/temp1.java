package temp;


import java.util.Scanner;

public class temp1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
    int count=0;
        if(n<=1) System.out.println("Not prime");
        else if(n==2) System.out.print("prime");

        else{
            for(int i=3;i<=n/2;i+=2){
                if(n%i==0){
                    count++;
                }

            }
            System.out.println(count>0?"Not Prime":"Prime");
        }

    }
}
