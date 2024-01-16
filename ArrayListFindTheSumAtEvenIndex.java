import java.util.ArrayList;

public class ArrayListFindTheSumAtEvenIndex {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // [10,20,30,40,50];

        int sum = 0 ;

        for(int i=0;i<list.size();i++){

            if(i%2==0){
                sum = sum + list.get(i);
            }
        }

        System.out.println(sum);

    }
}
