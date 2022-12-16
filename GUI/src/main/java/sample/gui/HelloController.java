package sample.gui;

import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;



public class HelloController {
    String path = "C:\\Users\\BDLIT-2\\Desktop\\RPGame\\GUI\\src\\main\\resources\\Nom Nom Nom Sound Effect But It Gets Slower Each Time.mp3";

    @FXML
    private Label title;

    @FXML
    private ImageView bckroudImage;

    @FXML
    void btnNewgameClicked(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("second-window.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();


        } catch (Exception e){
            System.out.print("page didnt load");
        }



    }

    Stage stage;
    @FXML
    private AnchorPane scenePane;
    @FXML
    private Button exitButton;
    @FXML
    void btnExitClicked(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("alert");
        alert.setHeaderText("you're about to leave");
        alert.setContentText("You're sure you eant to leave?");

        if(alert.showAndWait().get() == ButtonType.OK){
            stage = (Stage)scenePane.getScene().getWindow();
            stage.close();
        }

    }



    @FXML
    private Button rotate;



    @FXML
    void btnAnimationOnclicked(ActionEvent event) {
        setRotate(c1,true,360,10);
        setRotate(c2,true,180,18);
        setRotate(c3,true,145,24);

    }
    @FXML
    private Circle c1;

    @FXML
    private Circle c2;

    @FXML
    private Circle c3;

    private void setRotate (Circle c, boolean rotate,int angle,int duration){
        RotateTransition rt = new RotateTransition(Duration.seconds(duration),c);
        rt.setByAngle(angle);
        rt.setDelay(Duration.seconds(0));
        rt.setRate(3);
        rt.setCycleCount(10);
        rt.play();
    }


}
