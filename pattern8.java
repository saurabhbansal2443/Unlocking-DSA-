public class pattern8 {
    public static void main(String[] args) {
        int  n= 5 ;

        int nst = 1 ;

        for(int i=1 ; i<=n;i++){ // rows 
            
            for(int j=1 ; j<=(n-i);j++){ // spaces 
                System.out.print("\t");
            }

            for(int k=1 ; k<=nst;k++){
                System.out.print("*\t");
            }
        }
    }
}
