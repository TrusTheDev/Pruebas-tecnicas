import java.util.ArrayList;
import java.util.List;

public class conjuntos {
    public static void main(String[] args) {
    String[] cars1 = {"BMW", "Fiat", "WolfWage", "Peugeot", "Ferrari"};
    String[] cars2 = {"BMW", "Fiat", "wolfmania", "carcar", "Ferrari"};
    boolean flag = false;
        List<String> collection = collection(cars1, cars2, flag);
        for(int i=0; i < collection.size(); i++){
            System.out.println(collection.get(i));
        }

    }

    public static List<String> collection(String[] collection1, String[] collection2, boolean flag) {
        List<String> list = new ArrayList<>();
        System.out.println(flag);
        if(flag) {
            for (int i = 0; i < biggerTan(collection1, collection2).length; i++) {
                for (int j = 0; j < smallerTan(collection1, collection2).length; j++) {
                    if (collection1[i].equals(collection2[j])) {
                        list.add(collection1[i]);
                    }
                }
            }
        }

        else if(!flag){
            System.out.println("Iterando false");
            for (int i = 0; i < biggerTan(collection1, collection2).length; i++) {
                for (int j = 0; j < smallerTan(collection1, collection2).length; j++) {
                    if (!collection1[i].equals(collection2[j]) && j == collection2.length - 1 ) {
                        list.add(collection1[i]);
                    }
                }
            }
        }

        return list;
    }

    public static String[] biggerTan(String[] collection1, String[] collection2){
        return collection1.length > collection2.length ? collection1 : collection2;
    }

    public static String[] smallerTan(String[] collection1, String[] collection2){
        return collection1.length < collection2.length ? collection1 : collection2;
    }
}
