package aufgabenblatt2;

import java.util.HashMap;
import java.util.function.BinaryOperator;

public class Rechner {

  public enum Operation {
	MUL, SUB, ADD, DIV
  }

  public double berechne(Operation operation, double a, double b) {
	return map.get(operation).apply(a, b);
  }

  HashMap<Operation, BinaryOperator<Double>> map = new HashMap<Operation, BinaryOperator<Double>>();

  public Rechner() {
	map.put(Operation.MUL, (a, b) -> a * b);
	map.put(Operation.SUB, (a, b) -> a - b);
	map.put(Operation.ADD, (a, b) -> a + b);
	map.put(Operation.DIV, (a, b) -> a / b);
  }

  public static void main(String[] args) {

	Rechner resu = new Rechner();
	resu.berechne(Operation.MUL, 2.0, 3.0);

	System.out.println("" + resu);

  }
}