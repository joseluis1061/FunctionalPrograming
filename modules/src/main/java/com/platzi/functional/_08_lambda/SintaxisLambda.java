package com.platzi.functional._08_lambda;

import java.util.function.Predicate;

public class SintaxisLambda {
  public static void myPredicate(Predicate<Integer> predicate){};

  public static void main(String[] args) {
    myPredicate(x -> x % 2 == 0);
  }
}
