package Model;
import javafx.scene.canvas.*;
import  javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

public class Circle extends Shape{
    double radius;
    public Circle(Color color,double radius) {
        // calling Shape constructor
        super(color);
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
    public void draw(GraphicsContext gr) {
        gr.setFill(this.color);
        gr.setLineWidth(5);
        gr.fillOval(0, 0, radius, radius);
    }

}

