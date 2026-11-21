module pagina_inicial {
    requires javafx.controls;
    requires javafx.fxml;

    opens pagina_inicial to javafx.fxml;
    exports pagina_inicial;
}
