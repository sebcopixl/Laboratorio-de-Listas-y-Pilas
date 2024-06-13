package Ejercicios_PILAS;

public class _5_EvaluarExpresionPostfija {

    public static void main(String[] args) {

        String expresion = "231*+9-";

        int resultado = evaluarExpresionPostfija(expresion);

        System.out.println("Resultado de la expresión postfija: " + resultado);
    }

    public static int evaluarExpresionPostfija(String expresion) {
        int a, b;
        char[] tokens = expresion.toCharArray();
        int[] pila = new int[expresion.length()];
        int top = -1; // Índice superior de la pila

        for (char token : tokens) {
            if (Character.isDigit(token)) {
                pila[++top] = token - '0';
            } else {
                b = pila[top--];
                a = pila[top--];
                switch (token) {
                    case '+':
                        pila[++top] = a + b;
                        break;
                    case '-':
                        pila[++top] = a - b;
                        break;
                    case '*':
                        pila[++top] = a * b;
                        break;
                    case '/':
                        pila[++top] = a / b;
                        break;
                }
            }
        }
        return pila[top];
    }
}
