package Module4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1.1
        String[] courses = {"UNIX", "SQL", "Java", "Python", "Web Apps"};
        for (String str : courses) {
            System.out.println("I love learning " + str);
        }

        System.out.println("____________________________________");


        //1.2
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : courses) {
            arrayList.add(str);
        }
        System.out.println("____________________________________");

        //1.3
        for (String str : courses) {
            System.out.println(str);
        }
        System.out.println("____________________________________");

        //1.4
        List<Double> prices = Arrays.asList(4.50, 1.99, 9.75, 3.15, 10.25);

        double total = 0;
        for (double price : prices) {
            total += price;
        }
        System.out.println(total);
        System.out.println("____________________________________");

        //1.5
        double[] array = new double[5];
        int index = 0;
        for (double price : prices) {
            array[index++] = price;
        }
        System.out.println("____________________________________");

        //1.6
        String str = "10,7,25,3,8";
        String[] arr = str.split(",");
        int total2 = 0;
        for (String num : arr) {
            total2 += Integer.parseInt(num);
        }
        System.out.println(total2);
        System.out.println("____________________________________");

        //1.7
        String str2 = "desrever neeb sah txet siht";
        char[] charArr = str2.toCharArray();

        String newStr = "";
        for (char ch : charArr) {
            newStr = ch + newStr;
        }
        System.out.println(newStr);
        System.out.println("____________________________________");


        //2.1
//        for (int i = 0; i < 1_000_000; i++) {
//            System.out.println(i);
//        }
//        System.out.println("____________________________________");

        //2.2
        long sum = 0;
        for (int i = 0; i <= 1_000_000; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("____________________________________");


        //2.3
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 1) {
                System.out.println(i + " is a odd number");
            }
        }
        System.out.println("____________________________________");

        //2.4
        for (int i = 0; i <= 12; i++) {
            System.out.println(i + " x 3 = " +  i * 3);
        }
        System.out.println("____________________________________");

        //2.5
        int[] scores = {25, 15, 99, 75, 47, 59, 82};
        for (int i = 1; i < scores.length; i += 2) {
            scores[i] += 1;
        }

        for (int num : scores) {
            System.out.println(num);
        }
        System.out.println("____________________________________");

        //2.6

        for (char s = 'b'; s <= 'z'; s += 1) {
            System.out.println(s);
        }
        System.out.println("____________________________________");

        //2.7
//        for (int i = 2; i <= 12; i++) {
//            for (int j = 1; j <= 12; j++) {
//                System.out.println(j + " x " + i + " = " +  i * j);
//            }
//        }
//        System.out.println("____________________________________");



        //3.1
        int i2 = 0;
        long sum2 = 0;
        while (i2 < 1_000_000) {
            sum2 += i2;
            i2++;
        }
        System.out.println(sum2);
        System.out.println("____________________________________");

        //3.2
        for (char ch = 'a'; ch <= 's'; ch += 1) {
            System.out.println(ch);
        }
        System.out.println("____________________________________");


        int i = 0;
        int j = 1;
        int k = 1;
        System.out.print(i + "," + j);
        while (k < 1000) {
            System.out.print("," + k);
            i = j;
            j = k;
            k = i + j;
        }
        System.out.println("____________________________________");

        //4.1;
        String[] cities = {"Glasgow", "London", "Birmingham", "Cardiff", "Manchester", "Newcastle"};
        for (String city : cities) {
            if (city.startsWith("B")) {
                break;
            }
        }
        System.out.println("____________________________________");

        //4.2
        int[] numbers = {6, 15, 75, 32, 89, 24, 103, 17, 5, 250, 63, 91};
        for (int num : numbers) {
            if (num > 100) {
                System.out.println(num);
                break;
            }
        }
        System.out.println("____________________________________");


    }
}
