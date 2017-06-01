package pl.jwrabel.trainings.javandwro3.designpatterns.behavioral.strategy;

/**
 * Created by jakubwrabel on 01/06/2017.
 */
public class AddOperation implements MathOperation {
	@Override
	public double evaluate(double x, double y) {
		return x + y;
	}
}
