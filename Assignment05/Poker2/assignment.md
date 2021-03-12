HW 5
COSC 1174
Ch 15 Event-Driven Programming Animations

All code should have comments for every method and variable. It may seem obvious to you what you were writing, but when you’re working on a team, it will save a lot of time and questions from your teammates who it may not be so obvious to.

The top of every class you submit should have a block comment containing name, course #, date, assignment name, and anything else significant like partner names for group work.

All programs should be put into a single folder with a readme file explaining how the program should be run. Then zip the folder (7zip is free and simple) and submit the zip file. 

Poker #2

For this program, take your program from Poker #1, and add a ‘DEAL’ button that deals a new hand when pressed. Also add 5 ‘HOLD’ buttons, 1 for each of the cards in your hand. The ‘HOLD’ buttons should ‘hold’ those selected cards in hand, while the others are traded in. Next add a ‘DRAW’ button that swaps any cards not under ‘hold’ with new cards from the deck. Finally, add the following animations:
  1. New cards should slide in from the top of the screen.
  2. Old cards should slide out the bottom of the screen.
  3. When ‘DRAW’ is pressed, any cards not under the ‘hold’ condition should flip over to the backside before running the ‘exit’ animation. __my note:__ use `setAxis(new Point3D(x,y,z))` to set the 3d rotation point

For this program, simply submit the java, UML, and readme files in a compressed folder.  