//import java.util.Random; // EL import le dice donde encontrar la clase Random
import java.util.*; // EL import le dice donde encontrar la clase Random
public class NumberPicker{
	public static void main(String [] args){
		Random r  = new Random();
		// lanza un numero entre cero y nueve
		// como los arreglos java comienza contando con cero.
		//|0|-|1|-|2|-|3|-|4|-|5|-|6|-|7|-|8|-|9|
		System.out.println(r.nextInt(10));
	}
}