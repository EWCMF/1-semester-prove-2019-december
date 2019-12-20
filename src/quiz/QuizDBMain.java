package quiz;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class QuizDBMain extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Stage window = primaryStage;

        Parent root = FXMLLoader.load(getClass().getResource("QuizGUI.fxml"));
        window.setTitle("Quiz");
        Scene scene = new Scene(root, 640,400);
        window.setScene(scene);
        window.setResizable(false);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
