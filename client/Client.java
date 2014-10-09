/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcrypt.client;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Mayank Aggarwal
 */
public class Client extends Application {

    private static final Client client = new Client();

    public Client() {

    }

    public static Client getClient() {
        return client;
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        ClientLoginPage loginPage = ClientLoginPage.getCLientLoginPage();
        Scene scene = loginPage.setClientLoginPage();
        primaryStage.setTitle("MCrypt Secure Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
