module com.example.sosfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;

    opens com.example.sosfx to javafx.fxml;
    exports com.example.sosfx;
    exports com.ryanbyers.sosfx to javafx.graphics;
}