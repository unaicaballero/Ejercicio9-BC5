package org.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Label etiqueta = new Label("Escribe algo");
        TextField campoTexto = new TextField();
        Button boton = new Button("Mostrar");

        boton.setOnAction(e -> {
            etiqueta.setText(campoTexto.getText());

            // Limpiar campo
            campoTexto.clear();
        });

        VBox root = new VBox(10, etiqueta, campoTexto, boton);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 400, 200);

        stage.setTitle("Ejercicio 9");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}