package pl.jwrabel.trainings.javandwro3.designpatterns.behavioral.observer;

/**
 * Created by jakubwrabel on 01/06/2017.
 */
public class Customer implements Observator {
	private String name;

	public Customer(String name) {
		this.name = name;
	}


	@Override
	public void notifyAboutChange() {
		System.out.println("Customer " + name + " has been notified");
	}
}
