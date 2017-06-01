package pl.jwrabel.trainings.javandwro3.designpatterns.creational.singleton;

/**
 * Created by jakubwrabel on 01/06/2017.
 */
public class MySingletonLazyInit {
	private static MySingletonLazyInit INSTANCE = null;

	private MySingletonLazyInit() {
	}

	public static MySingletonLazyInit getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new MySingletonLazyInit();
		}
		return INSTANCE;
	}
}
