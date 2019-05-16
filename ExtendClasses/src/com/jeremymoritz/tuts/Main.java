package com.jeremymoritz.tuts;

import com.jeremymoritz.tuts.model.ClothingItem;
import com.jeremymoritz.tuts.model.Shirt;

public class Main {

  public static void main(String[] args) {
    Shirt shirt = new Shirt("L", 19.99);
    ClothingItem clothingItem = new ClothingItem("hat", "M", 12.99);

    System.out.println(shirt);
    System.out.println(clothingItem);

    ClothingItem reallyAShirt = new Shirt("M", 15.49);

    shirt.setPattern("Plaid");
    Shirt shirt2 = (Shirt) reallyAShirt;
    shirt2.setPattern("solid");

    System.out.println(shirt2);
  }
}
