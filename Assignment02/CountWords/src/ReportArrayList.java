import java.util.ArrayList;
/**
 * This class has essentially the same functionality as Report but uses ArrayLists
 * rather than Arrays -- we're using the normal version for this exercise so refer to
 * Report class for better documentation. This class is, more or less, included for posterity
 * @see Report
 */
public class ReportArrayList {
  ArrayList<Integer> wordInstances = new ArrayList<>();
  ArrayList<String> words = new ArrayList<>();

  ReportData generate(ArrayList<String> text) {
    for(String line : text) {
      String[] currentWords = line.split("\\W+");
      for(String currentWord : currentWords) {
          addWord(currentWord);
      }
    }
    ReportData data = new ReportData(words, wordInstances);
    return data;
  }

  void updateWordInstances(int wordIndex) {
    wordInstances.set(wordIndex, wordInstances.get(wordIndex) +1);
  }

  void addWord(String word) {
    
    String upWord = word.toUpperCase();

    if(words.contains(upWord)) {
      updateWordInstances(words.indexOf(upWord));
    } else if(upWord.length() > 0){
      words.add(upWord);
      wordInstances.add(1);
    }
  }
  
  void showWords() {
    System.out.printf("%n%-10s %20s%n%n","Word", "Appearances");

    for(int i = 0; i < words.size(); i++) {
      System.out.printf("%-10s%20d%n", words.get(i), wordInstances.get(i));
    }
  }
}
