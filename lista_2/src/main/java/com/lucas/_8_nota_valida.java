package com.lucas;

import java.util.Locale;
import java.util.Scanner;

public class _8_nota_valida {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double nota, soma = 0;
        int contador = 0;

        while (contador < 2){
            nota = sc.nextDouble();

            if (nota >= 0 && nota <= 10) {
                soma += nota;
                contador++;
            }else {
                System.out.println("nota invalida");
            }
        }

        double media = soma / 2.0;
        System.out.println("media = "+ String.format("%.2f", media));
    }
}
