# Minecraft Blocks

 | Due Date | Readme | UML |
 | - | - | - |
| 02-04-2021 | [[minecraft block readme]] | [[minecraft block uml]] |

HW 1

COSC 1174

Ch 11 Inheritance and Polymorphism

>All code should have comments for every method and variable. It may seem obvious to you what you were writing, but when you are working on a team, it will save a lot of time and questions from your teammates who it may not be so obvious to.

>The top of every class you submit should have a block comment containing name, course #, date, assignment name, and anything else significant like partner names for group work.

>All programs should be put into a single folder with a readme file explaining how the program should be run, and a UML of the programs you wrote. Then zip the folder (7zip is free and simple) and submit the zip file.

## Minecraft Blocks
Let’s consider a simplified version of the Minecraft block. All Minecraft blocks use the same data fields and methods that determine how they behave. In this assignment we will select a handful of key properties to create a simplified version of the block class. To make the superclass, use the following UML:

| Block |
| - |
| blockID: int |
| blockName: String |
| toolNeeded: boolean |
| hardness: int |
| itemDrop: String |

+Block()

+Block(blockID: int, blockName: String, toolNeeded: boolean, hardness: int)

+setHardness(int): void

+getHardness(): int

+isDestroyed(): String

Then we will use this as a super class to create a subclass of a specific block. First, make a sand class that extends Block, and use the following values to define a sand block;

blockID: 55

blockName: sand

toolNeeded: true

hardness: 2

itemDrop: sand

Next, create 2 constructors for sand, 1 default, and 1 that takes in all 5 data fields. (note: both constructors should set the data fields to the same values, as sand must have these values to be sand)

Now override all the methods inherited from Block. For isDestroyed, you should invoke getHardness(), and if it is less than 1, return the itemDrop (we won’t worry about actually destroying the block in this class)

Finally, write a test class containing the main method, which creates a sand block, and asks the user if they have a shovel. If they do not, they cannot break the block, and they must move on, but if they do, they can start digging. Each digging action should reduce the sand’s hardness until it is below 1, in which case the user is given their sand, and they move on.