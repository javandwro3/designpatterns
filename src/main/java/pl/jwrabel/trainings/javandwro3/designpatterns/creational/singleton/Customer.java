package pl.jwrabel.trainings.javandwro3.designpatterns.creational.singleton;

/**
 * Created by jakubwrabel on 01/06/2017.
 */
public class Customer {
	private String pesel;
	private String firstName;
	private String lastName;
	private int childrenNumber;
	private int footSize;

	public static class Builder {
		private String pesel;
		private String firstName;
		private String lastName;
		private int childrenNumber;
		private int footSize;


		public Builder(String pesel, String lastName) {
			this.pesel = pesel;
			this.lastName = lastName;
		}

		public Builder withFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder withChilrenNumber(int childrenNumber) {
			this.childrenNumber = childrenNumber;
			return this;
		}

		public Builder withFootSize(int footSize) {
			this.footSize = footSize;
			return this;
		}

		public Customer build() {
			Customer customer = new Customer();
			customer.childrenNumber = childrenNumber;
			customer.firstName = firstName;
			customer.footSize = footSize;
			customer.lastName = lastName;
			customer.pesel = pesel;

			return customer;
		}
	}
}
