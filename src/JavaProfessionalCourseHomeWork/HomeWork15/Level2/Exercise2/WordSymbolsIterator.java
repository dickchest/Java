package JavaProfessionalCourseHomeWork.HomeWork15.Level2.Exercise2;

import java.util.Iterator;

public class WordSymbolsIterator implements Iterator<Character> {
    Iterator<String> sentenceIterator;
    Iterator<Character> wordIterator;

    private String nextWord;

    public WordSymbolsIterator(String sentence) {
        sentenceIterator = new SentenceIterator(sentence);
        wordIterator = new WordIterator(sentenceIterator.next());
    }


    @Override
    public boolean hasNext() {
        return sentenceIterator.hasNext() || wordIterator.hasNext();
    }

    @Override
    public Character next() {
        if (!wordIterator.hasNext() && sentenceIterator.hasNext()) {
            String word = sentenceIterator.next();
            wordIterator = new WordIterator(word);
        }
        if (wordIterator.hasNext()) {
            return wordIterator.next();
        }
        return null;
    }
}
