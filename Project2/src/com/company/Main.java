package com.company;

import java.util.Scanner;
public class Main {
    //Function to right-rotate an array by one position
    static void rotate_right_one(int[] a, int n) {
        int last = a[n - 1]; //Store the last element of the array in 'last'
        for (int i = n - 2; i >= 0; i--)
            a[i + 1] = a[i]; //Shift elements one position to the right
        a[0] = last; //Place the stored 'last' element at the beginning of the array
    }
    //Function to right-rotate an array by `k` positions
    static void rotate_right(int[] a, int k, int n) {
        for (int i = 0; i < k; i++)
            rotate_right_one(a, n); //Rotate the array one position to the right `k` times
    }
    //Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k;
        int[] a = { 35, 42, 5, 15, 27, 29 }; //Define an array 'a' with initial values
        System.out.println("Enter the value of k:");
        k = sc.nextInt(); //Read the value of `k` from the user
        int n = a.length; //Get the length of the array `a`
        rotate_right(a, k, n); //Right-rotate the array `a` by `k` positions
        //Print the rotated array
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
