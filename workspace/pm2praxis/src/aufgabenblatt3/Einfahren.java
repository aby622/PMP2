/**
 * PMP2, WS 2015/16
 * Gruppe: Jannes Volkens (jannes.volkens@haw-hamburg.de),
 * Leon Schlichting (leon.schlichting@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 3, Aufgabe 2
 */

package aufgabenblatt3;

/**
 * Klasse Einfahren extends Rangierbahnhof implements IbewegeZug überschreibt
 * die parken Methode aus dem Interface IbewegeZug und verbindet es mit der
 * entsprechenden synchronized Methode aus Rangierbahnhof.
 * 
 * @author Leon
 *
 */
public class Einfahren extends RangierBf implements IZugBewegen {
  
  private int gleis;
  
  private RangierBf bf;
  
  private Zug zug;
  
  public Einfahren(RangierBf bahnhof, Zug zug, int gleis){
	this.gleis=gleis;
	this.bf = bahnhof;
	this.zug = zug;
	
  }
  /**
   * @Override Überschreibt Methode parken aus Interface IbewegeZug
   */
  @Override
  public void parken() {
	// Zug objekt erzeugen
	// -> versuch: Zug -> Gleis 'gleis' 
	bf.einfahren(zug, gleis);
  }

}
