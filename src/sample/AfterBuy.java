package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

import java.io.IOException;


public class AfterBuy {
    @FXML
    private Button back;
    @FXML
    private RadioButton button;
    @FXML
    private Label label;
    @FXML
    private RadioButton twoButton;
    @FXML
    private RadioButton threeButton;


    public void userBack(ActionEvent event) throws IOException {
        Main m = new Main();
        if (back.isArmed()) {
            m.changeScene("AfterEat_In.fxml");
        }
        else if(button.isSelected()){
            label.setText("$19");
        }
        else if(twoButton.isSelected()){
            label.setText("$38");
        }
        else if(threeButton.isSelected()){
            label.setText("$57");
        }
        else{
            label.setText("amount!");
        }
    }
}

