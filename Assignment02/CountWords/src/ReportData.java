import java.util.ArrayList;

/**
 * Utility class for packaging ArrayLists of Strings and ints into a single object
 */
public class ReportData {
  ArrayList<String> words = new ArrayList<>();
  ArrayList<Integer> wordInstances = new ArrayList<>();

  public void setWords(ArrayList<String> words) {
    this.words = words;
  }

  public void setWordInstances(ArrayList<Integer> wordInstances) {
    this.wordInstances = wordInstances;
  }

  public ArrayList<String> getWords() {
    return this.words;
  }

  public ArrayList<Integer> getWordInstances() {
    return this.wordInstances;
  }
  
  ReportData() {

  }

  /**
   * Sets fields if passed data is of ArrayList type
   */
  ReportData(ArrayList<String> words, ArrayList<Integer> wordInstances) {
    this.words = words;
    this.wordInstances = wordInstances;
  }

  /**
   * Sets fields if passed data is Array type
   */
  ReportData(String[] words, int[] wordInstances) {
    //add strings from given String Array to ArrayList words field
    for(String word : words) {
      // exclude occurrances of null and empty strings
      if(word != null && word.equals("") == false) {
        this.words.add(word);
      }
    }

    //add ints from given Integer Array to ArrayList wordInstances
    for(int wordInstance : wordInstances) {
      if(wordInstance != 0) {
        this.wordInstances.add(wordInstance);
      }
    }
  }
}
