package com.suai;

public class B {

  public synchronized void bar() {
    System.out.println("Внутри B.bar()");
  }

  public synchronized void foo(A a) {
    System.out.println("Вошли в B.foo");
    a.bar();
  }
}
