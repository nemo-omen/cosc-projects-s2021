# Minecraft Block
Name: Jeff Caldwell
Class: COSC 1174-48L
Assignment: Minecraft Blocks
Date: February 3, 2021
```plantuml

package "Minecraft Block" #DDDDDD {

  class MinecraftBlock {
    blockId: int
    blockName: String
    toolNeeded: boolean
    hardness: int
    itemDrop: String 
    +Block()
    +Block(blockID: int, blockName: String, toolNeeded: boolean, hardness: int)
    +setHardness(int): void
    +getHardness(): int
    +isDestroyed(): String
  }
  
  class Sand <<MinecraftBlock>> {
    blockID: 55
    blockName: sand
    toolNeeded: true
    hardness: 2
    itemDrop: sand

    +Sand()
    +Sand(blockID: int, blockName: String, toolNeeded: boolean, hardness: int, itemDrop: String)
    +setHardness(int): void
    +getHardness(): int
    +isDestroyed(): String
  }

  MinecraftBlock <|-- Sand
}
```