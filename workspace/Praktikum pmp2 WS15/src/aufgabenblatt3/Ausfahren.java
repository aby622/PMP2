package aufgabenblatt3;

public class Ausfahren extends Rangierbahnhof implements IbewegeZug{

  @Override
  public void parken(int gleis) {
	ausfahren(gleis);
  }

}
