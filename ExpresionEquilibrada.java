/*
 * Crea un programa que comprueba si los paréntesis, llaves y corchetes
 * de una expresión están equilibrados.
 * - Equilibrado significa que estos delimitadores se abren y cieran
 *   en orden y de forma correcta.
 * - Paréntesis, llaves y corchetes son igual de prioritarios.
 *   No hay uno más importante que otro.
 * - Expresión balanceada: { [ a * ( c + d ) ] - 5 }
 * - Expresión no balanceada: { a * ( c + d ) ] - 5 }
 */

import java.util.Objects;
import java.util.Stack;

public class ExpresionEquilibrada {
    public static void main(String[] args) {
        //String de prueba
        String[] expresiones = {
                // Balanceadas
                "()", "[]", "{}",
                "(())", "([]{})", "{[()()]}", "(({}[]))", "{[(){}]({})}", "({[]})", "(",
                //No balanceadas
                ")", "[}", "({[)]}", "({}", "(()", "{[()]", "[{]}", "(((((()))"};

        for(String expresion : expresiones) {
            System.out.println(equilibrado(expresion) + " " + expresion);
        }

    }



    static boolean equilibrado(String corchetes) {
        //Instancio un objeto stack
        Stack<Character> stack = new Stack<>();

        //recorro los caracteres
        for (int i = 0; i < corchetes.length(); i++) {

            //Se pregunta si es un caracter de apertura
            if (corchetes.charAt(i) == '(' || corchetes.charAt(i) == '[' || corchetes.charAt(i) == '{') {
                //Ingresa a la pila
                stack.push(corchetes.charAt(i));
            }
            //Es un caracter de cierre
            else if (corchetes.charAt(i) == ')' || corchetes.charAt(i) == ']' || corchetes.charAt(i) == '}') {
                //Se pregunta si la pila está vacia, si lo esta significa que hay más cierres que aperturas
                if (stack.isEmpty()) {
                    return false;
                }

                //Saco y elimino el elemento de la pila y se lo paso a la variable
                char ultimoElementoSacado = stack.pop();

                //verifico si el caracter en la posición i de corchetes es igual al de uno de cierre y el ultimo elemento sacado es diferente de uno de apertura
                if (corchetes.charAt(i) == ')' && ultimoElementoSacado != '(' || corchetes.charAt(i) == ']' && ultimoElementoSacado != '[' || corchetes.charAt(i) == '}' && ultimoElementoSacado != '{') {
                    return false;
                }


            }


        }
        //Si la pila esta vacía es porque se cumplieron todos los requisitos y las llaves, corchetes y parentesis se cancelaron
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}