package Ejercicios_PILAS;

/**
 * Clase de prueba Pila
 *
 * @autor Prof. Derlis Zarate (profderliszarate@gmail.com)
 * @autor Prof. Saúl Zalimben (szalimben93@gmail.com)
 */

/**
 * Tal como se conversó en clase con el profesor,
 * este código proporcionado originalmente
 * por el profe Saul Zalimben fue modificado para
 * que se ajuste a la consigna de la tarea.
 * ------------------------------------------------
 * Alumno: Sebastian Eduardo Correa Hermosa
 * CI: 3.527.545
 **/
public class _10_HistorialdeBusquedaWeb {

    static String[] backHistory = new String[100]; // Pila para el historial de retroceso
    static String[] forwardHistory = new String[100]; // Pila para el historial de avance
    static int backTop = -1; // Tope de la pila de retroceso
    static int forwardTop = -1; // Tope de la pila de avance
    static String currentUrl; // URL actual

    public static void main(String[] args) {
        initPage("https://www.google.com"); // Esta sería la página de inicio
        visit("https://www.facebook.com");
        visit("https://www.youtube.com");
        visit("https://www.x.com");

        /*
         * En la impresión final "x.com"
         * ya no aparece en el historial de avance
         * dado que fue borrado
         * a lo largo del proceso
         * de retroceso y avance
         * forwardHistory.clear()
         * */

        String urlBack = back(1); // Debería devolver https://www.youtube.com ya que retrocedo una página (1 paso)
        System.out.println("Retroceder 1 paso: " + urlBack);

        visit("https://www.linkedin.com"); // Visitando una nueva URL debería borrar el historial de avance

        String urlForward = forward(1); // No debería avanzar ya que visitamos una nueva URL, entonces debería permanecer en LinkedIn
        System.out.println("Avanzar 1 paso: " + urlForward);

        urlBack = back(3); // Debería devolver https://www.google.com ya que retrocedo 3 páginas (3 pasos)
        System.out.println("Retroceder 3 pasos: " + urlBack);

        // Imprimir la secuencia completa
        System.out.println("Secuencia completa:");
        System.out.println("URL actual: " + currentUrl);
        System.out.print("Historial de avance: ");
        for (int i = 0; i <= forwardTop; i++) {
            System.out.print(forwardHistory[i] + " ");
        }
    }

    static void initPage(String homePageUrl) {
        visit(homePageUrl);
    }

    /**
     * Visita la URL desde la página actual. Borra todo el historial que se encuentra adelante.
     *
     * @param url La URL que se visita.
     */
    static void visit(String url) {
        if (currentUrl != null) {
            backPush(currentUrl);
        }
        currentUrl = url;
        forwardTop = -1; // Reinicia la pila de avance
    }

    /**
     * Retrocede steps pasos en el historial.
     *
     * @param steps cantidad de pasos a retroceder
     * @return URL actual luego de retroceder steps pasos
     **/
    static String back(int steps) {
        while (steps > 0 && backTop >= 0) {
            forwardPush(currentUrl);
            currentUrl = backPop();
            steps--;
        }
        return currentUrl;
    }

    /**
     * Avanza steps pasos en el historial.
     *
     * @param steps cantidad de pasos a avanzar
     * @return URL actual luego de avanzar steps pasos
     */
    static String forward(int steps) {
        while (steps > 0 && forwardTop >= 0) {
            backPush(currentUrl);
            currentUrl = forwardPop();
            steps--;
        }
        return currentUrl;
    }

    static void backPush(String url) {
        backHistory[++backTop] = url;
    }

    static String backPop() {
        return backHistory[backTop--];
    }

    static void forwardPush(String url) {
        forwardHistory[++forwardTop] = url;
    }

    static String forwardPop() {
        return forwardHistory[forwardTop--];
    }
}

