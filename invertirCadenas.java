/*
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */

public class invertirCadenas {
    public static void main(String[] args) {
        String palabra = "Hola mundo";
        System.out.println(invertirString(palabra));
    }

    public static String invertirString(String palabra){
        char[] invertida = palabra.toCharArray();
        palabra = "";
        for(int i=invertida.length-1; i> -1; i--){
            palabra += invertida[i];
        }
        return palabra;
    }
}
