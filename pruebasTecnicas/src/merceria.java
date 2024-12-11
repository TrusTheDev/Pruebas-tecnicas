/*
Una merceria vende canutillos y mostacillas al por mayor mediante su pagina web. Como se trata de una
merceria mayorista, solicita la cantidad de pquetes en cada venta y dependiendo de esta realia los siguienstes controles:
Si la cantidad de productos es menor a 5: se debe emitir un mensaje indicando que no se permiten compras inferiores a 5 productos
Si la cantida dde productos es mayor ogiual a 5 pero menor o igual a 15: se debe emitir un mensaje que el costo de envio es de $10 usd.
Si la cantidad de productos es mayor a 15: se debe emitir un mensaje de que el envio es gratuito
*/

import java.util.Scanner;

public class merceria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cantidad de canutillos");
        int canutillo = sc.nextInt();
        System.out.println("Ingrese cantidad de mostacillas");
        int mostacillas = sc.nextInt();
        int productos = canutillo + mostacillas;
        envio(productos);

    }

    public static void envio(int productos){
        if(productos < 5){
            System.out.println("No se permiten compras inferiores a 5 productos");
        }
        else if(productos >= 5 && productos <= 15){
            System.out.println("El costo de envio es de $10 usd");
        }
        else if(productos > 15){
            System.out.println("El envio es gratuito");
        }
    }
}
