module pagina_inicial {
    requires javafx.controls;
    requires javafx.fxml;

    opens infrastructure.pagina_inicial to javafx.fxml;
    exports infrastructure.pagina_inicial;
}
