package Ejercicios_PILAS;

public class _1_EliminarElementoPila {

    public static void main(String[] args) {

        int[] pila = {1, 2, 3, 4};

        System.out.print("Pila original: ");
        imprimirPila(pila);

        pila = eliminarElementoSuperior(pila);

        System.out.print("Pila después de la eliminación: ");
        imprimirPila(pila);
    }

    public static int[] eliminarElementoSuperior(int[] pila) {
        if (pila.length > 0) {
            int[] nuevaPila = new int[pila.length - 1];
            for (int i = 0; i < nuevaPila.length; i++) {
                nuevaPila[i] = pila[i];
            }
            return nuevaPila;
        }
        return pila;
    }

    public static void imprimirPila(int[] pila) {
        System.out.print("[");
        for (int i = 0; i < pila.length; i++) {
            System.out.print(pila[i]);
            if (i < pila.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
