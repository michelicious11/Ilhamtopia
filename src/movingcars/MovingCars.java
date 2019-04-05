
package movingcars;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

/**
 *
 * @author Alex
 */
public class MovingCars extends Application {
    
    int cars = 5;
    int i = 0;
    
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Scene scene = new Scene(root, 600, 600);
        for(i = 0; i< cars; i++){
        Circle cir = new Circle();
        cir.setFill(Color.BISQUE);
        cir.setRadius(30);
        cir.setLayoutX(10+Math.random()*600);
        cir.setLayoutY(10+Math.random()*600);
        root.getChildren().add(cir);
        }
        
       
        
        
       
        
        primaryStage.setTitle("Moving Cars");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
