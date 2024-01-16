public class Pattern9 {
    public static void main(String[] args) {
        int n = 5 ;

        int nst = 2*n-1;

        for(int i=1;i<=n;i++){ // rows 

            for(int j=1 ; j<=(i-1);j++){ // spaces 
                System.out.print("\t");
            }

            for(int k=1 ; k<=nst;k++){ // stars 
                System.out.print("*\t");
            }

            System.out.println();
            nst -= 2 ;
        }
    }
}
