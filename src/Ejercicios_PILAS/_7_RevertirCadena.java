package Ejercicios_PILAS;

public class _7_RevertirCadena {

    public static void main(String[] args) {
        String cadena = "hola";

        String cadenaInvertida = revertirCadena(cadena);

        System.out.println("Cadena invertida: " + cadenaInvertida);
    }

    public static String revertirCadena(String cadena) {
        char[] caracteres = cadena.toCharArray();
        char[] resultado = new char[caracteres.length];
        int top = -1;

        for (char c : caracteres) {
            resultado[++top] = c;
        }

        StringBuilder cadenaInvertida = new StringBuilder();
        while (top >= 0) {
            cadenaInvertida.append(resultado[top--]);
        }

        return cadenaInvertida.toString();
    }
}

