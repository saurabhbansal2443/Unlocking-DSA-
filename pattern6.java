public class pattern6 {
    public static void main(String[] args) {
        int n = 7 ;

        for(int i=1 ; i<=n ; i++){ // rows 

            for(int j=1 ; j<=(n-i);j++){ //spaces 
                System.out.print("\t");
            }

            for(int j=1 ; j<=i;j++){ // stars 
                System.out.print("*\t");
            }

            System.out.println();

        }
    }
}
