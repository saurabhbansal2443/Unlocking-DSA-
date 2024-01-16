public class Pattern11 {
   public static void main(String[] args) {
       int n = 3 ;

       int nsp = n-1 ;
       int nst = 1;

       for(int i=1 ; i<=(2*n-1);i++){ // rows 
            for(int j=1 ; j<=nsp ;j++){ // spaces 
                System.out.print("\t");
            }

            for(int k=1 ; k<=nst;k++){ // stars 
                System.out.print("*\t");
            }

            System.out.println();

            if(i<n){
                nsp--;
                nst++;
            }else{
                nsp++;
                nst--;
            }
       }
   }
}

