package com.suai;

public class A {

  public synchronized void bar() {
    System.out.println("Внутри A.bar()");
  }

  public synchronized void foo(B b) {
    System.out.println("Вошли в A.foo");
    b.bar();
  }
}
