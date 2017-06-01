package pl.jwrabel.trainings.javandwro3.designpatterns.behavioral;

/**
 * Created by jakubwrabel on 01/06/2017.
 */
public class NullObjectMain {
	public static void main(String[] args) {

	}

	public static Customer create(String pesel, String name) {
		if (pesel == null) {
			return Customer.DEFAULT;
		}

		return new Customer(pesel, name);
	}
}
