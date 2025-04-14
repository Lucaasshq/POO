package org.aula_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Olá");

        int[] ar = {1,2,3,4,5,6};

//        for (int i : ar){
//            System.out.println(i);
//        }

        System.out.println(ar.length);

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Lucas");
        nomes.add("Ana");
        nomes.add("João");
        nomes.add("Carla");

        System.out.println(nomes);

        System.out.println(nomes.size());

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int e1 = leitor.nextInt();
        System.out.println("Número digitado: " + e1);

    }


}