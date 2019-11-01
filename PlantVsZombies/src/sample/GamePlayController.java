package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class GamePlayController {
    @FXML
    private AnchorPane GamePlayRoot;

    @FXML
    private ImageView peaShooterBuy;

    @FXML
    private ImageView repeaterBuy;

    @FXML
    private ImageView cherryBombBuy;

    @FXML
    private ImageView jalapenoBuy;

    @FXML
    private ImageView wallnutBuy;

    @FXML
    private ImageView sunBuy;

    @FXML
    private ImageView lawnMower1;

    @FXML
    private ImageView lawnMower2;

    @FXML
    private ImageView lawnMower3;

    @FXML
    private ImageView lawnMower4;

    @FXML
    private ImageView lawnMower5;

    @FXML
    private Label sunCountLabel;

    @FXML
    private ImageView GameMenuLoaderButton;

    @FXML
    private ProgressBar progressBar;

    @FXML
    void loadGameMenu(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GameMenu.fxml"));
        Parent gameMenu = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(gameMenu));
        GameMenuController controller =
                fxmlLoader.<GameMenuController>getController();
        controller.initData(GamePlayRoot);
        stage.show();
    }

}
