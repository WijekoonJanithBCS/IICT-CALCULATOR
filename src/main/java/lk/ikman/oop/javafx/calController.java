package lk.ikman.oop.javafx;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class calController {
    public TextField txt01;
    public TextField txt02;
    public Label result;
    public String calculation;

    public void devide(ActionEvent actionEvent) {
        calculation="division";
    }

    public void add(ActionEvent actionEvent) {
        calculation="add";
    }

    public void multiply(ActionEvent actionEvent) {
        calculation="multiply";
    }

    public void substract(ActionEvent actionEvent) {
        calculation="substract";
    }

    public void btnEqual(ActionEvent actionEvent) {
        int num01= Integer.parseInt(txt01.getText());
        int num02= Integer.parseInt(txt02.getText());

        switch(calculation){
            case "add" :result.setText(String.valueOf(num01+num02));break;
            case "division" :result.setText(String.valueOf(num01/num02));break;
            case "multiplication" :result.setText(String.valueOf(num01*num02));break;
            case "substract" :result.setText(String.valueOf(num01-num02));break;
        }
    }
}
