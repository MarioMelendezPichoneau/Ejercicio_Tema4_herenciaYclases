package Ejercicio_Tema4_herenciaYclases;

/*
 * 
 * En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.

Agregaréis atributos tal cual tendrían esos objetos en la realidad.

Crear constructor vacío y con todos los parámetros para cada clase.

Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
 */

public class Maindivice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 SmartPhone phone = new SmartPhone("Apple", "iPhone 12", "Black", "iOS");
	     SmartWatch watch = new SmartWatch("Samsung", "Galaxy Watch", "Silver", 48);
	        
	        phone.printDetails();
	        System.out.println();
	        watch.printDetails();

	}

}
