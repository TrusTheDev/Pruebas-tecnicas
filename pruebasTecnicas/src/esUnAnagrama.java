import java.util.Arrays;

/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */


public class esUnAnagrama {
    public static void main(String[] args) {
        System.out.println(esUnAnagrama("Amor", "Roma"));
    }
    
    public static boolean esUnAnagrama(String palabra, String palabra1){
        char[] palabraArray = palabra.toLowerCase().toCharArray();
        char[] palabra1Array = palabra1.toLowerCase().toCharArray();
        Arrays.sort(palabraArray);
        Arrays.sort(palabra1Array);
        return Arrays.equals(palabraArray, palabra1Array);
    }
}
