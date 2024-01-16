public class Patten19 {
    public static void main(String[] args) {
        int n = 9 ;

        for(int i=1 ; i<=n;i++){ //rows 

            for(int j=1 ; j<=n;j++){ // rows printing 
                if(i==1 || i==n/2+1 || i==n || (j==1 && i<=n/2+1) || (j==n && i>=n/2+1)){
                    System.out.print("*  ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
