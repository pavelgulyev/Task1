package Model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class RoundRectangle extends Shape{
    double width, height, radius;
    public RoundRectangle(Color color, double width, double height, double radius,Color ColorOutline) {
        // calling Shape constructor
        super(color, ColorOutline);
        this.width = width;
        this.height = height;
        this.radius = radius;
    }
    @Override

    double area() {
        return width*height-(Math.pow(2*radius,2)-Math.PI*Math.pow(radius,2));
    }

    @Override

    public String toString() {
        return "Rectangle color is " + super.color +  "and area is : " + area();   }

    @Override
    public void draw(GraphicsContext gr, double x, double y) {
        gr.setFill(this.color);
        gr.setLineWidth(5);
        gr.setStroke(this.ColorOutline);
        gr.fillRoundRect(150, 100, width, height, radius,radius);
        gr.strokeRoundRect(150, 100, width, height, radius,radius);
    }
}
