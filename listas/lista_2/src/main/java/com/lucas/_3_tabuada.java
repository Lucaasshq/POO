package com.lucas;

import java.util.Scanner;

public class _3_tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(i + " x " + n +" = "+ i*n);
        }

    }
}
