import java.util.ArrayList;
import java.util.List;

/*
 * Crea una función que reciba dos cadenas de texto casi iguales,
 * a excepción de uno o varios caracteres.
 * La función debe encontrarlos y retornarlos en formato lista/array.
 * - Ambas cadenas de texto deben ser iguales en longitud.
 * - Las cadenas de texto son iguales elemento a elemento.
 * - No se pueden utilizar operaciones propias del lenguaje
 *   que lo resuelvan directamente.
 *
 * Ejemplos:
 * - Me llamo mouredev / Me llemo mouredov -> ["e", "o"]
 * - Me llamo.Brais Moure / Me llamo brais moure -> [" ", "b", "m"]
 */

public class caracterInfiltrado {
    public static void main(String[] args) {
        String palabra1 = "holi mundo";
        String palabra2 = "hola mundi";
        List<String> palabras = caracteresInfiltrados(palabra1, palabra2);

        for(int i=0; i<palabras.size(); i++){
            System.out.print(palabras.get(i) + " ");
        }
    }

    static List<String> caracteresInfiltrados(String palabra1, String palabra2){
        List<String> infiltrados = new ArrayList<>();
        for(int i=0; i<palabra1.length(); i++){
            if (palabra1.charAt(i) != palabra2.charAt(i)){
                infiltrados.add(String.valueOf(palabra1.charAt(i)));
                infiltrados.add(String.valueOf(palabra2.charAt(i)));
            }
        }
        return infiltrados;
    }
}
