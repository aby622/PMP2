package aufgabenblatt3;


public class Lokfuehrer extends Thread implements IbewegeZug {

  protected IbewegeZug aktion;
  protected Rangierbahnhof bahnhof;

  public Lokfuehrer(IbewegeZug aktion, Rangierbahnhof bahnhof) {
	this.aktion = aktion;
	this.bahnhof = bahnhof;
  }

  public void parken(int gleise) {
	aktion.parken(gleise);
  }

  @Override
  public void run() {
	while(!isInterrupted()){
	while (new Lokfuehrer(aktion, bahnhof) == new Lokfuehrer(new Einfahren(), bahnhof)) {
	  new Lokfuehrer(new Einfahren(), bahnhof).start();
	}
	while (new Lokfuehrer(aktion, bahnhof) == new Lokfuehrer(new Ausfahren(), bahnhof)) {
	  new Lokfuehrer(new Ausfahren(), bahnhof).start();
	}
	}
  }


  

}
