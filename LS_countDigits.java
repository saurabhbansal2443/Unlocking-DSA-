public class LS_countDigits {
    public static void main(String[] args) {
        int n = 342;

        int count = 0 ;

        while(n>0){

            count++;

            n = n/10 ;
        }

        System.out.println(count);

    }
}
