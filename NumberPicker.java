//import java.util.Random; // EL import le dice donde encontrar la clase Random
// Esto no esta bien por que estamos redundando en imports
import java.util.*; // EL import le dice donde encontrar la clase Random
import java.util.random.*; // EL import le dice donde encontrar la clase Random
import java.lang.*; // EL import le dice donde encontrar la clase Random
import java.lang.System;
public class NumberPicker{
	public static void main(String [] args){
		Random r  = new Random();
		// lanza un numero entre cero y nueve
		// como los arreglos java comienza contando con cero.
		//|0|-|1|-|2|-|3|-|4|-|5|-|6|-|7|-|8|-|9|
		java.util.logging.Logger log = java.util.logging.Logger.getLogger(NumberPicker.class.getName());                
		int number = r.nextInt(10); // EL nextInt(10) le dice al Random que el numero sera entre 0 y 9
		log.info("El numero es: " + number);
	}
}