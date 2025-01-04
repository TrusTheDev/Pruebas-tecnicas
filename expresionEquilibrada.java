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

public class expresionEquilibrada {
    public static void main(String[] args) {
        System.out.println(equilibrio("Holamundo(){][{})([]}"));
    }

    static boolean equilibrio(String palabra){
        int contCorchete = 0;
        int contParent = 0;
        int llaves = 0;
        for(int i=0; i<palabra.length(); i++){
            if(palabra.charAt(i) == '{' ||palabra.charAt(i) == '}' ){
                llaves++;
            }

            else if (palabra.charAt(i) == '(' || palabra.charAt(i) == ')'){
                contParent++;
            }
            else if (palabra.charAt(i) == '[' || palabra.charAt(i) == ']'){
                contCorchete++;
            }
        }

        int resultado = contParent + contCorchete + llaves;

        if(resultado % 2 == 0 ){
            return true;
        }

        return false;
    }
}
