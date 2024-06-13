package Ejercicios_COLAS;

public class _2_PrimeroEnCola {

    public static void main(String[] args) {
        Cola cola = new Cola();

        cola.enqueue(7);
        cola.enqueue(2);
        cola.enqueue(89);

        System.out.println("Primer elemento de la cola: " + cola.peek());
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

        public int peek() {
            if (tamaño == 0) {
                System.out.println("La cola está vacía");
                return -1;
            }
            return elementos[frente];
        }
    }
}

