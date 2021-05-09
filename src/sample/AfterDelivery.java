package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AfterDelivery {
    @FXML
    private Button back;
    @FXML
    private Button button;

    public void userBack(ActionEvent event) throws IOException {
        Main m = new Main();
        if (back.isArmed() || button.isArmed()) {
            m.changeScene("sample.fxml");
        }


    }
}
