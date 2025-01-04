/*
 * Crea un programa que sea capaz de transformar texto natural a código
 * morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar
 *   la conversión.
 * - En morse se soporta raya "—", punto ".", un espacio " " entre letras
 *   o símbolos y dos espacios entre palabras "  ".
 * - El alfabeto morse soportado será el mostrado en
 *   https://es.wikipedia.org/wiki/Código_morse.
 */

import java.util.HashMap;

public class codigoMorse {
    public static void main(String[] args) {

        String palabra = "···· ——— ·—·· ·— —— ··— —· —·· ——— ";
        System.out.println(palabraAMorse("Hola mundo"));

        if(!esMorse(palabra) && !esEspanol(palabra)){
            System.out.println("La palabra es inválida, no es ni espáñol ni morse");
            System.exit(0);
        }

        else if(esMorse(palabra)){
            System.out.println(morsePalabra(palabra));
        }

        else if(esEspanol(palabra)){
            System.out.println(palabraAMorse(palabra));
        }


    }






    // Este algoritmo evalua si la palabra tiene una letra alfanumérica, si la hay no es morse
    static boolean esMorse(String palabra){
        String alphabetAndNums = "abcdefghijklmnñopqrstuvwxyz0123456789";
        char arrAlphabet[] = alphabetAndNums.toCharArray();
        palabra = palabra.toLowerCase().trim();
        char arr[] = palabra.toCharArray();

        for(int i=0; i<arr.length; i++){
            for (int j= 0; j<alphabetAndNums.length(); j++){
                if(arr[i] == arrAlphabet[j]){
                    return false;
                }
            }
        }
        return true;
    }

    static boolean esEspanol(String palabra){
        String morseAlphabet = "—·";
        char arrAlphabet[] = morseAlphabet.toCharArray();
        palabra = palabra.toLowerCase().trim();
        char arr[] = palabra.toCharArray();

        for(int i=0; i<arr.length; i++){
            for (int j= 0; j<morseAlphabet.length(); j++){
                if(arr[i] == arrAlphabet[j]){
                    return false;
                }
            }
        }
        return true;
    }


    static String palabraAMorse(String palabra){
        String morse = "";
        palabra = palabra.toLowerCase();
        HashMap<String,String> morseAphabet = new HashMap<String, String>() {
            {
                put("a", "·—");
                put("b", "—···");
                put("c", "—·—·");
                put("ch", "————");
                put("d", "—··");
                put("e", "·");
                put("f", "··—·");
                put("g", "——·");
                put("h", "····");
                put("i", "··");
                put("j", "·———");
                put("k", "—·—");
                put("l", "·—··");
                put("m", "——");
                put("n", "—·");
                put("ñ", "——·——");
                put("o", "———");
                put("p", "·——·");
                put("q", "——·—");
                put("r", "·—·");
                put("s", "···");
                put("t", "—");
                put("u", "··—");
                put("v", "···—");
                put("w", "·——");
                put("x", "—··—");
                put("y", "—·——");
                put("z", "——··");
                put("0", "—————");
                put("1", "·————");
                put("2", "··———");
                put("3", "···——");
                put("4", "····—");
                put("5", "·····");
                put("6", "—····");
                put("7", "——···");
                put("8", "———··");
                put("9", "————·");
                put(".", "·—·—·—");
                put(",", "——··——");
                put("?", "··——··");
                put(" ", " ");
            }
        };

        for(int i=0; i<palabra.length(); i++){
            morse += morseAphabet.get(String.valueOf(palabra.charAt(i))) + " ";
        }
        return morse;
    }

    static String morsePalabra(String palabra){
        String morse = "";
        palabra = palabra.toLowerCase();
        HashMap<String,String> morseAphabet = new HashMap<String, String>() {
            {
                put("·—", "a");
                put("—···", "b");
                put("—·—·", "c");
                put("————", "ch");
                put("—··", "d");
                put("·", "e");
                put("··—·", "f");
                put("——·", "g");
                put("····", "h");
                put("··", "i");
                put("·———", "j");
                put("—·—", "k");
                put("·—··", "l");
                put("——", "m");
                put("—·", "n");
                put("——·——", "ñ");
                put("———", "o");
                put("·——·", "p");
                put("——·—", "q");
                put("·—·", "r");
                put("···", "s");
                put("—", "t");
                put("··—", "u");
                put("···—", "v");
                put("·——", "w");
                put("—··—", "x");
                put("—·——", "y");
                put("——··", "z");
                put("—————", "0");
                put("·————", "1");
                put("··———", "2");
                put("···——", "3");
                put("····—", "4");
                put("·····", "5");
                put("—····", "6");
                put("——···", "7");
                put("———··", "8");
                put("————·", "9");
                put("·—·—·—", ".");
                put("——··——", ",");
                put("··——··", "?");
                put(" ", " ");
            }
        };

        String letra = "";
       for(int i=0; i<palabra.length(); i++) {

           if(palabra.charAt(i) == ' '){
               morse += morseAphabet.get(letra);
               letra = "";
           }

           else {
               letra += palabra.charAt(i);
           }
       }
        return morse;
    }
}
