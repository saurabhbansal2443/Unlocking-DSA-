public class Pattern14 {
    public static void main(String[] args) {
        int n = 7 ;

        int nsp = n/2 ;
        int nst = 1 ;

        for(int i=1 ; i<=n;i++){ // rows 

            for(int j=1 ; j<=nsp ; j++){ // spaces 
                System.out.print("\t");
            }

            for(int k=1 ; k<=nst ; k++){ // stars 
                if(k==1 || k==nst){
                System.out.print("*\t");
                }else{
                    System.out.print("\t"); 
                }
            }

            System.out.println();

            if(i<=n/2){
                nst+=2;
                nsp--;
            }else{
                nst-=2;
                nsp++;
            }
    }
    }
}
