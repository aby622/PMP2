package aufgabenblatt1;

import java.util.List;

public class Pruefklasse {
	public void isFirstElementAnInt(List<?> liste){
		Object pruefen = liste.get(0);
		 if(pruefen instanceof Integer){
			 System.out.println(true);
			 
		 }
		
		
		
	}

}
