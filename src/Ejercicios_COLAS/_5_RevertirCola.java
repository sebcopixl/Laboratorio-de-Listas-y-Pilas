package Ejercicios_COLAS;

public class _5_RevertirCola {

    public static void main(String[] args) {
        Cola cola = new Cola();

        cola.enqueue(1);
        cola.enqueue(2);
        cola.enqueue(3);

        revertirCola(cola);

        System.out.print("Cola después de la reversión: ");
        cola.imprimir();
    }

    public static void revertirCola(Cola cola) {
        if (cola.isEmpty()) {
            return;
        }

        int tamaño = cola.size();
        int[] elementos = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            elementos[i] = cola.dequeue();
        }

        for (int i = tamaño - 1; i >= 0; i--) {
            cola.enqueue(elementos[i]);
        }
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

        // Se verifica si la cola está vacía
        public boolean isEmpty() {
            return tamaño == 0;
        }

        // Se verifica el tamaño de la cola
        public int size() {
            return tamaño;
        }

        // Se verifica el primer elemento de la cola
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

