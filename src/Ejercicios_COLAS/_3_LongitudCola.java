package Ejercicios_COLAS;

public class _3_LongitudCola {

    public static void main(String[] args) {
        Cola cola = new Cola();

        cola.enqueue(1);
        cola.enqueue(2);
        cola.enqueue(3);

        System.out.println("Longitud de la cola: " + cola.size());
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

        public int size() {
            return tamaño;
        }
    }
}

