
/*
 * Dado un listado de números, encuentra el SEGUNDO más grande
 */

public class Elsegundo {
    public static void main(String[] args) {
        int higher = Integer.MIN_VALUE;
        int lastHigher = Integer.MIN_VALUE;
        int[] list = {42, 7, 98, 13, 56, 2, 89, 34, 21, 77, 5, 63, 19, 81, 11, 493};

        for(int i=0; i<list.length; i++){
            if(list[i] > higher){
                higher = list[i];
            }

            if(list[i] >= higher && !masGrande(list, higher)){
                lastHigher = higher;
            }
        }

        System.out.println("Primero más grande: " +  higher + " Segundo más grande; " + lastHigher);
    }

    public static boolean masGrande(int[] list,int num){
        for(int i=0; i < list.length; i++){
            if(num < list[i]){
                return false;
            }
        }
        return true;
    }
}
