/*
 * Escribe una función que calcule si un número dado es un número de Armstrong
 * (o también llamado narcisista).
 * Si no conoces qué es un número de Armstrong, debes buscar información
 * al respecto.
 */

public class numeroArmstrong {
    public static void main(String[] args) {

        System.out.println(isArmstrong(407));

    }
    //Metodo principal
    public static boolean isArmstrong(int num){
        int[] digits = arrayOfDigits(num);
        int answer = 0;

        for(int i=0; i<digits.length; i++){
            answer+= Math.pow(digits[i], 3);
        }

        if(answer == num){
            return true;
        }
        return false;
    }
    //Metodo secundario, devuelve un arreglo con todos los digitos del número para el metodo principal
    public static int[] arrayOfDigits(int num){
        String numero = String.valueOf(num);
        char[] charArray = numero.toCharArray();
        int[] digitos = new int[charArray.length];

        for(int i=0; i<charArray.length; i++){
            digitos[i] = charArray[i] - '0';
        }
        return digitos;
    }
}
