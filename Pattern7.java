public class Pattern7 {
    public static void main(String[] args) {
        int n = 5 ;

        for(int i=1;i<=n;i++){ // rows 

            for(int j=1 ; j<=(i-1) ; j++){ // spaces 
                System.out.print("\t");
            }

            for(int k=1;k<=(n+1-i);k++){ //stars 
                System.out.print("*\t");
            }

            System.out.println();
        }
    }
}
