package Ejercicios_LISTAS;

import java.util.ArrayList;
import java.util.List;

public class _11_SubListasSumaEspecifica {
    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4, 5};
        int S = 5;

        System.out.print("Lista original: ");
        mostrarLista(lista);

        List<List<Integer>> sublistas = encontrarSublistasConSuma(lista, S);

        System.out.println("Sublistas con suma " + S + ": " + sublistas);
    }

    public static List<List<Integer>> encontrarSublistasConSuma(int[] lista, int S) {
        List<List<Integer>> sublistas = new ArrayList<>();

        for (int i = 0; i < lista.length; i++) {
            int suma = 0;
            for (int j = i; j < lista.length; j++) {
                suma += lista[j];
                if (suma == S) {
                    List<Integer> sublista = new ArrayList<>();
                    for (int k = i; k <= j; k++) {
                        sublista.add(lista[k]);
                    }
                    sublistas.add(sublista);
                }
            }
        }

        return sublistas;
    }

    public static void mostrarLista(int[] lista) {
        System.out.print("[");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]);
            if (i < lista.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

