package loops.while_loop;

public class digit {
    public static void main(String[] args) {
       int num=4561;
       int digit;
       int sum=0;
       while (num!=0){
            digit=num%10;
            sum+=digit;
            num=num/10;
       }
        System.out.println(sum);

    }

}
