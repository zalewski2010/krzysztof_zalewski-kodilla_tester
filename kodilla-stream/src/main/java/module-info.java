module com.kodilla.kodillastream {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kodilla.kodillastream to javafx.fxml;
    exports com.kodilla.kodillastream;
}