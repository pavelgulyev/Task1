package Controller;

import Model.Circle;
import Model.Ellipse;
import Model.Rectangle;

import Model.RoundRectangle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.*;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;

public class Controller {
    @FXML
    private Canvas Canvasic;
    @FXML
    private ColorPicker ColorShape;

    private void clear(){
        Canvasic.getGraphicsContext2D().clearRect(0, 0, Canvasic.getWidth(), Canvasic.getHeight());
    }
    Circle circle = new Circle(ColorShape.getValue(), 100);
    Ellipse ell = new Ellipse(ColorShape.getValue(), 100,50);
    Rectangle ren = new Rectangle(ColorShape.getValue(), 100,50);
    RoundRectangle roundren = new RoundRectangle(ColorShape.getValue(), 100,50, 30);
    public void onCircle(ActionEvent actionEvent) {
        clear();
        circle.draw(Canvasic.getGraphicsContext2D());
    }

    public void onEllipse(ActionEvent actionEvent) {
        clear();
        ell.draw(Canvasic.getGraphicsContext2D());
    }

    public void onRentagle(ActionEvent actionEvent) {
        clear();
        ren.draw(Canvasic.getGraphicsContext2D());
    }
    public void onRoundRent(ActionEvent actionEvent) {
        clear();
        roundren.draw(Canvasic.getGraphicsContext2D());
    }

}
