
/*
 * Escribe una función que calcule y retorne el factorial de un número dado
 * de forma recursiva.
 */
public class factorialRecursivo {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    public static double factorial(double limite){
        if (limite == 0){
            return 1;
        } else {
            return limite*factorial(limite - 1);
        }
    }
}
