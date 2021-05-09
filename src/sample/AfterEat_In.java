package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;


public class AfterEat_In {
    @FXML
    private Button back;
    @FXML
    private Button buy;
    @FXML
    private Button cake;
    @FXML
    private Button pizza;

    public void userBack(ActionEvent event)throws IOException {
        Main m = new Main();
        if (back.isArmed()) {
            m.changeScene("sample.fxml");
        }
    }
    public void userBuy(ActionEvent event)throws  IOException{
            Main m = new Main();
            if(buy.isArmed()){
                m.changeScene("AfterBuy.fxml");
            }
    }
    public void userCake(ActionEvent event)throws IOException{
        Main m = new Main();
        if(cake.isArmed()){
            m.changeScene("AfterCake.fxml");
        }
    }
    public void userPizza(ActionEvent event)throws IOException{
        Main m = new Main();
        if(pizza.isArmed()){
            m.changeScene("AfterPizza.fxml");
        }
    }
}


