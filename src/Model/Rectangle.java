package Model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends Shape{
    double width, height;

    public Rectangle(Color color, double width, double height,Color ColorOutline) {
        // calling Shape constructor
        super(color, ColorOutline);
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
        gr.setLineWidth(5);
        gr.setStroke(this.ColorOutline);
        gr.fillRect(200, 100, width, height);
        gr.strokeRect(200, 100, width, height);
    }
}
