package com.platzi.functional._15_streams_intro;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsChanning {
  public static void main(String[] args) {
    String [] nombresList = {"Marco","Marisol","Roberto"};
    List<String> nombresArray = Arrays.asList(nombresList);
    Stream<String> nombresStream = nombresArray.stream();
    // Usando channing para encadenar operaciones
//    nombresStream.map(curso -> curso+"!!")
//        .filter(nombre -> nombre.contains("Marco!!"))
//        .forEach(System.out::println);

    addOpperatorSpeak(
        nombresStream
            .map(curso -> curso+"!!")
            .filter(nombre -> nombre.contains("Marco!!"))
    ).forEach(System.out::println);


  }

  static <T> Stream<T> addOpperatorSpeak(Stream<T> stream){
    return stream.peek(dato -> System.out.println("Dato: "+ dato));
  }
}
