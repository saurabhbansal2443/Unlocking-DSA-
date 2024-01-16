import java.util.*;
public class LS_armstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int og = n ;

        int sum = 0 ;

        while(n>0){

            int d = n%10 ;

            sum = sum + d*d*d;

            n = n/10 ;
        }

        if( sum == og ){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong number ");
        }
    }
}
