package com.lucas;

import java.util.ArrayList;

public class listas {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();

        lista.add("Lucas");
        lista.add("Maria");
        lista.add("João");
        lista.add("Ana");

        for (String i: lista) {
            System.out.println(i);
        }

        for (int x = 0; x < lista.size(); x++) {
            System.out.println("index: " + x + " -> " + lista.get(x));
        }
    }
}
