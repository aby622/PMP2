package aufgabenblatt3;

public class Einfahren extends Rangierbahnhof implements IbewegeZug{

  @Override
  public void parken(Zug[] zuege, int gleis) {
	einfahren(zuege, gleis);
  }

}
