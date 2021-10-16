import java.util.*;

public class TextInfo {
    private String text;

    TextInfo(String text) {
        this.text = text;
    }

    // Basic Level (mark 5 || 6)
    public int getWordCount() {
        int count = 1;
        for(int i = 0; i < this.text.length() - 1; ++i) {
            if((this.text.charAt(i) == ' ') && (this.text.charAt(i + 1) != ' ')) {
                ++count;
            }
        }

        return count;
    }

    // Basic Level (mark 5 || 6)
    public int getSentenceCount() {
        int count = 0;
        for(int i = 0; i < this.text.length(); ++i) {
            char ch = this.text.charAt(i);
            if(ch == '.' || ch == '!' || ch == '?' || ch == ':') {
                ++count;
            }
        }
        return count;
    }

    // Advanced Level (mark 7 || 8)
    public int getLetterCount() {
        int count = 0;
        for(int i = 0; i < this.text.length(); ++i) {
            char ch = this.text.charAt(i);
            if(
                (int) ch >= (int) 'a' && (int) ch <= (int) 'z' ||
                (int) ch >= (int) 'A' && (int) ch <= (int) 'Z' 
            ) {
                ++count;
            }
        }

        return count;
    }

    // Advanced Level (mark 7 || 8)
    public int getVowelCount() {
        int count = 0;
        for(int i = 0; i < this.text.length(); ++i) {
            char ch = this.text.charAt(i);
            if(
                ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
            ) {
                ++count;
            }
        }

        return count;
    }

    // Advanced Level (mark 7 || 8)
    public int getConsonantCount() {
        return this.getLetterCount() - this.getVowelCount();
    }

    // Advanced Level (mark 9 || 10)
    public String[] getMostUsedWords() {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        int i = 0;
        while(i < this.text.length()) {
            int k = 0;
            while(true) {
                if(i + k >= this.text.length()) break;
                char ch = this.text.charAt(i + k);
                if(!(
                    (int) ch >= (int) 'a' && (int) ch <= (int) 'z' ||
                    (int) ch >= (int) 'A' && (int) ch <= (int) 'Z' || ch == '\''
                )) break;
                ++k;
            }

            if(k != 0) {
                String str = this.text.substring(i, i + k);
                hashMap.putIfAbsent(str, 0);
                hashMap.put(str, hashMap.get(str) + 1);
            }

            i += k + 1;
        }

        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(hashMap.entrySet());
        Collections.sort(list, (i1, i2) -> i2.getValue().compareTo(i1.getValue()));

        String[] mostUsedWords = { null, null, null, null, null };
        for(i = 0; i < list.size() && i < 5; ++i) {
            mostUsedWords[i] = list.get(i).getKey();
        }

        return mostUsedWords;
    }

    // Advanced Level (mark 9 || 10)
    public String getLongestWord() {
        String longestStr = "";

        int i = 0;
        while(i < this.text.length()) {
            int k = 0;
            while(true) {
                if(i + k >= this.text.length()) break;
                char ch = this.text.charAt(i + k);
                if(!(
                    (int) ch >= (int) 'a' && (int) ch <= (int) 'z' ||
                    (int) ch >= (int) 'A' && (int) ch <= (int) 'Z' || ch == '\''
                )) break;
                ++k;
            }

            if(k != 0) {
                String str = this.text.substring(i, i + k);
                if(str.length() > longestStr.length()) {
                    longestStr = str;
                }
            }

            i += k + 1;
        }

        return longestStr;
    }
}
