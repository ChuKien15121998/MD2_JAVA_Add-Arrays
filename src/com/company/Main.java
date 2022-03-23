package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arrNumber1 = {15,12,98};
        int[] arrNumber2 = {9,4,7,5};
        int[] arrNumber3 = new int[7];
        for (int i = 0; i < arrNumber1.length; i++) {
            arrNumber3[i] = arrNumber1[i];
        }
        for (int i = 0; i < arrNumber2.length; i++) {
            arrNumber3[arrNumber1.length + i] = arrNumber2[i];
        }
        for (int i = 0; i < arrNumber3.length; i++) {
            System.out.println(arrNumber3[i]);
        }
    }
}
