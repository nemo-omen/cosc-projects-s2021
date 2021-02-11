/********************************************
 * Name: Jeff Caldwell
 * Class: COSC 1174-48L
 * Assignment: Minecraft Blocks
 * Date: February 3, 2021
********************************************/

/**
* Represents a Sand block, which inherits from the Block class
*/
public class Sand extends Block {

   /**
    * ID of the block
    */
   int blockId;

   /**
    * name of the block
    */
   String blockName;

   /**
    * whether tool is needed to cause an item to drop
    */
   boolean toolNeeded;

   /**
    * hardness of the block
    */
   // 
   int hardness;

   /**
    * item that will drop if the block is destroyed
    */
   String itemDrop;

   /**
    * Creates a new Sand block with default values.
    */
   public Sand(){
       super(55, "sand", true, 2);
       this.blockId = super.blockId;
       this.blockName = super.blockName;
       this.toolNeeded = super.toolNeeded;
       this.itemDrop = "sand";
   }

   /**
    * @param blockId  sets the id of the block.
    * @param blackName  sets the name of the block
    * @param toolNeeded  sets whether tool is needed to destroy the block
    * @param hardness  sets the hardness of the block
    * @param itemDrop  sets the name of the dropped item when block is destroyed
    */
   public Sand(int blockId, String blockName, boolean toolNeeded, int hardness, String itemDrop) {
       this.blockId = blockId;
       this.blockName = blockName;
       this.toolNeeded = toolNeeded;
       this.hardness = hardness;
       this.itemDrop = itemDrop;
   }

   /**
    * Setter for the block's hardness
    * @param hardness sets the hardness to the desired integer value
    */
   public void setHardness(int hardness) {
       this.hardness = hardness;
   }
   
   /**
    * Getter for the block's hardness
    * @return the remaining hardness of the block 
    */
   public int getHardness() {
       return this.hardness;
   }

   /**
    * Determines if the block has been destroyed
    * @return a string indicating whether the block is destroyed
    */
   public String isDestroyed() {
       /**
        * the hardness value returned by getHardness
        */
       int thisHardness = getHardness();

       /**
        * what is being dropped upon item destruction
        */
       String dropped;
       
       if(thisHardness <= 0) {
           if(this.itemDrop != null) {
               dropped = this.itemDrop;
           } else {
               dropped = "nothing";
           }
       } else {
           dropped = "nothing";
       }

       return dropped;
   }

   @Override
    public String toString() {
        return "\n\nSand <<Block>> {" + "\n\n" +
            "  blockId: " + blockId + "\n\n" +
            "  blockName: " + blockName + "\n\n" +
            "  toolNeeded: " + toolNeeded + "\n\n" +
            "  hardness: " + hardness + "\n\n" +
            "  itemDrop: " + itemDrop + "\n\n" +
            "}\n\n";
    }
}
