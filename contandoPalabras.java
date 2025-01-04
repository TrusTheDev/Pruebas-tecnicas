/*
 * Crea un programa que cuente cuantas veces se repite cada palabra
 * y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que
 *   lo resuelvan automáticamente.
 */

import java.util.ArrayList;

public class contandoPalabras {
    public static void main(String[] args) {
        String words[] = {"Apple", "Crab", "Car", "Rome", "Mauro", "Apple", "Mauro", "Crab"};
        int counter = 1;
        ArrayList<String> wordList = new ArrayList<>();

        for(int i=0; i<words.length; i++){
            if(isOnList(wordList, words[i])){
                continue;
            }

            for(int j=i+1; j< words.length; j++){
                if(words[i] == words[j]){
                    counter = counter + 1;
                }
            }
            System.out.println("La palabra " + words[i] + " se repite " + counter );
            counter = 1;

        }
    }

    public static boolean isOnList(ArrayList<String> wordList, String word){
        for (int i=0; i< wordList.size(); i++){
            if(word.equalsIgnoreCase(wordList.get(i))){
                return true;
            }
        }
        wordList.add(word);
        return false;
    }

}
