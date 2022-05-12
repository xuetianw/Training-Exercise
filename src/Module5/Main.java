package Module5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    //1.1
    static int getPoints(String color){
        if (color.equals("green")) {
            return 5;
        }

        if (color.equals("Red")) {
            return 10;
        }

        if (color.equals("Yellow")) {
            return 15;
        }
        else {
            return 0;
        }
    }

    //1.2
    static long sumOfNumbersUpTo(int num) {
        long sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    //1.3
    void displayTimesTable(int num) {
        for (int i = 0; i <= 12; i++) {
            System.out.println(i + " x " + num + " = " +  num * 3);
        }
        System.out.println("____________________________________");
    }

    //2.1
    boolean leapYear(int year) {
        if (year % 4 == 0) {
            if(year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }


    //2.2
    boolean arrayContains(String[] arr, String str) {
        for (String ele : arr) {
            if (ele.equals(str)) {
                return true;
            }
        }
        return false;
    }

    //2.3
    int arrayFrequency(int[] arr, int num){
        int numOfOccurance = 0;
        for (int el : arr) {
            if (num == el) {
                numOfOccurance ++;
            }
        }
        return numOfOccurance;
    }

    //2.4
    int maxNumber(int[] arr) {
        int highest = arr[0];
        for (int num :arr) {
            if (num > highest) {
                highest = num;
            }
        }
        return highest;
    }


    //2.5
    int[] extractEvenArray(int[] arr) {
        List<Integer> evenList = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0) {
                evenList.add(num);
            }
        }
        int[]arr2 = new int[evenList.size()];
        for (int i = 0; i < evenList.size(); i++) {
            arr2[i] = evenList.get(i);
        }
        return arr2;
    }


    //2.6
    String[] reverseStringArray(String[] arr) {
        for (int i = 0; i < (arr.length - 1) / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    //2.7
    boolean isAnagram(String arg1, String arg2) {
        if (arg1.length() != arg2.length()) return false;
        int[] arr1 = new int[32];
        int[] arr2 = new int[32];
        for (int i = 0; i < arg1.length(); i++) {
            arr1[i] = arg1.charAt(i) - 'a';
            arr2[i] = arg2.charAt(i) - 'a';
        }
        for (int i = 0; i < arg1.length(); i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    double medianNumber(double[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }

    public static void main(String[] args) {
        int points = getPoints("green");
        System.out.println("You’ve scored " +points+ " points!");
        System.out.println(sumOfNumbersUpTo(5));
    }
}
