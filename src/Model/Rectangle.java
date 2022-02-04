package Model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends Shape{
    double width, height;

    public Rectangle(Color color, double width, double height) {
        // calling Shape constructor
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override

    double area() {
        return width*height;
    }

    @Override

    public String toString() {
        return "Rectangle color is " + super.color +  "and area is : " + area();   }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(this.color);
        gr.fillRect(200, 100, width, height);
    }
}
