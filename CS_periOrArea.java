public class CS_periOrArea {
    public static void main(String[] args) {
        int l = 5 ;
        int b = 5 ;

        int area = l*b ; // area => length * breadth

        int perimeter = 2*(l+b) ; // perimeter => 2*(length + breadth ) 

        if(area>perimeter){
            System.out.println("area -> " + area);
        }else if ( perimeter > area ){
            System.out.println("perimeter -> " + perimeter);
        }else{
            System.out.println("Both area and perimeter are equal ");
        }


    }
}
