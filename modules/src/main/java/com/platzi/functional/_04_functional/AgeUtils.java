package com.platzi.functional._04_functional;

import java.util.function.Function;

/*
* Single abstract method
* Una interfaz con un unico método sin definir
* */
public class AgeUtils {
  @FunctionalInterface
  public interface MiInterfaz {
    void recibirUnString(String s);
  }

  @FunctionalInterface
  public interface TriFunction<T, U, V, R>{
    R apply(T t, U u, V v);
  }

  public static void main(String[] args) {

    Function<Integer, String> addCeros = x -> x < 10 ? "0" + x: String.valueOf(x);
    TriFunction<Integer, Integer, Integer, String> concatenar = (a, b, c) -> a.toString()+b.toString()+c.toString()+"Numeros";
    concatenar.apply(1,2,3);
    System.out.println(concatenar.apply(1,5,3));



    MiInterfaz miMensaje = s -> System.out.println("Tu mensaje es: " + s);
    miMensaje.recibirUnString("Hola, mundo!");

    MiInterfaz contarLetras = s -> System.out.println("Tu mensaje tiene: "+s.length()+ " letras");
    contarLetras.recibirUnString("Cuenta cuantas letras tengo");

  }
}
