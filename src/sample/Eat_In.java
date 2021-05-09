package sample;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import java.io.IOException;

public class Eat_In {
    public Eat_In() {

    }

    @FXML
    private Button button;
    @FXML
    private Button orderButton;
    @FXML
    private Button admin;
    @FXML
    private Button delivery;


    public void userEatIn(ActionEvent event) throws IOException {
        Main m = new Main();
        if (button.isArmed() || orderButton.isArmed()) {
            m.changeScene("AfterEat_In.fxml");
        }
        if (admin.isArmed()){
            m.changeScene("AfterAdmins.fxml");
        }
        if (delivery.isArmed()){
            m.changeScene("AfterDelivery.fxml");
        }
    }

}



