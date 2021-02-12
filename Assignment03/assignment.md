<section style="text-align: center;">

<h1>HW 3</h1>

<h2>COSC 1174</h2>

<h3>Ch 13 Abstract Classes and Interfaces</h3>

</section>

>All code should have comments for every method and variable. It may seem obvious to you what you were writing, but when you’re working on a team, it will save a lot of time and questions from your teammates who it may not be so obvious to.

>The top of every class you submit should have a block comment containing name, course #, date, assignment name, and anything else significant like partner names for group work.
All programs should be put into a single folder with a readme file explaining how the program should be run. Then zip the folder (7zip is free and simple) and submit the zip file. 

## Vehicles

In this exercise, you need to create a program that simulates and compares different types of vehicles. There should be 4 classes and one interface.

First, the abstract vehicle class should contain data fields common to all different types of vehicles, like steeringDevice, numberOfEngines, whereToDrive, starterType, and passengers. It should also have methods common to all vehicles, including getter and setter methods, a method that compares the number of passengers and returns which vehicle is larger, and a method that compares the number of engines, and returns which vehicle is faster (I know not all engines are equal, but to keep it simple, more engines means faster). Lastly, an abstract method called howToStart.

Second, make an interface called wayToDrive. This interface should have the methods; turnLeft, turnRight, and goStraight.

Finally, make 3 classes that extend Vehicle, and implement wayToDrive. They will be called Boat, Plane, and Truck. These classes must define all abstract methods, and all aspects inherited and implemented in ways that makes sense for what they are i.e. a truck’s steeringDevice would be wheel.

For this program, simply submit the java files, UML diagram, and readme file in a compressed folder.