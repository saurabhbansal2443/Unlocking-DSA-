import java.util.ArrayList;

public class ArrayListFindTheCommonElelemntsBetweenTwoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(90);
        // [10,20,30,40,50,90];

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(10);
        list2.add(40);
        list2.add(30);
        list2.add(50);
        list2.add(40);
         list2.add(90);

        // [10,20,30,10,40,30,50,40];

        ArrayList<Integer> ans = new ArrayList<>();

        if (list.size() < list2.size()) { // we will loop our first list

            for (int i = 0; i < list.size(); i++) {

                int ele = list.get(i);

                if (list2.contains(ele) == true) {
                    ans.add(ele);
                }

            }
        } else { // we will loop the second one
            for (int i = 0; i < list2.size(); i++) {

                int ele = list2.get(i);

                if (list.contains(ele) == true) {
                    ans.add(ele);
                }

            }
        }

        System.out.println(ans);
    }
}
