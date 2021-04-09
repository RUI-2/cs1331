//I worked on the homework assignment alone, using only course materials.
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.ListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * This file contains a class StockTracker
 * @author Ruirui Ma
 * @version 1.0
 */
public class MessageBoard extends Application {
    /**
     * This method overrides start method in Application class
     * @param primaryStage The primary stage to show the message board program
     */
    @Override
    public void start(Stage primaryStage) {
        HBox gridPane = new HBox();
        VBox topPane = new VBox();
        BorderPane rootPane = new BorderPane();
        rootPane.setTop(topPane);
        rootPane.setBottom(gridPane);
        Scene scene = new Scene(rootPane, 500, 700);
        Button btn1 = new Button("Post Message");
        TextField nameField = new TextField();
        TextField messageField = new TextField();
        nameField.setPromptText("name");
        messageField.setPromptText("message");
        ObservableList<String> display = FXCollections.observableArrayList();
        ListView<String> displayList = new ListView<String>();
        displayList.setItems(display);
        displayList.setPrefHeight(500);
        btn1.setOnAction((ActionEvent e)-> {
                if (nameField.getText().length() != 0 && messageField.getText().length() != 0) {
                    String displayMessage = nameField.getText() + ": " + messageField.getText();
                    display.add(displayMessage);
                    displayList.setItems(display);
                }
            });
        topPane.setPadding(new Insets(10, 10 , 10, 10));
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setSpacing(5);
        topPane.setAlignment(Pos.TOP_LEFT);
        gridPane.setAlignment(Pos.BOTTOM_CENTER);
        gridPane.getChildren().add(nameField);
        gridPane.getChildren().add(messageField);
        gridPane.getChildren().add(btn1);
        topPane.getChildren().add(displayList);
        primaryStage.setTitle("CS 1331 Message Board");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * This main method to run the program
     * @param args The list of String input
     */
    public static void main(String[] args) {
        launch(args);
    }
}
