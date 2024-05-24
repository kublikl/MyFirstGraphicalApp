package com.example.myfirstgraphicalapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GraphicalApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Stage -> Scene -> StackPane Text
        primaryStage.show();
        Text text = new Text("Text from first graphical application");

        StackPane stackPane = new StackPane(); // root
        stackPane.getChildren().add(text);

        Scene scene = new Scene(stackPane);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
