package com.jlpl.examen.junio;

interface Vehicle {

	void changeGear(int newGear);

	int getSpeed();

	void setSpeed(int speed);

	int getGear();

	void setGear(int gear);

	void speedUp(int increment);

	void applyBrakes(int decrement);

	void printStates();

}