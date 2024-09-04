package com.platzi.functional._04_functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class OperadoresPorReferencia {
  static <T> List<T> getList(T... elements){
    return Arrays.asList(elements);
  }

  public static void main(String[] args) {
    List<String> profesores = getList("Ana", "Pedro", "Pablo", "Sebastian");
    Consumer<String> printString = s -> System.out.println(s);
    profesores.forEach(printString);
    System.out.println("********************************");
    profesores.forEach(System.out::println);
  }
}
