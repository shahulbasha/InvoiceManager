package com.invoice.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class DefaultActivityView {

    private Button showReports;
    private Button createEntry;

    public Parent createContent() {
        Label welcomeUser = new Label("Welcome To Invoice Management");
        welcomeUser.setTranslateY(20);
        welcomeUser.setTranslateX(200);
        showReports = new Button("Reports");
        createEntry = new Button("New Entry");
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(20));
        hbox.getChildren().addAll(showReports, createEntry);
        BorderPane borderpane = new BorderPane();
        borderpane.setTop(welcomeUser);
        borderpane.setCenter(hbox);
        return borderpane;

    }

    /**
     * @param eventHandler Use this method to access our buttons from the controller class
     *                     separate the logic from the view for maintainability.
     *                     in the controller class implement these methods to
     *                     perform a an action.
     */
    public void reportHandler(EventHandler<ActionEvent> eventHandler) {
        showReports.setOnAction(eventHandler);

    }

    public void entryHandler(EventHandler<ActionEvent> eventHandler) {
        createEntry.setOnAction(eventHandler);

    }


}
