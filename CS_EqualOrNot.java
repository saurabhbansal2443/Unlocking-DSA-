import java.util.*;
public class CS_EqualOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter all the three number ");

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        if(n==m && m==k){
            System.out.println("All the number are equal ");
        }else {
            System.out.println("They are not equal ");
        }

    }
}
