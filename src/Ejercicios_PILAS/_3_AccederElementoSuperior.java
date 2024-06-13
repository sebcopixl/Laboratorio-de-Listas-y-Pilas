package Ejercicios_PILAS;

public class _3_AccederElementoSuperior {

    public static void main(String[] args) {

        // Aca se puede agregar cualquier integer para probar el programa
        int[] pila = {1, 2, 17, 3};

        int elementoSuperior = accederElementoSuperior(pila);

        System.out.println("Elemento superior de la pila: " + elementoSuperior);
    }

    public static int accederElementoSuperior(int[] pila) {
        if (pila.length > 0) {
            return pila[pila.length - 1];
        }
        return -1;
    }
}

