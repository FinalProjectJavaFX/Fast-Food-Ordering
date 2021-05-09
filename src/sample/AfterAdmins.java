package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;

public class AfterAdmins {
    @FXML
    private Button back;

    public void userBack(ActionEvent event) throws IOException {
        Main m = new Main();
        if (back.isArmed()) {
            m.changeScene("sample.fxml");
        }
    }
}