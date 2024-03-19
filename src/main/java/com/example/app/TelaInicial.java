package com.example.app;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TelaInicial extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("OpenSSL GUI");

        // Criar um painel de grade
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setVgap(10);
        grid.setHgap(10);

        // Botões para as funcionalidades
        Button cifrarButton = new Button("Cifrar()() Ficheiros");
        Button gerarSenhaButton = new Button("Gerar Senha Aleatória");
        Button calcularHashButton = new Button("Calcular Hash");
        Button calcularHMACButton = new Button("Calcular HMAC");
        Button gerarChavesRSAButton = new Button("Gerar Chaves RSA");
        Button calcularAssinaturaButton = new Button("Calcular Assinatura");

        // Adicionar os botões ao painel de grade
        grid.add(cifrarButton, 0, 0);
        grid.add(gerarSenhaButton, 1, 0);
        grid.add(calcularHashButton, 0, 1);
        grid.add(calcularHMACButton, 1, 1);
        grid.add(gerarChavesRSAButton, 0, 2);
        grid.add(calcularAssinaturaButton, 1, 2);

        // Adicionar ação aos botões (ainda não implementados)
        cifrarButton.setOnAction(e -> {
            // Ação quando o botão de cifrar for clicado
            // Implemente isso posteriormente
        });
        // Implemente a ação para os demais botões de funcionalidade da mesma forma

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
