import java.util.HashMap;
import java.util.Map;

public class Test {
    static HashMap<String, Integer> test = new HashMap<String, Integer>();
    public static void main(String[] a) {
        for(int i = 0; i < 1000000; ++i) {
            String text = java.awt.event.KeyEvent.getKeyText(i);
            if(!text.contains("Unknown keyCode: ")) {
                test.put(text, i);
            }
        }

        for(String i : test.keySet()){
            System.out.println("key: " + i + " value: " + test.get(i));

        }
    }
}