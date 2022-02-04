package Model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square extends Shape{
    double side;

    public Square(Color color, double side) {
        // calling Shape constructor
        super(color);
        this.side = side;

    }
    @Override

    double area() {
        return side*side;
    }

    @Override

    public String toString() {
        return "Rectangle color is " + super.color +  "and area is : " + area();   }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(this.color);
        gr.fillRect(200, 100, side, side);
    }
}
