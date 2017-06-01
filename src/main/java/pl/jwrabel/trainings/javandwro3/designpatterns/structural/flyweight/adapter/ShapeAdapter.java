package pl.jwrabel.trainings.javandwro3.designpatterns.structural.flyweight.adapter;

/**
 * Created by jakubwrabel on 27.03.2017.
 */
public class ShapeAdapter implements Shape{
	Rectangle rectangle;
	Line line;

	public ShapeAdapter(Rectangle rectangle) {
		this.rectangle = rectangle;
	}

	public ShapeAdapter(Line line) {
		this.line = line;
	}

	@Override
	public void draw(int x1, int y1, int x2, int y2) {
		if(rectangle != null){
			rectangle.drawRectangle(x1, y1, x2, y1, x2, y2, x1, y2);
		} else if(line != null){
			line.drawLine(x1, y1, x2, y2);
		}
	}
}
