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
    public void draw(GraphicsContext gc) {
        // Start the Path
        gc.setFill(this.color);
        gc.setLineWidth(5);
        gc.setStroke(this.ColorOutline);
        gc.beginPath();
        // Make different Paths

        gc.moveTo(10, 10);
        gc.lineTo(10, height+10);

        gc.moveTo(10, height+10);
        gc.lineTo(width+10, height+10);

        gc.moveTo(width+10, height+10);
        gc.lineTo(width+10, 10);

        gc.moveTo(width+10, 10);
        gc.lineTo(10, 10);


       /* for (int i=0; i<6; i++){
            for(int j=0;j<height; )
            gc.moveTo(10, h1_5*i);
            gc.lineTo(10, h1_5*i);
//            if(i%2==0){
//                gc.moveTo(10, h1_5*i);
//                gc.lineTo(10, h1_5*i);
//            }
//            else{
//                gc.moveTo(10, h1_5*i);
//                gc.lineTo(10, h1_5*i);
//            }*/

    }
}