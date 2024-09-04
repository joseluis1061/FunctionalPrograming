package com.platzi.functional._09_defaults;

public class StringFunctions {

  @FunctionalInterface
  interface StringOperation {
    int getAmount();

    default void operate(String text){
      int x = getAmount();
      // Mientras que X mayor a cero
      while (x-- > 0){
        System.out.println("Texto: "+text+"_"+x);
      }
    }
  }

  @FunctionalInterface
  public interface RepeatOperation{
    void takeText(String text);

    public default void DoOperation(Integer t, String text){
      while (t-- > 0){
        takeText(text);
      }
    }
  }

  public static void main(String[] args) {
    StringOperation getMonto = () -> 5;
    getMonto.operate("Mi texto");

    RepeatOperation repeatOperation = System.out::println;
    repeatOperation.DoOperation(4, "José");

  }
}
