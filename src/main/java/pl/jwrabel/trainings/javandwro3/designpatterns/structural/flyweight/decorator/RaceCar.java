package pl.jwrabel.trainings.javandwro3.designpatterns.structural.flyweight.decorator;

import pl.jwrabel.trainings.javandwro3.designpatterns.Car;

/**
 * Created by jakubwrabel on 01/06/2017.
 */
public class RaceCar implements Car {
	private Car car;

	public RaceCar(Car car) {
		this.car = car;
	}

	@Override
	public void drive() {
		System.out.println("Driving fast....");
		car.drive();
	}
}
