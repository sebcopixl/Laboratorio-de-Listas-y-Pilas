package Ejercicios_PILAS;

public class _8_BalanceoParentesis {

    public static void main(String[] args) {
        String expresion1 = "(a+b)";
        String expresion2 = "((a+b)";

        System.out.println("Expresión 1 balanceada: " + verificarBalanceo(expresion1));
        System.out.println("Expresión 2 balanceada: " + verificarBalanceo(expresion2));
    }

    public static boolean verificarBalanceo(String expresion) {
        char[] caracteres = expresion.toCharArray();
        int balanceo = 0;

        for (char c : caracteres) {
            if (c == '(') {
                balanceo++;
            } else if (c == ')') {
                balanceo--;
                if (balanceo < 0) {
                    return false;
                }
            }
        }

        return balanceo == 0;
    }
}

