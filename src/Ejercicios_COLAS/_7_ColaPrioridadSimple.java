package Ejercicios_COLAS;

public class _7_ColaPrioridadSimple {

    public static void main(String[] args) {
        ColaPrioridad cola = new ColaPrioridad();

        // Aca se crean elementos con su respectiva prioridad
        cola.enqueue(1, 2); // Elemento: 1, Prioridad: 2
        cola.enqueue(3, 1); // Elemento: 3, Prioridad: 1

        System.out.println("Elemento con máxima prioridad: " + cola.dequeue());
    }

    static class ColaPrioridad {
        private static final int CAPACIDAD = 100;
        private int[] elementos;
        private int[] prioridades;
        private int tamaño;
        private int frente;
        private int fin;

        public ColaPrioridad() {
            this.elementos = new int[CAPACIDAD];
            this.prioridades = new int[CAPACIDAD];
            this.tamaño = 0;
            this.frente = 0;
            this.fin = -1;
        }

        public void enqueue(int elemento, int prioridad) {
            if (tamaño == CAPACIDAD) {
                System.out.println("La cola está llena");
                return;
            }
            fin = (fin + 1) % CAPACIDAD;
            elementos[fin] = elemento;
            prioridades[fin] = prioridad;
            tamaño++;
        }

        public int dequeue() {
            if (tamaño == 0) {
                System.out.println("La cola está vacía");
                return -1;
            }
            int indiceMaxPrioridad = 0;
            for (int i = 1; i < tamaño; i++) {
                if (prioridades[i] < prioridades[indiceMaxPrioridad]) {
                    indiceMaxPrioridad = i;
                }
            }
            int elemento = elementos[indiceMaxPrioridad];
            eliminarElemento(indiceMaxPrioridad);
            return elemento;
        }

        private void eliminarElemento(int indice) {
            for (int i = indice; i < tamaño - 1; i++) {
                elementos[i] = elementos[i + 1];
                prioridades[i] = prioridades[i + 1];
            }
            tamaño--;
            fin = (fin - 1 + CAPACIDAD) % CAPACIDAD;
        }
    }
}

