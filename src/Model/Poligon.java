package Model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;

public class Poligon extends Shape{
    double radius;
    double width, height;
    public Poligon(Color color, double width, double height, Color ColorOutline) {
        // calling Shape constructor
        super(color, ColorOutline);
        this.width = width;
        this.height = height;
    }

    @Override

    double area() {
        return Math.pow(radius,2)*Math.PI;
    }

    @Override

    public String toString() {
        return "Circle color is " + super.color +  "and area is : " + area();   }

    @Override
    public void draw(GraphicsContext gc, double x, double y) {
        double width2,heigh5;
        width2=width/2;
        heigh5=height/5;
        // Start the Path
        gc.setFill(this.color);
        gc.setLineWidth(5);
        gc.setStroke(this.ColorOutline);

        gc.beginPath();// Make different Paths

        gc.moveTo(10, 10);
        gc.lineTo(10, height+10);

        gc.moveTo(10, height+10);
        gc.lineTo(width+10, height+10);

        gc.moveTo(width+10, height+10);
        gc.lineTo(width+10, 10);

        gc.moveTo(width+10, 10);
        gc.lineTo(10, 10);
        for (int i=1; i<=5; i++){
            gc.moveTo(10, heigh5*i+10);
            gc.lineTo(width+10, heigh5*i+10);
        }
        for (int i=1; i<=5; i++){
            gc.moveTo(width2+10, 10);
        gc.lineTo(width2+10, heigh5*i+10);
        }


        // End the Path
        gc.stroke();
        gc.closePath();

    }
}