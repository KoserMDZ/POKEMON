module com.sample.poke {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sample.poke to javafx.fxml;
    exports com.sample.poke;
}