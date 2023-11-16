package com.example.gestiondepedidoshibernate;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private static Stage myStage;



    @Override
    public void start(Stage stage) throws IOException {
        myStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ventana-login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 500);
        stage.setTitle("Gestión de pedidos");
        stage.setScene(scene);
        stage.show();
    }

    public static void loadLogin(String ruta){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(ruta));
            Scene scene = new Scene(fxmlLoader.load(), 700, 500);
            myStage.setScene(scene);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void loadMain(String ruta) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(ruta));
            Scene scene = new Scene(fxmlLoader.load(), 850, 600);
            myStage.setScene(scene);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void loadFXMLDetalles(String ruta) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(ruta));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            myStage.setScene(scene);
        } catch (IOException var3) {
            var3.printStackTrace();
            throw new RuntimeException(var3);
        }
    }

    public static void main(String[] args) {
        launch();
    }
}