package aufgabenblatt2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamStringArray{
  
 


public static void main(String[]args){

  String[] string = new String[]{"Eingabe ", "�u�eres ", null, "Strassen-Feger", " ein Haus" };

  List<String> liste = new LinkedList<String>();
  
  Stream<String> streamString;
  
  liste = Arrays.asList(string);
  
  streamString = liste.stream().filter(s -> s != null );
  liste = streamString.collect(Collectors.toList());
  
  streamString = liste.stream().map(String::trim);
  liste = streamString.collect(Collectors.toList());
  
  
  streamString = liste.stream().map(String::toUpperCase);
  liste = streamString.collect(Collectors.toList());
  
  
  streamString = liste.stream().map(s -> s + "        ");
  streamString = liste.stream().map(s -> s.substring(0, 8));
  streamString = liste.stream().map(String::trim);
  
  liste = streamString.collect(Collectors.toList());
  
  
  System.out.println(liste);
  

}
}
