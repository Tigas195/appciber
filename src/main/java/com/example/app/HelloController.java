package com.example.app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField inputFileField;

    @FXML
    private TextField outputFileField;

    @FXML
    private TextField keyField;

    @FXML
    private TextField algorithmField;

    @FXML
    private TextField Telainicial;

    @FXML
    void cifrar(ActionEvent event) {
        String inputFile = inputFileField.getText();
        String outputFile = outputFileField.getText();
        String key = keyField.getText();
        String algorithm = algorithmField.getText();

        // Verificar se os campos obrigatórios foram preenchidos
        if (inputFile.isEmpty() || outputFile.isEmpty() || key.isEmpty() || algorithm.isEmpty()) {
            exibirAlerta("Erro", "Todos os campos são obrigatórios.");
            return;
        }

        // Executar o comando openssl para cifrar o ficheiro
        String command = "openssl enc -" + algorithm + " -in " + inputFile + " -out " + outputFile + " -k " + key;
        // Executar o comando...
        // Você pode usar ProcessBuilder ou Runtime.getRuntime().exec() para executar comandos no sistema.

        exibirAlerta("Sucesso", "O ficheiro foi cifrado com sucesso.");
    }

    private void exibirAlerta(String titulo, String mensagem) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }
}
