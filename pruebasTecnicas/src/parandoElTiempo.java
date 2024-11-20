/*
 * Crea una función que sume 2 números y retorne su resultado pasados
 * unos segundos.
 * - Recibirá por parámetros los 2 números a sumar y los segundos que
 *   debe tardar en finalizar su ejecución.
 * - Si el lenguaje lo soporta, deberá retornar el resultado de forma
 *   asíncrona, es decir, sin detener la ejecución del programa principal.
 *   Se podría ejecutar varias veces al mismo tiempo.
 */



public class parandoElTiempo {
    public static void main(String[] args) throws InterruptedException {
        //Llamo al metodo en un hilo
        Thread thread1 = new Thread(() -> {
            try {
                System.out.println(sumar(20, 40, 5));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread1.start();
        //Llamo al metodo en el segundo hilo
        Thread thread2 = new Thread(() -> {
            try {
                System.out.println(sumar(15, 35, 5));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread2.start();
        //Esto se ejecuta primero, pero en segundo plano está el hilo trabajando
        System.out.println("Hola mundo");


    }

    static int sumar(int a, int b,int tiempo) throws InterruptedException {
        tiempo *= 1000;
        Thread.sleep(tiempo);
        return a + b;
    }
}
