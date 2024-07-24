import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class AppInitializer extends Application {
    public static void main (String[]args){
       launch(args);

    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        //ui open code
       // URL resource = getClass().getResource("MainForm.fxml");
        //        Parent load = FXMLLoader.load(resource);
        //        Scene scene = new Scene(load);
        //        primaryStage.setScene(scene);
        //        primaryStage.show();
        //




        primaryStage.setScene(new Scene(FXMLLoader.load( getClass().getResource("RadioButton/MainForm.fxml"))));
        primaryStage.show();


    }
}