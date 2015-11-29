package aufgabenblatt3;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitFahren {


  @Test
  public void ausfahrenTest(){
	
	Rangierbahnhof bahnhof = new Rangierbahnhof();
	Zug[] resu = {new Zug(), null, null};
	Zug[] zuege = new Zug[3];
	
	bahnhof.einfahren(zuege, 0);
	
	assertEquals(resu.toString(), zuege.toString());
  }

  @Test
  public void einfahrenTest(){
	
	Rangierbahnhof bahnhof = new Rangierbahnhof();
	Zug[] zuege = {new Zug(), null, null};
	Zug[] resu = new Zug[3];
	
	bahnhof.ausfahren(zuege, 0);
	
	assertEquals(resu.toString(), zuege.toString());
  }
}