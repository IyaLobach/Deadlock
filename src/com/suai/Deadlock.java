package com.suai;

public class Deadlock {

  public class WorkerA extends Thread {

    public void run() {
      a.foo(b);
    }
  }

  public class WorkerB extends Thread {

    public void run() {
      b.foo(a);
    }
  }

  A a = new A();
  B b = new B();

  public Deadlock() {
    WorkerA w1 = new WorkerA();
    WorkerB w2 = new WorkerB();
    try {
      w1.start();
      w2.start();
      w1.join();
      w2.join();
    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }
  public static void main(String[] args) {
    Deadlock d = new Deadlock();
  }
}
