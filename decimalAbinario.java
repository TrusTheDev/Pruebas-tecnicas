/*
 * Crea un programa se encargue de transformar un número
 * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */

public class decimalAbinario {
    public static void main(String[] args) {
        System.out.println(binario(25));
    }

    static int binario(int numero){
        String binario = "";
        while (numero != 0){
            binario += String.valueOf(numero % 2);
            numero = numero / 2;
        }
        int binary = Integer.parseInt(invertirString(binario));
        return binary;
    }
    //Importo un ejercicio anterior que invierte cadenas
    public static String invertirString(String palabra){
        char[] invertida = palabra.toCharArray();
        palabra = "";
        for(int i=invertida.length-1; i> -1; i--){
            palabra += invertida[i];
        }
        return palabra;
    }
}
