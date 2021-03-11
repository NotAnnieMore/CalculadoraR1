package es;

/**
 * A classe Calculadora contém métodos para realizar as operações aritméticas
 * 
 * <ul>
 * 	<li> somar </li>
 * 	<li> subtrair </li>
 * 	<li> multiplicar </li>
 * 	<li> dividir </li>
 * </ul>
 * 
 * @author Ivo Camacho
 *
 */

public class Calculadora {

/**
 * 
 * @param operando1
 * @param operando2
 * @return retorna o resultado
 * 
 */
	public  static double somar( double operando1, double operando2) {
		return operando1 + operando2;
	}
	
	
	public  static double subtrair( double operando1, double operando2) {
		return operando1 - operando2;
	}
	
	public  static double multiplicar( double operando1, double operando2) {
		return operando1 * operando2;
	}
	
	
	public  static double dividir( double operando1, double operando2) {
		return operando1 / operando2;
	}
	
}
