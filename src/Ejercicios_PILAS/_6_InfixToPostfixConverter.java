package Ejercicios_PILAS;

public class _6_InfixToPostfixConverter {

    public static void main(String[] args) {
        String infixExpression = "(1 + 2) * 3";
        String postfixExpression = infixToPostfix(infixExpression);
        System.out.println("Expresión Infija: " + infixExpression);
        System.out.println("Expresión Posfija: " + postfixExpression);
    }

    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        StringBuilder stack = new StringBuilder();

        for (int i = 0; i < infix.length(); i++) {
            char currentChar = infix.charAt(i);

            if (Character.isDigit(currentChar)) {
                postfix.append(currentChar);
                while (i + 1 < infix.length() && Character.isDigit(infix.charAt(i + 1))) {
                    postfix.append(infix.charAt(++i));
                }
                postfix.append(" ");
            } else if (currentChar == '(') {
                stack.append(currentChar);
            } else if (currentChar == ')') {
                while (stack.length() > 0 && stack.charAt(stack.length() - 1) != '(') {
                    postfix.append(stack.charAt(stack.length() - 1)).append(" ");
                    stack.setLength(stack.length() - 1);
                }
                if (stack.length() > 0 && stack.charAt(stack.length() - 1) == '(') {
                    stack.setLength(stack.length() - 1); // Esto logra eliminar el parentesis de la pila
                }
            } else { // Aca se manejan los operadores
                while (stack.length() > 0 && precedence(stack.charAt(stack.length() - 1)) >= precedence(currentChar)) {
                    postfix.append(stack.charAt(stack.length() - 1)).append(" ");
                    stack.setLength(stack.length() - 1);
                }
                stack.append(currentChar);
            }
        }

        // Aca es donde se vacia la pila al final
        while (stack.length() > 0) {
            postfix.append(stack.charAt(stack.length() - 1)).append(" ");
            stack.setLength(stack.length() - 1);
        }

        return postfix.toString().trim();
    }

    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }
}
