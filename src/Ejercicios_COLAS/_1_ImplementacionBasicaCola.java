package Ejercicios_COLAS;

public class _1_ImplementacionBasicaCola {

    public static void main(String[] args) {
        Cola cola = new Cola();

        cola.enqueue(1);
        cola.enqueue(2);
        cola.enqueue(3);

        System.out.println("Elemento desencolado: " + cola.dequeue());
    }

    static class Cola {
        private static final int CAPACIDAD = 100;
        private int[] elementos;
        private int tamaño;
        private int frente;
        private int fin;

        //
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

        public int dequeue() {
            if (tamaño == 0) {
                System.out.println("La cola está vacía");
                return -1;
            }
            int elemento = elementos[frente];
            frente = (frente + 1) % CAPACIDAD;
            tamaño--;
            return elemento;
        }
    }
}
