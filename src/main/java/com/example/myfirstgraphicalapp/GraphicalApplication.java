package com.example.myfirstgraphicalapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class GraphicalApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Stage -> Scene -> StackPane -> Text
        primaryStage.show();

        // Controls
        Text text = new Text("Text from first graphical application");
        Button button = new Button("My fisrt button");
        Text text2 = new Text("Second text");

        // root
        // StackPane root = new StackPane();
        // HBox root = new HBox();
        VBox root = new VBox();
        root.getChildren().add(text);
        root.getChildren().add(button);
        root.getChildren().add(text2);

        // scene
        Scene scene = new Scene(root);

        // stage

        primaryStage.setScene(scene);
        primaryStage.setTitle("My App");

        primaryStage.setX(2500);
        primaryStage.setY(300);

        primaryStage.setWidth(800);
        primaryStage.setHeight(600);

        //primaryStage.initStyle(StageStyle.DECORATED);
        //primaryStage.initStyle(StageStyle.UNDECORATED);
        //primaryStage.initStyle(StageStyle.UTILITY);

        primaryStage.show();
    }
}
