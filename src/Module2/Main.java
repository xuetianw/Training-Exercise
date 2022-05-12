package Module2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        //1.1
        String[] arr = {"Fred", "Jason", "Stephen", "Ash", "Purva"};
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        arr[3] = "Jerry";
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length - 1]);
        arr[1] = null;

        //1.2
        String[] pokerHand = new String[5];
        pokerHand[0] = "Queen of hearts";
        pokerHand[1] = "3 of spade";
        pokerHand[2] = "3 of diamonds";
        pokerHand[3] = "9 of heart";
        pokerHand[4] = "6 of clubs";



        //2.1

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("milk");
        arrayList.add("cereals");
        arrayList.add("apples");
        arrayList.add("oranges");
        arrayList.add("bread");

        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(4));
        arrayList.remove("bread");
        System.out.println(arrayList.size());
        arrayList.remove(2);
        arrayList.add("potatoes");
        arrayList.add("olive oil");
        arrayList.add("chicken");
        Collections.sort(arrayList);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(arrayList.size() - 1));
//

        //2.2
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(75000);
        arrayList1.add(25000);
        arrayList1.add(42000);
        arrayList1.add(30000);
        arrayList1.add(55000);
        arrayList1.add(42000);
        arrayList1.add(39000);

        System.out.println(Collections.max(arrayList1));
        System.out.println(Collections.min(arrayList1));

        System.out.println(Collections.frequency(arrayList1, 42000));
        Collections.sort(arrayList1);
        System.out.println(arrayList1.get(arrayList1.size() / 2 - 1));
        Collections.reverse(arrayList1);
        System.out.println(arrayList1);

    }
}