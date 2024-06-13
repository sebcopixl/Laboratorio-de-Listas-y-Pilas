package Ejercicios_LISTAS;
/*2.	Encontrar el M´aximo: Escribe un programa que encuentre el nu´mero m´aximo en una lista de nu´meros.
        Ejemplo: [3, 1, 4, 1, 5] → 5
*/

public class _2_MaximoElemento {
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 1, 5, 7, 13, 17};

        int maximo = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maximo) {
                maximo = nums[i];
            }
        }

        System.out.println("El número máximo es: " + maximo);
    }
}
