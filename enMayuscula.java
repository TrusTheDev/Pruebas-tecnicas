
/*
 * Crea una función que reciba un String de cualquier tipo y se encargue de
 * poner en mayúscula la primera letra de cada palabra.
 * - No se pueden utilizar operaciones del lenguaje que
 *   lo resuelvan directamente.
 */

public class enMayuscula {
    public static void main(String[] args) {
        System.out.println(enMayus("hola mundo como estas yo? ando bien"));
    }

    static String enMayus(String frase){
        int bandera = 0;
        char[] charArray = frase.toCharArray();
        for(int i=0; i<frase.length(); i++){
            if(bandera == 0){
                charArray[i] = Character.toUpperCase(charArray[i]);
                bandera = 1;
            }

            if(frase.charAt(i) == ' '){
                bandera = 0;
            }

        }
        frase = String.valueOf(charArray);
        return frase;
    }
}
