package Model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Ellipse extends Shape{
    double semiMajorShaftLength, semiMinorLength;

    public Ellipse(Color color, double semiMajorShaftLength, double semiMinorLength,Color ColorOutline) {
        // calling Shape constructor
        super(color, ColorOutline);
        this.semiMajorShaftLength = semiMajorShaftLength;
        this.semiMinorLength = semiMinorLength;
    }
    @Override

    double area() {
        return Math.PI*semiMajorShaftLength*semiMinorLength;
    }

    @Override

    public String toString() {

        return "Ellipse color is " + super.color +  "and area is : " + area();   }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(this.color);
        gr.setLineWidth(5);
        gr.setStroke(this.ColorOutline);
        gr.fillOval(200, 100, semiMajorShaftLength, semiMinorLength);
        gr.strokeOval(200, 100, semiMajorShaftLength, semiMinorLength);
    }
}
