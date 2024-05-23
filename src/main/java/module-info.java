module com.example.myfirstgraphicalapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.myfirstgraphicalapp to javafx.fxml;
    exports com.example.myfirstgraphicalapp;
}