/********************************************
 * Name: Jeff Caldwell
 * Class: COSC 1174-48L
 * Assignment: Count the Words
 * Date: February 11, 2021
********************************************/

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static Scanner input = new Scanner(System.in);
    public static Prompter prompt = new Prompter();
    public static Writer writer = new Writer();
    public static Reader reader = new Reader();
    public static void main(String[] args) throws Exception {
        /**
         * Creates new File object in order to get relative paths for the rest of the program
         */
        File currentDir = new File(".");

        /**
         * Sets the current path to work from
         */

         String currentPath = currentDir.getPath();


        /**
         * sets the fileName once chosen by the user
         */
        String workingFileName;

        /**
         * sets File object, if it exists, according to fileName
         */
        File workingFile;

        /**
         * Contents of working file after being read
         */
        ArrayList<String> workingFileContents;

        /**
         * Status of writing the report file
         */
        String[] writeStatus;

        /**
         * The class that handles generating the report from the given File input
         */
        Report report;

        /**
         * Basic utility class used to bundle ArrayLists of different types so they can be used as
         * parameters and returns
         */
        ReportData data;

        // start with a nice header
        prompt.say("* * * * * * *  WordReport  * * * * * * *");

        // show the user what files are available for use
        reader.showDirectory(currentPath);

        // get filename from user
        workingFileName = (prompt.ask("\nEnter a file name to generate a word report: "));

        // attempt to open the given file
        workingFile = (reader.open(workingFileName));

        // attempt to read the contents of the given file
        workingFileContents = (reader.readFileContents(workingFile));

        // empty report object which will be used to generate the word report
        report = new Report();

        // generate the report and return a ReportData object
        data = (report.generate(workingFileContents));

        // write the report to the filesystem as a .txt file using the generated ReportData object
        // return success or failure & a canonical path to the generated file
        writeStatus = (writer.writeReport(currentPath, workingFile.getName(), data));

        // wrap it up!
        if(writeStatus[1].equals("success")) {
            System.out.printf("File saved to %s%n%n", writeStatus[0]);
        } else {
            System.out.println("There was a problem writing the file.");
        }
    }
}
