package Model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square extends Shape{
    double side;

    public Square(Color color, double side,Color ColorOutline) {
        // calling Shape constructor
        super(color, ColorOutline);
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
    public void draw(GraphicsContext gr, double x, double y) {
        gr.setFill(this.color);
        gr.setLineWidth(5);
        gr.setStroke(this.ColorOutline);
        gr.fillRect(200, 100, side, side);
        gr.strokeRect(200, 100, side, side);
    }
}
