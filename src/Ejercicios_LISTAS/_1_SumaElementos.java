package Ejercicios_LISTAS;
/*
1.	Suma  de  Elementos:  Escribe  un  programa  que  reciba  una  lista  de  nu´meros  y  devuelva  la suma de todos los elementos.
Ejemplo: [1, 2, 3, 4] → 10
*/

public class _1_SumaElementos {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        System.out.println("La suma de los números es: " + sum);

        for (int i = 0; i < nums.length; i++) {
            System.out.println("El número en la posición " + i + " es: " + nums[i]);
        }
    }
}
