import java.util.*;

public class LS_countVowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int count = 0 ;

        for(int i=0 ; i<str.length();i++){
            char ch = str.charAt(i);

            if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='U' || ch=='u' ){
                count++;
            }
        }

        System.out.println(count);
    }
}
