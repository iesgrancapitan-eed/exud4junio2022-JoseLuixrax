package com.jlpl.examen.junio;

/**
 * Programa que simula el comportamiento de una moto.
 * 
 * @author Jose Luis Pérez Lara
 *
 */
class Bike implements Vehicle {
	/**
	 * Almacena la velocidad a la que va la moto.
	 */
	int speed;
	/**
	 * Almacena la marcha a la que va la moto.
	 */
	int gear;

	/**
	 * Cambia la marcha a la que va la moto.
	 * @param newGear	Nueva marcha a la que va la moto.
	 */
	@Override
	public void changeGear(int newGear) {
		gear = newGear;
	}
	/**
	 * Devuelve la velocidad a la que va la moto.
	 * @return speed	Velocidad a la que va la moto.
	 */
	@Override
	public int getSpeed() {
		return speed;
	}
	/**
	 * Modifica la velocidad a la que va la moto.
	 * @param speed	Nueva velocidad a la que circula.
	 */
	@Override
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	/**
	 * Devuelve la marcha a la que circula la moto.
	 * @return gear	Marcha a la que va la moto.
	 */
	@Override
	public int getGear() {
		return gear;
	}
	/**
	 * Modifica la marcha a la que va la moto.
	 * @param gear	Nueva marcha a la que irá la moto.
	 */
	@Override
	public void setGear(int gear) {
		this.gear = gear;
	}
	/**
	 * Aumenta la velocidad de la moto.
	 * @param increment	Velocidad en la que aumenta la velocidad inicial.
	 */
	@Override
	public void speedUp(int increment) {
		speed = speed + increment;
	}
	/**
	 * Frena la moto en una velocidad determinada.
	 * @param decrement	Velocidad en la que frena la moto.
	 */
	@Override
	public void applyBrakes(int decrement) {
		speed = speed - decrement;
	}
	/**
	 * Imprime el estado de la moto.
	 * Muestra la velocidad y la marcha.
	 */
	@Override
	public void printStates() {
		System.out.println("speed: " + speed + " gear: " + gear);
	}
	/**
	 * Devuelve el objeto moto con sus atributos en forma de cadena de texto.
	 */
	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", gear=" + gear + "]";
	}

}

//class Bike implements Vehicle {
//    
//  int speed;
//  int gear;
//
//  @Override
//  public void changeGear(int newGear){
//        
//      gear = newGear;
//  }
//    
//  @Override
//  public void speedUp(int increment){
//        
//      speed = speed + increment;
//  }
//
// @Override
//  public void applyBrakes(int decrement){
//        
//      speed = speed - decrement;
//  }
//    
//  public void printStates() {
//      System.out.println("speed: " + speed
//          + " gear: " + gear);
//  } 
//}

//class GFG {
//    
//  public static void main (String[] args) {
//    
//      // creating an inatance of Bike
//      // doing some operations
//      Bike bicycle = new Bike();
//      bicycle.changeGear(2);
//      bicycle.speedUp(3);
//      bicycle.applyBrakes(1);
//        
//      System.out.println("Bike present state :");
//      bicycle.printStates();
//        
//      // creating instance of the bike.
//      Bike bike = new Bike();
//      bike.changeGear(1);
//      bike.speedUp(4);
//      bike.applyBrakes(3);
//        
//      System.out.println("Bike present state :");
//      bike.printStates();
//  }
//}