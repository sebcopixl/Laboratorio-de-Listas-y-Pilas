package Ejercicios_COLAS;

public class _4_VerificarColaVacia {

    public static void main(String[] args) {
        // Creamos una cola
        Cola cola = new Cola();

        // Aca lo que se hace es encolar un elemento y luego lo desencolamos para probar el programa en si
        cola.enqueue(1);
        cola.dequeue();

        // Verificamos si la cola está vacía
        System.out.println("La cola está vacía: " + cola.isEmpty());
    }

    static class Cola {
        private static final int CAPACIDAD = 100;
        private int[] elementos;
        private int tamaño;
        private int frente;
        private int fin;

        public Cola() {
            this.elementos = new int[CAPACIDAD];
            this.tamaño = 0;
            this.frente = 0;
            this.fin = -1;
        }

        public void enqueue(int elemento) {
            if (tamaño == CAPACIDAD) {
                System.out.println("La cola está llena");
                return;
            }
            fin = (fin + 1) % CAPACIDAD;
            elementos[fin] = elemento;
            tamaño++;
        }

        public void dequeue() {
            if (tamaño == 0) {
                System.out.println("La cola está vacía");
                return;
            }
            frente = (frente + 1) % CAPACIDAD;
            tamaño--;
        }

        public boolean isEmpty() {
            return tamaño == 0;
        }
    }
}

