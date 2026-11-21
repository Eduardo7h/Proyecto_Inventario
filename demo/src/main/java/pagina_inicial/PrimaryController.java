package pagina_inicial;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

// Acciones de los elementos 
public class PrimaryController {

    @FXML
    private AnchorPane AnchorPane;
    @FXML
    private Button bHistorial;
    @FXML
    private ComboBox<String> Selec_usuario;
    @FXML
    private ComboBox<String> Selec_pago;
    @FXML
    private TableView<?> Tabla_Ticket;
    @FXML
    private TableView<?> Tabla_UltimasVentas;
    @FXML
    private Button bFinalizar;
    @FXML
    private Button bInventario;
    @FXML
    private Button bLimpiarDatos;
    @FXML
    private Button bModificarP;
    @FXML
    private Button bNameApp;

    @FXML
    private void initialize() {
        // Agregamos opciones
        Selec_usuario.getItems().addAll("Administrador", "Vendedor", "Root");
        Selec_pago.getItems().addAll("Pagado", "Pendiente");
    }

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

}
