module com.example.savingscalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.savingscalculator to javafx.fxml;
    exports com.example.savingscalculator;
}