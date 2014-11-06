package view;

/* Pour rendre accessible JavaFX avec Eclipse il faut ajouter une règle d'accès !!!!!!
 * Une fois que c faitt une fois, pas besoin de le refaire en fait XD (c dans le .classPath)
 * 
 * Project > Properties > Java Build Path > Libraries > dérouler le JRE > Sélectionner Access rules
 * Cliquer sur "Edit" (à droite) > Add... > Resolution : Accessible > Rule Pattern : javafx/**  > Ok
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class FXApp extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
