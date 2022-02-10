package Model;
import javafx.scene.canvas.*;
import  javafx.scene.paint.Color;
abstract class Shape {
    //параметры фигуры - приватные поля

    Color color;
    Color ColorOutline;
    // объявление абстрактных методов

    abstract double area();

    public abstract String toString();

    abstract void draw( GraphicsContext gr, double x, double y);

    // конструктор

    public Shape(Color color, Color ColorOutline) {

        System.out.println("Shape constructor called");
        this.ColorOutline = ColorOutline;
        this.color = color;
    }



    // реализация методов

    public void setColor(Color color, Color ColorOutline) {
        this.ColorOutline = ColorOutline;
        this.color=color;
    }
}

