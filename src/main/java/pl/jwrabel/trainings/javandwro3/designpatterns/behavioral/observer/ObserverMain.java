package pl.jwrabel.trainings.javandwro3.designpatterns.behavioral.observer;

/**
 * Created by jakubwrabel on 01/06/2017.
 */
public class ObserverMain {
	public static void main(String[] args) {
		Customer customer = new Customer("Adam");
		Customer customer2 = new Customer("Piotr");
		Customer customer3 = new Customer("Jan");

		Bank bank = new Bank();
		bank.addObservator(customer);
		bank.addObservator(customer2);
		bank.addObservator(customer3);

		bank.rateChanged();
	}
}
