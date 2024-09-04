package com.platzi.functional._11_composition;
import java.util.function.Function;

public class Composicion {
  static Function<Integer, Integer> SumarDos = x -> {
    System.out.println("A x "+ x +" sumar dos");
    return x+2;
  };

  static Function<Integer, Integer> SumarDosThenCuadrado = SumarDos.andThen(y -> {
    System.out.println("A y "+y+" elevar al cuadrado");
    return y*y;
  });

  Function<Integer, Integer> SumarDosCuadradoTheTriplicar = SumarDosThenCuadrado.andThen(z -> {
    System.out.println("Z "+z + " *3");
    return z*3;
  });

  public static void main(String[] args) {
    System.out.println(SumarDosThenCuadrado.apply(5));
  }
}
