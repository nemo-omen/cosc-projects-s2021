import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Writer {
  private static Prompter prompt = new Prompter();
  private String writeStatus;
  private String fileName;
  private String absoluteFilePath;

  /**
   * Sets fileName field
   * @param fileName  name of file to write
   */
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public String getFileName() {
    return this.fileName;
  }

  public void setAbsoluteFilePath(String absoluteFilePath) {
    this.absoluteFilePath = absoluteFilePath;
  }

  public String getAbsoluteFilePath() {
    return this.absoluteFilePath;
  }

  public void setWriteStatus(String writeStatus) {
    this.writeStatus = writeStatus;
  }

  public String getWriteStatus() {
    return this.writeStatus;
  }
  /**
   * Writes the report data to a .txt file in the working directory
   * 
   * @param targetDir  the target directory, relative to the project root
   * @param workingFileName  the name of the file the report's data is coming from
   * @param data  the data to write
   * @return writeStatus  An array of two elements: a boolean describing
   *                      whether write operation was successful and the
   *                      canonical filepath to the written file.
   */

  public String[] writeReport(String targetDir, String workingFileName, ReportData data) {

    /**
     * Words from Report object;
     */
    ArrayList<String> words = data.getWords();

    /**
     * Word instances from Report object
     */
    ArrayList<Integer> wordInstances = data.getWordInstances();

    /**
     * Status data to return at end of write operation
     */
    String[] writeStatus = new String[2];

    /**
     * Generate report filename from original working file name
     */
    String writeFileName = workingFileName.replace(".txt", "-report.txt");

    /**
     * sets the path to write the file to
     */
    String writeFilePath = targetDir + "/" + writeFileName;
    
    /**
     * File object to write to storage
     */
    File writeFile = new File(writeFilePath);

    try (PrintWriter output = new PrintWriter(writeFile);){

      /**
       * Convenience String used to drop-in horizontal rules where needed
       */
      String hRule = "* * * * * * * * * * * * * * * * * * * * *";

      // the final text to be written to the file
      output.println(hRule);
      output.printf("%-20s%20s%n", "Word", "Appearances");
      output.println(hRule + "\n");

      for(String word : words) {
        output.printf("%-20s%20s%n", word, wordInstances.get(words.indexOf(word)));
      }

      output.println("\n" + hRule);
      output.println("     Thank you for using WordReport");
      output.println(hRule);

    } catch (FileNotFoundException e) {
      System.out.println(e);
    }

    /**
     * New File object to confirm the data did, in fact, successfully write to storage
     */
      File confirmationFile = new File(writeFilePath);
      
      // if report file exists, 
      if(confirmationFile.exists()) {

      try {
        writeStatus[0] = confirmationFile.getCanonicalPath();
        writeStatus[1] = "success";

      } catch (IOException e) {
        System.out.println(e);
      }

    } else {
      writeStatus[0] = "??";
      writeStatus[1] = "failure";
    }

      return writeStatus;
  }
}
