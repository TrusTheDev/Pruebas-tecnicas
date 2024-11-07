
/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */

public class numeroPrimo {
    public static void main(String[] args) {

        for(int i=2; i<100; i++){
            if(esPrimo(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean esPrimo(int numero){
        for(int i=2; i<=Math.sqrt(numero); i++){
            if(numero % i == 0){
                return false;
            }
        }
        return true;
    }
}
