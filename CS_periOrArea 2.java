public class CS_periOrArea {
    public static void main(String[] args) {
        int l = 3 ;
        int b = 4 ;

        int area = l*b ; // area => length * breadth

        int perimeter = 2*(l+b) ; // perimeter => 2*(length + breadth ) 

        if(area>perimeter){
            System.out.println(area);
        }else if ( perimeter > area ){
            System.out.println();
        }


    }
}
