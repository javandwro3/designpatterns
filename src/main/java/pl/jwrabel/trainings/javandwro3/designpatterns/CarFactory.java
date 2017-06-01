package pl.jwrabel.trainings.javandwro3.designpatterns;

/**
 * Created by jakubwrabel on 01/06/2017.
 */
public class CarFactory {
	public static Car create(String name) {
		if (name.equals("mustang")) {
			return new Mustang();
		} else if (name.equals("camaro")) {
			return new CamaroSS();
		}
		return null;
	}
}
