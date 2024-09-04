package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class _MathFunctions {
  public static void main(String[] args) {

    Function<Integer, Integer> squareFunction = new Function <Integer, Integer>() {
      @Override
      public Integer apply(Integer x) {
        return x*x;
      }
    };

    System.out.println("Cuadrado: "+ squareFunction.apply(5));

    // Forma corta
    Function<Integer, Boolean> isOdd = X -> X % 2 !=0;
    System.out.println("Es impar: " + isOdd.apply(5));

    //Usando Prdicate
    Predicate<Integer> isPair = x -> x % 2 == 0;
    System.out.println("Es par: "+ isPair.test(2));

    // Verificar si un alumno paso la materia
    Predicate<Float> passSubject = x -> x >= 7;

    Student laferte = new Student(6.5F);
    System.out.println("Laferte aprobo? "+ passSubject.test(laferte.getCalifiacion()));

  }

  public static class Student {
    float califiacion;

    public Student() {}

    public Student(Float califiacion) {
      this.califiacion = califiacion;
    }

    public float getCalifiacion() {
      return califiacion;
    }

    public void setCalifiacion(float califiacion) {
      this.califiacion = califiacion;
    }
  }
}
