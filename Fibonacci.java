
/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */

public class Fibonacci {
    public static void main(String[] args) {
        int A = 0;
        int B = 1;
        for (int i=0; i<50; i++){
            System.out.println(A);
            int C = A + B;
            A= B;
            B= C;
        }
    }
}
