package com.example.coursjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage Primarystage) throws IOException {
        Primarystage.setTitle("Matières");
        BorderPane borderPane = new BorderPane() ;
        Scene scene = new Scene(borderPane,800,600) ;
        Primarystage.setScene(scene);
        HBox hBox = new HBox() ;
        hBox.setPadding(new Insets(10));
        hBox.setSpacing(10);
        Label label=new Label("Nom de la matière : ") ;
        TextField textField = new TextField() ;
        Button buttonAdd=new Button("Ajouter ") ;
        Button buttonSup=new Button("Supprimer ") ;
        hBox.getChildren().addAll(label,textField,buttonAdd , buttonSup) ;


        VBox vbox=new VBox() ;
        vbox.setPadding(new Insets(10));
        ListView<String> listView = new ListView<>() ;
        listView.getItems().addAll("LINUX", "probabilité" ," jee") ;

        vbox.getChildren().add(listView) ;
        borderPane.setCenter(vbox);
        borderPane.setTop(hBox);
        Primarystage.show();
        buttonAdd.setOnAction((event)->
        {
            String name = textField.getText();
            listView.getItems().add(name) ;
        });
buttonSup.setOnAction((event)->
{

});
        Primarystage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}