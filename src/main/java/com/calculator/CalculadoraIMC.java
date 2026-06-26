package com.calculator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class CalculadoraIMC extends Application {

    @Override
    public void start(Stage stage) {
        Label labelPeso = new Label("Peso");
        Label labelAltura = new Label("Altura");

        TextField campoPeso = new TextField();
        campoPeso.setPromptText("Peso em kg");
        TextField campoAltura = new TextField();
        campoAltura.setPromptText("Altura em metros");

        Label resultado = new Label();
        Label resultado2 = new Label();

        Button botaoCalcular = new Button("Calcular IMC");
        botaoCalcular.setOnAction(e -> {
            try {
                double peso = Double.parseDouble(campoPeso.getText().replace(",", "."));
                double altura = Double.parseDouble(campoAltura.getText().replace(",", "."));

                double imc = peso / (altura * altura);
                resultado.setText(String.format("Seu IMC é: %.2f", imc));

                if (imc < 17D) {
                    resultado2.setText("Muito abaixo do peso.");
                } else if (imc <= 18.49D) {
                    resultado2.setText("Abaixo do peso.");
                } else if (imc <= 24.99D) {
                    resultado2.setText("Peso normal.");
                } else if (imc <= 29.99D) {
                    resultado2.setText("Acima do peso.");
                } else if (imc <= 34.99D) {
                    resultado2.setText("Obesidade I.");
                } else if (imc <= 39.99D) {
                    resultado2.setText("Obesidade II (Severa).");
                } else {
                    resultado2.setText("Obesidade III (Morbida).");
                }
            } catch (NumberFormatException ex) {
                resultado.setText("Por favor, insira números válidos para peso e altura.");
            }
        });

        VBox layout = new VBox(10, labelPeso, campoPeso, labelAltura, campoAltura, botaoCalcular, resultado, resultado2);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(10));

        stage.setScene(new Scene(layout, 300, 300));
        stage.setTitle("Calculadora IMC");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
