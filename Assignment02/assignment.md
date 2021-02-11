<div style="text-align: center;">
<h5>Chapter 12 - HW 2</h5>
<h5>COSC 1174</h5>
<h5>Ch 12 Exception Handling and Text I/O</h5>
</div>

>All code should have comments for every method and variable. It may seem obvious to you what you were writing, but when you’re working on a team, it will save a lot of time and questions from your teammates who it may not be so obvious to.

>The top of every class you submit should have a block comment containing name, course #, date, assignment name, and anything else significant like partner names for group work.
All programs should be put into a single folder with a readme file explaining how the program should be run. Then zip the folder (7zip is free and simple) and submit the zip file. 

<h2 style="text-align: center;">Counting the Words</h2>

- [ ] .java file
- [ ] uml
- [ ] readme
- [ ] sample text
- [ ] screenshot of results of testing

In this exercise, you need to create a program that 
1.  Prompts the user to open a text file
2. Read the file
3. Records every different word in the file, and how many times that word appears. 
4. Create a new .txt file and write the collected data to it.

First, begin by making the code that opens and reads a text file (this section must contain a try-catch for both user input and accessing the file). DO NOT hard code the file location into your code, because it will not be in the same directory when I go to grade it, and thus it will not make it past step 1, which means the assignment is failed. 

Next, build your scanner that reads 1 string at a time. Then make 2 arrays; one int, and one String (size 100 is plenty for testing). If the String you have just read is not in the String array add the string and increase the same index of the new string in the int array. If it is, increase the instances of that string in the int array. 

Finally, use the print writer to create a new text file and transfer the information in your arrays to this new file in two columns. 

Now create or download a sample text file and test your program.

For this program, in addition to the java file, UML, and readme, please submit your sample text, and a screenshot of the results from your testing.