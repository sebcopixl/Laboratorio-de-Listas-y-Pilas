package Ejercicios_LISTAS;
/*3.	Contar  Ocurrencias:  Escribe  un  programa  que  cuente  cu´antas  veces  aparece  un  nu´mero espec´ıfico en una lista.
Ejemplo: lista = [1, 2, 2, 3, 2, 4], nu´mero = 2 → 3
*/

public class _3_ContarOcurrencias {
    public static void main(String[] args) {
        int[] lista = {1, 5, 5, 3, 5, 4};
        int numero = 5;

        int contador = 0;

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == numero) {
                contador++;
            }
        }

        System.out.println("El número " + numero + " aparece " + contador + " veces.");
    }
}

