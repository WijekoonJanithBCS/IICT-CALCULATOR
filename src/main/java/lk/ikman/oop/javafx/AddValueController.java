package lk.ikman.oop.javafx;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AddValueController {

    public TextField txt01;
    public TextField txt02;
    public Label result;

    public void add(ActionEvent actionEvent) {
        int num01= Integer.parseInt(txt01.getText());
        int num02= Integer.parseInt(txt02.getText());

        int res=num01+num02;
        result.setText(String.valueOf(res));
    }
}
