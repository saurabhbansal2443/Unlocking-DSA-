import java.util.*;
public class LS_ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string ");

        String str = sc.next();

        String ans = "";

        for(int i= str.length()-1;i>=0;i-- ){
            char ch = str.charAt(i);

            ans = ans + ch ;
        }

        System.out.println(ans);
    }
}
