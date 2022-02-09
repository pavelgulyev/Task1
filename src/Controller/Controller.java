package Controller;
import Model.*;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.*;
import javafx.scene.control.ColorPicker;

import javafx.scene.input.MouseEvent;

public class Controller {
    @FXML
    private Canvas Canvasic;
    @FXML
    private ColorPicker ColorShape;
    @FXML
    private ColorPicker ColorOutline;

    private void clear(){
        Canvasic.getGraphicsContext2D().clearRect(0, 0, Canvasic.getWidth(), Canvasic.getHeight());
    }
    public void onCircle(ActionEvent actionEvent) {
        Circle circle = new Circle(ColorShape.getValue(), 100, ColorOutline.getValue());
        clear();
        circle.draw(Canvasic.getGraphicsContext2D());
    }

    public void onEllipse(ActionEvent actionEvent) {
        Ellipse ell = new Ellipse(ColorShape.getValue(), 100,50, ColorOutline.getValue());
        clear();
        ell.draw(Canvasic.getGraphicsContext2D());
    }

    public void onRentagle(ActionEvent actionEvent) {
        Rectangle ren = new Rectangle(ColorShape.getValue(), 100,50, ColorOutline.getValue());
        clear();
        ren.draw(Canvasic.getGraphicsContext2D());
    }
    public void onRoundRent(ActionEvent actionEvent) {
        RoundRectangle roundren = new RoundRectangle(ColorShape.getValue(), 100,50, 30, ColorOutline.getValue());
        clear();
        roundren.draw(Canvasic.getGraphicsContext2D());
    }

    public void onSquare(ActionEvent actionEvent) {
        /*Square square = new Square(ColorShape.getValue(), 100, ColorOutline.getValue());*/
        Poligon poligon = new Poligon(ColorShape.getValue(), 100,200, ColorOutline.getValue());
        clear();
        poligon.draw(Canvasic.getGraphicsContext2D());
        /*square.draw(Canvasic.getGraphicsContext2D());*/
    }

}
