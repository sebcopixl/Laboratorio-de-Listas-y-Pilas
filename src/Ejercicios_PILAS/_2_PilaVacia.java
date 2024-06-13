package Ejercicios_PILAS;

public class _2_PilaVacia {

    public static void main(String[] args) {

        //Aca se puede agregar cualquier elemnto a la pila para probar el programa en si
        int[] pila = {1,2,4}; // Pila vacía

        boolean estaVacia = verificarPilaVacia(pila);

        System.out.println("¿La pila está vacía? " + estaVacia);
    }

    public static boolean verificarPilaVacia(int[] pila) {
        return pila.length == 0;
    }
}

