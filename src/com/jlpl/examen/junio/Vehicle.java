package com.jlpl.examen.junio;
/**
 * Utilizada en la creacion de vehículos.
 * 
 * @author Jose Luis Pérez Lara
 *
 *
 */
interface Vehicle {
	/**
	 * Cambia la marcha del vehiculo.
	 * @param newGear	Nueva marcha a la que cambia el vehiculo.
	 */
	void changeGear(int newGear);
	/**
	 * Devuelve la velocidad a la que va el vehiculo.
	 * @return speed Velocidad a la que va el vehiculo.
	 */
	int getSpeed();
	/**
	 * Modifica la velocidad a la que va el vehículo.
	 * @param speed	Nueva velocidad a la que va el vehículo.
	 */
	void setSpeed(int speed);
	/**
	 * Devuelve la marcha a la que va el vehículo.
	 * @return gear Marcha a la que va el Vehículo.
	 */
	int getGear();
	/**
	 * Modifica la marcha a la que va el vehículo.
	 * @param gear	Nueva marcha a la que irá el vehículo.
	 */
	void setGear(int gear);
	/**
	 * Aumenta la velocidad a la que va el vehículo.
	 * @param increment	Velocidad que aumenta el vehículo respecto a la inicial.
	 */
	void speedUp(int increment);
	/**
	 * Frena el vehículo en una cierta velocidad.
	 * @param decrement	Velocidad que frena el vehículo.
	 */
	void applyBrakes(int decrement);
	/**
	 * Imprime el estado del vehículo.
	 */
	void printStates();

}