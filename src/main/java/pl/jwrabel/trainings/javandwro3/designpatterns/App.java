package pl.jwrabel.trainings.javandwro3.designpatterns;

import pl.jwrabel.trainings.javandwro3.designpatterns.creational.singleton.Customer;
import pl.jwrabel.trainings.javandwro3.designpatterns.creational.singleton.MySingleton;
import pl.jwrabel.trainings.javandwro3.designpatterns.creational.singleton.MySingleton2;
import pl.jwrabel.trainings.javandwro3.designpatterns.creational.singleton.SimplestEverSingleton;
import pl.jwrabel.trainings.javandwro3.designpatterns.structural.flyweight.decorator.RaceCar;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		MySingleton mySingleton = MySingleton.INSTANCE;
		MySingleton2 mySingleton2 = MySingleton2.getInstance();

		SimplestEverSingleton simplestEverSingleton = SimplestEverSingleton.INSTANCE;

		Car car = CarFactory.create("camaro");
		car.drive();

		Customer customer2 = new Customer.Builder("1234", "Kowalski")
				.withFirstName("Adam")
				.withFootSize(100)
				.build();

		System.out.println(customer2);

		System.out.println("DECORATOR");
		Car car1 = new CamaroSS();
		car1.drive();

		car1 = new RaceCar(new CamaroSS());
		car1.drive();

		car = new RaceCar(new Mustang());
		car.drive();
	}
}
