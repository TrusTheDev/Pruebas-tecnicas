import java.util.ArrayList;
import java.util.List;

public class conjuntos {
    public static void main(String[] args) {
    String[] cars1 = {"BMW", "Fiat","carlo", "WolfWage", "Peugeot", "Ferrari"};
    String[] cars2 = {"BMW", "Fiat", "wolfmania", "carcar", "Ferrari", "carlo"};
    boolean flag = false;
        List<String> collection = collection(cars1, cars2, flag);
        for(int i=0; i < collection.size(); i++){
            System.out.println(collection.get(i));
        }

    }

    public static List<String> collection(String[] collection1, String[] collection2, boolean flag) {
        List<String> list = new ArrayList<>();
        if(flag) {
            for (int i = 0; i < collection1.length; i++) {
                for (int j = 0; j < collection2.length; j++) {
                    if (collection1[i].equals(collection2[j])) {
                        list.add(collection1[i]);
                    }
                }
            }
        }

        else if(!flag){
            for (int i = 0; i < collection1.length; i++) {
                for (int j = 0; j < collection2.length; j++) {
                    if (collection1[i].equals(collection2[j])) {
                        collection1[i] = "";
                        collection2[j] = "";
                    }
                }
            }

            for(int i = 0; i <collection1.length; i++){
                if(!collection1[i].isEmpty()){
                    list.add(collection1[i]);
                }
            }

            for(int j = 0; j < collection2.length; j++){
                    if(!collection2[j].isEmpty()) {
                        list.add(collection2[j]);
                    }
            }
        }
        return list;
    }
}
