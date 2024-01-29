package org.example;

public class MainGak {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        String s = "hej";
        System.out.println(s);

        int n = Integer.MAX_VALUE;
        n = n - 2000000000;

        String[] arr = new String[n];
        System.out.println(arr);
        arr[0] = "jeg er element 0";
        arr[1] = "jeg er element 1";
        arr[2] = "jeg er element 2";

        for (int i = 0; i < arr.length; i++) {

            arr[i] = "jeg er element " + i;
            if (i % 1000000 == 0) {
                System.out.println("element nr: " + i + " er:" + arr[i]);
            }
        }
    }
}
