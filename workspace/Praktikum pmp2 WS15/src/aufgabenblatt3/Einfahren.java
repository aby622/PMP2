package aufgabenblatt3;

public class Einfahren extends Rangierbahnhof implements IbewegeZug{

  @Override
  public void parken(int gleis) {
	einfahren(gleis);
  }

}