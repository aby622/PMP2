package aufgabenblatt4;

import java.util.regex.Pattern;

public class PolygonSkripting {
  
  /** Methode überprüft, ob der Eingegebene Befehl der Syntax entspricht. 
   * @param befehl
   * @return boolean
   */
  public boolean pruefe(String befehl) {

	String rAusdruck = "bewege -> [0-9]{0,1}[0-9]{0,1}[0-9]{0,1},[0-9]{0,1}[0-9]{0,1}[0-9]{0,1}";
	return Pattern.matches(rAusdruck, befehl);
  }

}

