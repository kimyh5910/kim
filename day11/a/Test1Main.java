package com.kh.day11.a;

public class Test1Main {
  public static void main(String[] args) {
    Test1 t1 = new Test1();
    System.out.println(t1.toString());
    Class<? extends Test1> c1 = t1.getClass();


    Test1 t2 = new Test1("홍길동",30);
  }
}
