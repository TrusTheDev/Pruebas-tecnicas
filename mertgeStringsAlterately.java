public class mertgeStringsAlterately {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        System.out.println(mergeStrings(word1, word2));
    }

    static String mergeStrings(String word1, String word2) {
        String mergedWord = "";
        if (word1.length() == word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                mergedWord += String.valueOf(word1.charAt(i));
                mergedWord += String.valueOf(word2.charAt(i));
            }
            return mergedWord;
        } else if (word1.length() < word2.length()) {
            for (int i = 0; i < word2.length(); i++) {
                while (i < word1.length()) {
                    mergedWord += String.valueOf(word1.charAt(i));
                    mergedWord += String.valueOf(word2.charAt(i));
                    i++;
                }
                mergedWord += String.valueOf(word2.charAt(i));
            }
            return mergedWord;
        }

        for (int i = 0; i < word1.length(); i++) {
            while (i < word2.length()) {
                mergedWord += String.valueOf(word1.charAt(i));
                mergedWord += String.valueOf(word2.charAt(i));
                i++;
            }
            mergedWord += String.valueOf(word1.charAt(i));
        }
        return mergedWord;
    }
}
