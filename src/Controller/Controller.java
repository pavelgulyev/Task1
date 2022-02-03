package Controller;

import Model.Circle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.canvas.*;
import javafx.scene.paint.Color;

public class Controller {
    @FXML
    private Canvas Canvasic;

    Circle circle = new Circle(Color.RED, 100);

    public void onCircle(ActionEvent actionEvent) {
        circle.draw(Canvasic.getGraphicsContext2D());


    }
}
