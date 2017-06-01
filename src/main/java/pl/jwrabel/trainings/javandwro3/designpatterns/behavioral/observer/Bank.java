package pl.jwrabel.trainings.javandwro3.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jakubwrabel on 01/06/2017.
 */
public class Bank {

	List<Observator> observators = new ArrayList<>();

	public void rateChanged() {
		System.out.println("RATES CHANGED");

		for (Observator observator : observators) {
			observator.notifyAboutChange();
		}
	}

	public void addObservator(Observator observator) {
		observators.add(observator);
	}
}
