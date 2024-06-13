package Ejercicios_COLAS;

public class _6_IntercalarColas {

    public static void main(String[] args) {
        Cola cola1 = new Cola();
        Cola cola2 = new Cola();

        cola1.enqueue(1);
        cola1.enqueue(3);
        cola1.enqueue(5);

        cola2.enqueue(2);
        cola2.enqueue(4);
        cola2.enqueue(6);

        Cola colaIntercalada = intercalarColas(cola1, cola2);

        System.out.print("Cola intercalada: ");
        colaIntercalada.imprimir();
    }

    public static Cola intercalarColas(Cola cola1, Cola cola2) {
        Cola colaIntercalada = new Cola();

        while (!cola1.isEmpty() || !cola2.isEmpty()) {
            if (!cola1.isEmpty()) {
                colaIntercalada.enqueue(cola1.dequeue());
            }
            if (!cola2.isEmpty()) {
                colaIntercalada.enqueue(cola2.dequeue());
            }
        }

        return colaIntercalada;
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

        public boolean isEmpty() {
            return tamaño == 0;
        }

        public void imprimir() {
            System.out.print("[");
            for (int i = frente, contador = 0; contador < tamaño; contador++) {
                System.out.print(elementos[i]);
                i = (i + 1) % CAPACIDAD;
                if (contador < tamaño - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}

