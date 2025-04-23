package com.lucas;

import java.util.ArrayList;

public class _for {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
         nomes.add("Pedro");
         nomes.add("gomez");
         nomes.add("Dudu");

        for (String nome : nomes){
            System.out.println(nome);
        }
    }
}
