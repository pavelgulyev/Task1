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
    public void draw(GraphicsContext gr, double x, double y) {
        gr.setFill(this.color);
        gr.setLineWidth(5);
        double centerX = x-width/2;
        double centerY = y-height/2;
        gr.setStroke(this.ColorOutline);
        gr.fillRect(centerX, centerY, width, height);
        gr.strokeRect(centerX, centerY, width, height);
    }
}
