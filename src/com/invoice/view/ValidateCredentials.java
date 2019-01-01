package com.invoice.view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/*
 * Reusable class to alert/popup information to the user
 */
public class ValidateCredentials {

    public Scene popupDialog(Stage stage, Scene view, String title, String message) {

        StackPane stackpane = new StackPane();
        Scene scene = new Scene(stackpane, 800, 600);
        Label support = new Label(message);
        support.setTranslateX(200);
        JFXDialogLayout content = new JFXDialogLayout();
        Label header = new Label(title);
        header.setTranslateX(320);
        content.setHeading(header);
        content.setPrefSize(700, 500);
        content.setBody(support);
        JFXDialog dialog = new JFXDialog(stackpane, content, JFXDialog.DialogTransition.BOTTOM, false);

        JFXButton close = new JFXButton("Close");


        close.setOnAction(event -> {
            dialog.close();
            stage.setScene(view);
        });
        content.setActions(close);
        dialog.show();
        return scene;
    }
}
