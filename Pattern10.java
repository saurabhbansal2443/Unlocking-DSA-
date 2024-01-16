public class Pattern10 {
    public static void main(String[] args) {
        int n = 3 ;

        int nst = 1 ;

        for(int i=1 ; i<=(2*n -1) ; i++){ // rows 

            for(int j=1 ; j<=nst;j++){
                System.out.print("*\t");
            }
            System.out.println();

            if(i<n){
                nst++;
            }else{
                nst--;
            }
        }
    }
}
