package com.jeremymoritz.tuts.model;

public class Shirt extends ClothingItem {
  private String pattern = "not set";

  public Shirt(String size, double price) {
    super("shirt", size, price);
  }

  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }
}
