module com.example.projet_finale {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    requires transitive javafx.graphics;
    requires java.base;
    requires com.fasterxml.jackson.databind;

    opens com.example.projet_finale to javafx.fxml;
    exports com.example.projet_finale;
}