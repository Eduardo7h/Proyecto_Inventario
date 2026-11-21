package pagina_inicial;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    /*
     * Creamos una variable de tipo Scene
     * que sera la representacion del
     * contenido visual, actualmente
     * su valor es null
     */
    private static Scene scene;

    // Metodo heredado de Appliation
    @Override
    public void start(Stage stage) throws IOException {
        // Se crea la instancia de scene
        scene = new Scene(loadFXML("primary"), 1280, 650);
        // Agregamos la hoja de estilos de la vista inicial.
        scene.getStylesheets().add(getClass().getResource("style_Primary.css").toExternalForm());
        // agregamos al escenario
        stage.setScene(scene);
        // mostramos la ventana
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));

        String stylesheet;
        switch (fxml) {
            case "Inventory":
                stylesheet = "style_Inventory.css";
                break;
            case "History":
                stylesheet = "style_History.css";
                break;
            case "Price":
                stylesheet = "style_Price.css";
                break;
            default:
                stylesheet = "style_Primary.css";
                break;
        }

        scene.getStylesheets().setAll(
                App.class.getResource(stylesheet).toExternalForm());
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        /*
         * El metodo launch llama al metodo
         * start
         */
        launch();
    }

}
