import java.util.*;
public class CS_MaxofTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter both the numbers ");

        int n = sc.nextInt();
        int m = sc.nextInt();

        if(n>m){
            System.out.println("n is greater " + n );
        }else if (m > n){
            System.out.println("m is greater " + m);
        }else {
            System.out.println("Both number are equal");
        }
    }
}
