package Ejercicios_PILAS;

public class _9_ProfundidadMaximaParéntesis {

    public static void main(String[] args) {
        // Aca se puede agregar cualquier string para probar el programa
        String s = "(89+(71*7)+((45)/4))+0";

        int profundidad = profundidadMaximaParéntesis(s);

        System.out.println("Profundidad máxima de anidamiento: " + profundidad);
    }

    public static int profundidadMaximaParéntesis(String s) {
        int maxProfundidad = 0;
        int profundidadActual = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                profundidadActual++;
                maxProfundidad = Math.max(maxProfundidad, profundidadActual);
            } else if (c == ')') {
                profundidadActual--;
            }
        }

        return maxProfundidad;
    }
}

