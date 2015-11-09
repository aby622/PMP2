package aufgabenblatt2;

import static org.junit.Assert.*;
import org.junit.Test;

import aufgabenblatt2.Rechner.Operation;

public class JUnitRechner {

  @Test
  public void test1() {
	IDoubleDoubleZuDouble demo;
	demo = (double op1, double op2) -> {
	  double erg1 = op1 * op2;
	  double erg2 = -op1 / op2;
	  return erg1 + erg2;
	};

	double expected = 5.333;

	assertEquals("Ergebnis", expected, demo.werteAus(2, 3), 0.001);
  }

  @Test
  public void test2() {
	Rechner rechner = new Rechner();
	double erg = rechner.berechne(Operation.ADD, 1.2, 1.4);

	double expected = 2.6;

	assertEquals("Ergebnis", expected, erg, 0.001);
  }

  @Test
  public void test3() {
	Rechner rechner = new Rechner();
	double erg = rechner.berechne(Operation.ADD, 1.2, -1.4);

	double expected = -0.2;

	assertEquals("Ergebnis", expected, erg, 0.001);
  }

  @Test
  public void test4() {
	Rechner rechner = new Rechner();
	double erg = rechner.berechne(Operation.DIV, 10.0, 2.0);

	double expected = 5.0;

	assertEquals("Ergebnis", expected, erg, 0.001);
  }

  @Test
  public void test5() {
	Rechner rechner = new Rechner();
	double erg = rechner.berechne(Operation.DIV, 2.0, 10.0);

	double expected = 0.2;

	assertEquals("Ergebnis", expected, erg, 0.001);
  }

  @Test
  public void test6() {
	Rechner rechner = new Rechner();
	double erg = rechner.berechne(Operation.MUL, 2.0, 10.0);

	double expected = 20.0;

	assertEquals("Ergebnis", expected, erg, 0.001);
  }

  @Test
  public void test7() {
	Rechner rechner = new Rechner();
	double erg = rechner.berechne(Operation.SUB, 2.0, 10.0);

	double expected = -8.0;

	assertEquals("Ergebnis", expected, erg, 0.001);
  }

  @Test
  public void test8() {
	Rechner rechner = new Rechner();
	double erg = rechner.berechne(Operation.SUB, 5.0, 2.0);

	double expected = 3.0;

	assertEquals("Ergebnis", expected, erg, 0.001);
  }

}
