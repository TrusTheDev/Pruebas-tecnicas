
/*
 * Escribe un programa que sea capaz de generar contraseñas de forma aleatoria.
 * Podrás configurar generar contraseñas con los siguientes parámetros:
 * - Longitud: Entre 8 y 16.
 * - Con o sin letras mayúsculas.
 * - Con o sin números.
 * - Con o sin símbolos.
 * (Pudiendo combinar todos estos parámetros entre ellos)
 */

import java.util.Random;
public class generarContraseña {
    public static void main(String[] args) {
        int caracterMaximo = 16;
        String contraseña = "";
        Random random = new Random();
        for(int i=0; i<16; i++){
            if(random.nextInt(3) == 1){
                contraseña += retornaLetraMayus();
            }
            else if (random.nextInt() == 2){
                contraseña += retornaLetraMinus();
            }
            else if (random.nextInt() == 3){
                contraseña += retornaNumero();
            }
        }
        System.out.println(contraseña);

    }

    public static char retornaLetraMayus(){
        char[] letras = "ABCDEFGHIJKLMNOPQRSTUVXYZ".toCharArray();
        Random rand = new Random();
        return letras[rand.nextInt(16)];
    }

    public static char retornaLetraMinus(){
        char[] letras = "ABCDEFGHIJKLMNOPQRSTUVXYZ".toLowerCase().toCharArray();
        Random rand = new Random();
        return letras[rand.nextInt(16)];
    }

    public static String retornaNumero(){
        Random rand = new Random();
        return String.valueOf(rand.nextInt(9));
    }
}
