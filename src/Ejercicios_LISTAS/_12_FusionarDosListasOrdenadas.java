package Ejercicios_LISTAS;

/**
 * Clase de prueba de Lista Enlazada
 *
 * @auther Prof. Derlis Zarate (profderliszarate@gmail.com)
 * @auther Prof. Saúl Zalimben (szalimben93@gmail.com)
 */

/**
 * Tal como se conmverso en clase con el profesor,
 * este codigo proorcionado originalmente
 * por el profe Saul Zalimben fue modificado para
 * que se ajuste a la consigna de la tarea.
 * Para realizar este programa
 * se utilizaron como base los archivos
 * NodoLista.java y PruebaLista.java y ListaEnlazadaSimple.java
 * del repositorio mencionado
 * ------------------------------------------------
 * Alumno: Sebastian Eduardo Correa Hermosa
 * CI: 3.527.545
 **/

public class _12_FusionarDosListasOrdenadas {

    public static void main(String[] args) {

        //Tanto en la lista1 como en la lista2 se pueden agregar integers aleatorios para probar el programa

        // Se crea la primnera lista de Integers
        ListaEnlazadaSimple<Integer> lista1 = new ListaEnlazadaSimple<>();
        lista1.insertarAlFinal(84);
        lista1.insertarAlFinal(23);
        lista1.insertarAlFinal(12);

        // Se crea la segunda lista de Integers
        ListaEnlazadaSimple<Integer> lista2 = new ListaEnlazadaSimple<>();
        lista2.insertarAlFinal(45);
        lista2.insertarAlFinal(67);
        lista2.insertarAlFinal(89);

        ListaEnlazadaSimple<Integer> listaMezclada;
        listaMezclada = mezclar(lista1, lista2);
        listaMezclada.imprimir();
    }

    public static ListaEnlazadaSimple<Integer> mezclar(
            ListaEnlazadaSimple<Integer> lista1,
            ListaEnlazadaSimple<Integer> lista2) {
        ListaEnlazadaSimple<Integer> listaMezclada = new ListaEnlazadaSimple<>();
        Nodo<Integer> actualLista1 = lista1.getPrimero();
        Nodo<Integer> actualLista2 = lista2.getPrimero();

        // Este conjunto de verificacines ve qye haya elementos en ambas listas
        while (actualLista1 != null && actualLista2 != null) {
            // Aca se compraran los lementos se agrega el menor a la lista mezclada
            if (actualLista1.getDato() < actualLista2.getDato()) {
                listaMezclada.insertarOrdenado(actualLista1.getDato());
                actualLista1 = actualLista1.getSiguiente();
            } else {
                listaMezclada.insertarOrdenado(actualLista2.getDato());
                actualLista2 = actualLista2.getSiguiente();
            }
        }

        // Este conjunto de verificacines ve que los elementos que quedan se agregan a la lista que aún tiene elementos
        while (actualLista1 != null) {
            listaMezclada.insertarOrdenado(actualLista1.getDato());
            actualLista1 = actualLista1.getSiguiente();
        }
        while (actualLista2 != null) {
            listaMezclada.insertarOrdenado(actualLista2.getDato());
            actualLista2 = actualLista2.getSiguiente();
        }

        return listaMezclada;
    }
}

class ListaEnlazadaSimple<T> {
    private Nodo<T> primero;

    ListaEnlazadaSimple() {
        primero = null;
    }

    public Nodo<T> getPrimero() {
        return primero;
    }

    //Este seria el metodo encargado de insertar un elemento al final de la lista
    public void insertarAlFinal(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (primero == null) {
            primero = nuevoNodo;
        } else {
            Nodo<T> temp = primero;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
        }
    }

    // Este seria el metodo encargado de insertar un elemento de manera ordenada
    public void insertarOrdenado(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (primero == null || primero.getDato().hashCode() > dato.hashCode()) {
            nuevoNodo.setSiguiente(primero);
            primero = nuevoNodo;
        } else {
            Nodo<T> actual = primero;
            while (actual.getSiguiente() != null && actual.getSiguiente().getDato().hashCode() < dato.hashCode()) {
                actual = actual.getSiguiente();
            }
            nuevoNodo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevoNodo);
        }
    }

    // Este seria el metodo encargado de imprimir los elementos de la lista
    public void imprimir() {
        Nodo<T> temp = primero;
        while (temp != null) {
            System.out.print(temp.getDato() + " ");
            temp = temp.getSiguiente();
        }
    }
}

// Esta seria la clase Nodo que representa un elemento indimvidual de la lista
// Tiene dos atributos: 'dato' que guarda el valor del nodo y 'siguiente' que apunta al siguiente nodo
class Nodo<T> {
    T dato;
    Nodo<T> siguiente;

    Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public T getDato() {
        return dato;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
}

