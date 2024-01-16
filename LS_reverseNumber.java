public class LS_reverseNumber {
    public static void main(String[] args) {
        int n =  3416 ;

        int sum = 0 ;


        while(n>0){

            int d = n%10 ;

            sum = sum*10 + d ; 

            n = n/10 ;
        }

        System.out.println(sum);
    }
}
