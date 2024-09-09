package com.platzi.functional._15_streams_intro;

import com.platzi.functional.util.Utils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsC1 {
  public static void main(String[] args) {
    Stream<String> listStreamCursos = Stream.of("Java","Spring","Jakarta","Angular","React");

    // Crear un Stream con el tamaño de cada palabra
    Stream<Integer> numeroCaracteres = listStreamCursos.map(String::length);
    // Recorrerlo con un forEach
    //numeroCaracteres.forEach(System.out::println);
    // No sabemos si se retornen datos es util usar un optional
    Optional<Integer> maxNumeroCaracter = numeroCaracteres.max((x,y)-> y-x);
    maxNumeroCaracter.ifPresent(integer -> System.out.println("Valor maximo = "+integer));
    // Un Stream no puede usarse dos veces se debe consumir una sola vez y son inmutables
  }

}
