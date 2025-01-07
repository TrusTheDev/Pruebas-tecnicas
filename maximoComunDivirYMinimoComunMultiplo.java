
/*
 * Crea dos funciones, una que calcule el máximo común divisor (MCD) y otra
 * que calcule el mínimo común múltiplo (mcm) de dos números enteros.
 * - No se pueden utilizar operaciones del lenguaje que
 *   lo resuelvan directamente.
 */

import java.sql.Array;
import java.util.ArrayList;

public class maximoComunDivirYMinimoComunMultiplo {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 10;
    }

    public int maxDivisor(int num1, int num2){
        ArrayList<Integer> divisores= new ArrayList<>();
        ArrayList<Integer> divisores2 = new ArrayList<>();
        int MCD = 0;

        for (int i =1; i < num1; i++){
            if(num1 % i == 0){
                divisores.add(i);
            }
        }

        for(int i=1; i < num2; i++){
            if(num2 % i == 0){
                divisores2.add(i);
            }
        }

        for(int i=0; i < divisores.size(); i++){
            if(divisores.get(i) > MCD){
                MCD = divisores.get(i);
            }
        }

        for(int i=0; i < divisores2.size(); i++){
            if(divisores2.get(i) > MCD){
                MCD
            }
        }


    }

}
