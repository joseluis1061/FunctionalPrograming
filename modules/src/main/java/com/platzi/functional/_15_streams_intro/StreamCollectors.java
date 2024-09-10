package com.platzi.functional._15_streams_intro;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamCollectors {
  public static void main(String[] args) {
    IntStream infinityStream = IntStream.iterate(0, x -> x+1);
    List<Integer> evenNumbers =infinityStream.limit(1000)
        .filter(x -> x % 2 == 0)
        .map(x -> x * 2) // Multiplica cada número par por 2
        .peek(x -> System.out.println("Par "+ x)) // Solo imprime mensaje si hay una función finalizadora
        .distinct() // Asegura que todos los números sean únicos
        .sorted() // Ordena los números;
        .boxed() // Convierte intStream a Stream
        .collect(Collectors.toList());
  }
}
