package aufgabenblatt2;

import java.time.LocalTime;

public class Rennauto extends Thread {

  private double geschwindigkeit;
  String name;

  public Rennauto(String name) {

	this.geschwindigkeit = 0.0;
	this.name = name;
  }

  @Override
  public void run() {
	double start = System.currentTimeMillis();
	int schritt = 1;
	while (geschwindigkeit < 10) {
	  geschwindigkeit = (geschwindigkeit + schritt);
	  System.err.println("  " + name + ": " + (float) geschwindigkeit + "/" + "10.0");
	  try {
		Thread.sleep((long) (Math.random() * (1200 - 800) + 800));
	  } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
	}
	double now = System.currentTimeMillis();
	double ende = Math.round(10.0 * ((now - start) / 1000)) / 10.0;
	System.err.println(name + ": " + ende + " Sek");
  }

  public static void main(String[] args) {
	Rennauto golf = new Rennauto("golf");
	Rennauto mercedes = new Rennauto("mercedes");
	Rennauto audi = new Rennauto("audi");

	golf.start();
	mercedes.start();
	audi.start();
  }
}
