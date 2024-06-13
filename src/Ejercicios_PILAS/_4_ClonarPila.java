package Ejercicios_PILAS;

// Clase de prueba para clonar una pila sin estructuras de datos adicionales
public class _4_ClonarPila {

    public static void main(String[] args) {

        int[] pila = {1, 2, 3, 45, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int[] clon = clonarPila(pila);

        System.out.print("Clon de la pila: ");
        imprimirPila(clon);
    }

    public static int[] clonarPila(int[] pila) {
        int[] clon = new int[pila.length];
        for (int i = 0; i < pila.length; i++) {
            clon[i] = pila[i];
        }
        return clon;
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

