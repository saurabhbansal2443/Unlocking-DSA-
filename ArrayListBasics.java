import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {
        
      ArrayList<Integer> list = new ArrayList<>();
    //   ArrayList<String> strList = new ArrayList<>();
    //   ArrayList<Boolean> boolList = new ArrayList<>();

        // add elements 
         list.add(10);
         list.add(20);
         list.add(1,100);

         System.out.println(list);
        // get/Access  elements 

        int ele = list.get(1);

        // System.out.println(ele);

        //updating elements 
          list.set(1,99);

          System.out.println(list);
        // removing elemnts 

        list.remove(1);

        // list.clear();

        System.out.println(list);

        // checking size and empty arraylist 

       
        int size = list.size();

        list.clear();

        System.out.println(list.isEmpty());

    }
}
