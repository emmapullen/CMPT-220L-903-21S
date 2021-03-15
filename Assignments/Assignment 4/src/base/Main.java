package base;

import java.util.Arrays;
public class Main {
    static int arr[] = {10, 11, 12, 13};

    static int summation() {
        int sum = 0;
        int i;
        for (i = 0; i < arr.length; i++)
            sum += arr[i];

        return sum;
    }
    public static void main(String[] args){
        System.out.println(summation());
    }
}