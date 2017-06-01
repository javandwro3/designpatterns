package pl.jwrabel.trainings.javandwro3.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by jakubwrabel on 01/06/2017.
 */
public class PointsFactory {

	static List<Point> pointsList = new ArrayList<Point>();

	public static Point create(int x, int y) {

		Optional<Point> foundPoint = pointsList.stream().filter(p -> p.getX() == x && p.getY() == y).findFirst();

		if (foundPoint.isPresent()) {
			return foundPoint.get();
		} else {
			Point point = new Point(x, y);
			pointsList.add(point);
			return point;
		}
	}
}
