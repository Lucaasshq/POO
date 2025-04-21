package org.Lucas;

import java.util.Scanner;

public class _4x {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();

        String[] meses = {
                "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
        };

        if (mes  >= 1 && mes <= 12) {
            System.out.println(meses[mes - 1]);
        }
    }
}
