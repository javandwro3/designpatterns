package pl.jwrabel.trainings.javandwro3.designpatterns.behavioral.strategy;

import java.util.Scanner;

/**
 * Created by jakubwrabel on 01/06/2017.
 */
public class Calculator {
	public static void main(String[] args) {
		System.out.println("Podaj x:");
		int x = new Scanner(System.in).nextInt();
		System.out.println("Podaj y:");
		int y = new Scanner(System.in).nextInt();
		System.out.println("Podaj znak (+,-,*,/):");
		String operator = new Scanner(System.in).nextLine();

		MathOperation mathOperation = MathOperationFactory.create(operator);

		double result = mathOperation.evaluate(x, y);


		System.out.println("Wynik: " + result);


	}
}
