package pl.jwrabel.trainings.javandwro3.designpatterns.behavioral;

/**
 * Created by jakubwrabel on 01/06/2017.
 */
public class Customer {
	public static final Customer DEFAULT = new Customer("UNKNOWN", "UNKWNOWN");

	private String pesel;
	private String name;

	public Customer(String pesel, String name) {
		this.pesel = pesel;
		this.name = name;
	}
}
