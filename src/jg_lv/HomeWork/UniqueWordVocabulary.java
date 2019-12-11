package jg_lv.HomeWork;

import java.util.HashSet;
import java.util.Set;
public class UniqueWordVocabulary {

        private Set<String> uniqueWords = new HashSet<>();

        public void addWord(String newWord) {
            uniqueWords.add(newWord);
        }

        public void getUniqueWords() {
            System.out.println(uniqueWords.size());
        }

        public void printToConsole() {
            uniqueWords.stream().forEach(System.out::println);
        }

        public static void main(String[] args) {

            UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();

            uniqueWordVocabulary.addWord("sun");
            uniqueWordVocabulary.addWord("moon");
            uniqueWordVocabulary.addWord("star");
            uniqueWordVocabulary.addWord("cloud");
            uniqueWordVocabulary.getUniqueWords();
            uniqueWordVocabulary.printToConsole();
        }
    }

