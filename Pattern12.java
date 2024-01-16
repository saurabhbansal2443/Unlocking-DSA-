public class Pattern12 {
    public static void main(String[] args) {
        int n = 5 ;

        int nsp  = n-1 ;
        int nst = 1 ;

        for(int i=1 ; i<=(2*n-1) ; i++){ // rows 

            for(int j=1 ; j<=nsp ; j++){ // spaces 
                System.out.print("\t");
            }

            for(int k=1 ; k<=nst ;k++){ // stars 
                System.out.print("*\t");
            }   

            System.out.println();

            if(i<n){
                nst+=2;
                nsp--;
            }else{
                nst-=2;
                nsp++;
            }
        }
    }
}
