import java.util.*;
public class CS_validTraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter all the three angles ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a+b+c == 180 ){
            System.out.println("It is a valid triangle ");
        }else{
              System.out.println("It is not a valid triangle ");
        }


    }
}
