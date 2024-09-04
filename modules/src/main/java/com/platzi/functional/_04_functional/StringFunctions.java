package com.platzi.functional._04_functional;

import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class StringFunctions {
  public static void main(String[] args) {

    UnaryOperator<String> addExclamator = world -> {return world + "!";};
    System.out.println(addExclamator.apply("Hola"));

    //Division
    BiFunction<Integer, Integer, Float> divide = (a, b) -> {
      float x = a.floatValue();
      float y = b.floatValue();
      return (x/y);
    };

    System.out.println("División "+divide.apply(5,7));

    // Agregar espacios a la izquierda de un string
    BiFunction<String, Integer,String > leftPad = (text, spaceNumber) -> {
      return String.format("%" + spaceNumber + "s", text);
    };

    System.out.println("leftPad: "+ leftPad.apply("Hola", 5));
    System.out.println("leftPad: "+ leftPad.apply("Hola", 10));

    Integer numeroEntero1;
    Integer numeroEntero2 = 0;
    numeroEntero1 = numeroEntero2;

    System.out.println("Igualdad: ");
  }
}
