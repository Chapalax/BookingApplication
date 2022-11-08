module com.main.bookingapplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires json.simple;
    requires lombok;
    requires org.jetbrains.annotations;
    requires com.google.gson;

    opens com.main.bookingapplication to javafx.fxml;
    exports com.main.bookingapplication;
    exports controllers;
    opens controllers to javafx.fxml;
}