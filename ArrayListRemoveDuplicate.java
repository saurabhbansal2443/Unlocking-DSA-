import java.util.ArrayList;

public class ArrayListRemoveDuplicate {
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(40);
        list.add(30);
        list.add(50);
        list.add(40);

        // [10,20,30,10,40,30,50,40];

        // System.out.println(list.contains(90));

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<list.size();i++){

            int ele = list.get(i);

            if(ans.contains(ele)==false){
                ans.add(ele);
            }

        }

        System.out.println(ans);
    }
}
