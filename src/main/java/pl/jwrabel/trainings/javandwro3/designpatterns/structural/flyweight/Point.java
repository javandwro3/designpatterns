package pl.jwrabel.trainings.javandwro3.designpatterns.structural.flyweight;

/**
 * Created by jakubwrabel on 01/06/2017.
 */
public class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
