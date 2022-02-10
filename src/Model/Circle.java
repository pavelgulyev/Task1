package Model;
import javafx.scene.canvas.*;
import  javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

public class Circle extends Shape{
    double radius;
    public Circle(Color color,double radius,Color ColorOutline) {
        // calling Shape constructor
        super(color,ColorOutline);
        this.radius = radius;
    }

    @Override

    double area() {
        return Math.pow(radius,2)*Math.PI;
    }

    @Override

    public String toString() {
        return "Circle color is " + super.color +  "and area is : " + area();   }

    @Override
    public void draw(GraphicsContext gr, double x, double y) {
        double centerX = x-radius/2;
        double centerY = y-radius/2;
        gr.setFill(this.color);
        gr.setLineWidth(5);
        gr.setStroke(this.ColorOutline);
        gr.fillOval(centerX, centerY, radius, radius);
        gr.strokeOval(centerX, centerY, radius, radius);
    }

}

