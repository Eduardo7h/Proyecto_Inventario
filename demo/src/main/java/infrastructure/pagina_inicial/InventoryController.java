package infrastructure.pagina_inicial;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class InventoryController {
    @FXML
    private Button bHistorial;
    @FXML
    private ComboBox<String> Selec_usuario;
    @FXML
    private Button bInventario;
    @FXML
    private Button bModificarP;
    @FXML
    private Button bNameApp;

    @FXML
    private void switchmain() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    private void switchInventory() throws IOException {
        App.setRoot("Inventory");
    }

    @FXML
    private void switchHystory() throws IOException {
        App.setRoot("History");

    }

    @FXML
    private void switchPrice() throws IOException {
        App.setRoot("Price");
    }

    @FXML
    private void initialize() {
        // Hint: initialize() will be called when the associated FXML has been
        // completely loaded.
        Selec_usuario.getItems().addAll("Administrador", "Vendedor", "Root");
        bInventario.getStyleClass().add("boton-activo");
    }
}
