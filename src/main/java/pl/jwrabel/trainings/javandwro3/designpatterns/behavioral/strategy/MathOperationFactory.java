package pl.jwrabel.trainings.javandwro3.designpatterns.behavioral.strategy;

/**
 * Created by jakubwrabel on 01/06/2017.
 */
public class MathOperationFactory {
	public static MathOperation create(String operationChar) {
		if (operationChar.equals("+")) {
			return new AddOperation();
		} else if (operationChar.equals("-")) {
			return new SubtractOperation();
		} else if (operationChar.equals("*")) {
			return new MultiplyOperation();
		} else if(operationChar.equals("/")){
			return new DivideOperation();
		}
		return new MathOperation() {
			@Override
			public double evaluate(double x, double y) {
				return 0;
			}
		};
	}
}
