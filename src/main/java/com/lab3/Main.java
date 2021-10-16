public class Main {
    public static void main(String[] args) {
        TextInfo textInfo = new TextInfo("If you're looking for random paragraphs, you've come to the right place. When a random word or a random sentence isn't quite enough, the next logical step is to find a random paragraph. We created the Random Paragraph Generator with you in mind. The process is quite simple. Choose the number of random paragraphs you'd like to see and click the button. Your chosen number of paragraphs will instantly appear. While it may not be obvious to everyone, there are a number of reasons creating random paragraphs can be useful. A few examples of how some people use this generator are listed in the following paragraphs. Generating random paragraphs can be an excellent way for writers to get their creative flow going at the beginning of the day. The writer has no idea what topic the random paragraph will be about when it appears. This forces the writer to use creativity to complete one of three common writing challenges. The writer can use the paragraph as the first one of a short story and build upon it. A second option is to use the random paragraph somewhere in a short story they create. The third option is to have the random paragraph be the ending paragraph in a short story. No matter which of these challenges is undertaken, the writer is forced to use creativity to incorporate the paragraph into their writing.");
        
        // Basic Level (mark 5 || 6)
        System.out.println("There are " + textInfo.getWordCount() + " words in this text.");
        System.out.println("There are " + textInfo.getSentenceCount() + " sentences in this text.");
        
        // Advanced Level (mark 7 || 8)
        System.out.println("There are " + textInfo.getLetterCount() + " letters in this text.");
        System.out.println("There are " + textInfo.getVowelCount() + " vowels in this text.");
        System.out.println("There are " + textInfo.getConsonantCount() + " consonants in this text.");

        // Advanced Level (mark 9 || 10)  
        System.out.println("The most used words are: ");      
        String[] arr = textInfo.getMostUsedWords();
        for(int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
        System.out.println("The longest word is " + textInfo.getLongestWord());
    }
}
