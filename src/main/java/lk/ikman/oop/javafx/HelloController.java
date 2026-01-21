package lk.ikman.oop.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {


    public TextField txtField01;
    public Label lbl01;

    public void printName(ActionEvent actionEvent) {
        String name=txtField01.getText();

        lbl01.setText("hello"+name);
    }
}