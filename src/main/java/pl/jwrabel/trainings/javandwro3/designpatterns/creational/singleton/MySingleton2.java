package pl.jwrabel.trainings.javandwro3.designpatterns.creational.singleton;

/**
 * Created by jakubwrabel on 01/06/2017.
 */
public class MySingleton2 {
	private static final MySingleton2 INSTANCE = new MySingleton2();

	private MySingleton2() {
	}

	public static MySingleton2 getInstance() {
		return INSTANCE;
	}
}
