package Gilded;

import static org.junit.Assert.*;
import org.junit.Test;


public class ItemTest{

  @Test
  public void Item{
    Item item= new Item("coucou",0,0);

  }

  @Test
  public String toString() {
      Item item= new Item("coucou",0,0);
      return this.name + ", " + this.sellIn + ", " + this.quality;
   }

}
