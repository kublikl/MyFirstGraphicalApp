package com.example.myfirstgraphicalapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Controls extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Font font = Font.font("Arial", FontWeight.BOLD, 16);
        Color color = Color.web("#FF5FFF");

        //Label
        Label label = new Label("My first label");
        label.setLayoutX(10);
        label.setLayoutY(35);
        //label.setFont(new Font(20));
        label.setFont(font);
        //label.setTextFill(Color.RED);
        label.setTextFill(color);
        label.setMaxWidth(50);
        label.setWrapText(true);
        label.setRotate(15);

        // ImageView
        Image image = new Image("hand.png");
        ImageView imageView = new ImageView(image);
        // label.setGraphic(imageView);
        // Label labelWithImage = new Label("label with image, imageView");
        imageView.setX(55);
        imageView.setY(22);
        imageView.setFitHeight(100);
        imageView.setFitWidth(200);
        imageView.setPreserveRatio(true);

        //Button
        Button button = new Button("My first modal button");
        button.setText("My modal button with changed text");
        button.setLayoutX(20);
        button.setLayoutY(120);
        button.setTextFill(Color.GREEN);
        //button.setGraphic(imageView);
        button.setDisable(false);
        button.setMaxWidth(500);
        button.setWrapText(true);


        // TextField
        TextField textField = new TextField();
        // textField.setText("tekst");
        textField.setPromptText("write email");
        textField.setPrefColumnCount(20);
        textField.setLayoutX(20);
        textField.setLayoutY(160);
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Catch: " + textField.getText());


                textField.getText();
            }
        });

        // PasswordField
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Write password");
        passwordField.setPrefColumnCount(20);
        passwordField.setLayoutX(20);
        passwordField.setLayoutY(200);



/////////////////////////////////////////////////////////////////////////////
        Group group = new Group();
        group.getChildren().add(label);
        group.getChildren().add(imageView);
        group.getChildren().add(textField);
        group.getChildren().add(button);
        group.getChildren().add(passwordField);

        Scene scene = new Scene(group, 800,600, Color.WHITE);


        primaryStage.setScene(scene);
        primaryStage.setTitle("Application controls");
        primaryStage.show();


    }
}
