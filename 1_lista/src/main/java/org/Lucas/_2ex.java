package org.Lucas;

import java.util.Locale;
import java.util.Scanner;

public class _2ex {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = (b*b) - (4*a*c);

        if (a == 0) {
            System.out.println("Impossivel calcular");
            return;
        }

        if (delta < 0 ) {
            System.out.println("Impossivel calcular");
        } else {
            double r1 = (-b + Math.sqrt(delta)) / (2 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("R1 = " + String.format("%.5f", r1));
            System.out.println("R2 = " + String.format("%.5f", r2));
        }
        sc.close();
    }
}
