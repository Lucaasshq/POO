package com.lucas;

import java.util.*;

public class _4_maior_posicao {
    public static void main(String[] args) {
        int maior = 0;
        int posicao = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 100; i++) {
            int n = sc.nextInt();

            if (n > maior){
                maior = n;
                posicao = i;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);

    }
}
