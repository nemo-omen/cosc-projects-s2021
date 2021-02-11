import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Reader {
  Prompter prompt = new Prompter();

  /**
   * sets directory path of files that can be reported on
   */
  private String workingDir;

  /**
   * sets filename to read contents of
   */
  private String fileName;

  /**
   * sets absolute path to working file
   */
  private String absoluteFilePath;

  //basic getters and setters

  public String getWorkingDir() {
    return this.workingDir;
  }

  public void setWorkingDir(String workingDir) {
    this.workingDir = workingDir;
  } 

  public String getFileName() {
    return this.fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public String getAbsoluteFilePath() {
    return this.absoluteFilePath;
  }

  public void setAbsoluteFilePath(String absoluteFilePath) {
    this.absoluteFilePath = absoluteFilePath;
  }

  /**
   * Checks if given string resolves to a file, creates a File object and passes that to
   * readFileContents() if it exists. Prompts for new input if it doesn't exist.
   * @param newFileName  sets file to be opened
   * @return file  the File object that was found successfully
   */
  File open(String newFileName) throws FileNotFoundException{
    setFileName(newFileName);

    // the file
    File file = new File(workingDir + "/" + this.fileName);
    try {

      /**
       * file path to display to user
       */
      String displayName = file.getPath();
      
      // let the user know we're opening the file
      prompt.say("\nOpening " + displayName);
      
      if(file.exists()) {
        setAbsoluteFilePath(file.getAbsolutePath());

        // okay, the file is there. Let the user know.
        prompt.say("File successfully opened. Generating report.\n");

        readFileContents(file);

      } else {
        // get them to the catch block with a useful message
        throw new FileNotFoundException("File does not exist");
      }

    } catch(FileNotFoundException e) {
      // tell the user what went wrong
      prompt.say(e.getMessage());

      // try to get a new fileName
      String replacementFileName = prompt.ask("Enter a filename to open: ");

      // honestly, I'm not sure why this isn't being re-set when this catch recursively calls the method
      // so... I'm resetting it here beforehand
      file = new File(workingDir + "/" + replacementFileName);

      // recursion!
      open(replacementFileName);
    }

    // okay, we got a file. return it so we can get some work done!
    return file;
  }

  /**
   * Reads file contents using Scanner
   * @param file  sets file to read
   * @throws FileNotFoundException
   */
  ArrayList<String> readFileContents(File file) throws FileNotFoundException {
    ArrayList<String> lines = new ArrayList<String>();
    try {
      Scanner fileInput = new Scanner(file);
      while (fileInput.hasNextLine()) {
        String line = fileInput.nextLine();
        lines.add(line);
      }
      fileInput.close();
    } catch(FileNotFoundException e) {
      System.out.println(e.getMessage());
    }
    return lines;
  }

  /**
   * Shows given directory's contents
   * @param dirName  sets the name of the directory
   */
  File [] showDirectory(String dirName) {
    setWorkingDir(dirName);
    File dir = new File(dirName);
    File [] currentDirFiles = dir.listFiles();
    System.out.printf("%nCurrent Directory:  %s%n", dir.getAbsolutePath());
    System.out.printf("%n%d files in directory%n%n", currentDirFiles.length);

    for(File f : currentDirFiles) {
      if(f.isDirectory()) {
        System.out.printf("Directory: %20s%n", f.getName());
      } else {
        System.out.printf("File: %20s%n", f.getName());
      }
    }
    return currentDirFiles;
  }
}
