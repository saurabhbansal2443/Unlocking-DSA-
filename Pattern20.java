public class Pattern20 {
    public static void main(String[] args) {
        int n= 9 ;

        for(int i=1 ; i<=n;i++){ //rows 

            for(int j=1 ; j<=n;j++){ //rowsprint 
                if(j==1 || j==n || (i==j && j<=n/2+1) || (i+j==n+1 && i<=n/2+1)){
                    System.out.print("*  ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
