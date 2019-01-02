package com.invoice.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/*

 * Entry view where the customer  will be able to create a new entry for selected services
 * once the entry is filed and validated  the data is then
 *persist to the database
 * compose jaser report
 *
 * -->needs to implement the services that will be applicable to finish this scene.
 */
public class DatabaseEntryView {
    private TextField customerName;
    private TextField customerID;
    private TextField customerEmail;
    private Button submit;

    public Parent displayEntryView() {
        BorderPane root = new BorderPane();
        root.setPrefSize(600, 400);
        VBox vbox = new VBox(20);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(20));
        customerName = new TextField();
        customerName.setPromptText("Customer Name");
        customerName.setMaxWidth(300);
        customerID = new TextField();
        customerID.setPromptText("Customer ID");
        customerID.setMaxWidth(300);
        customerEmail = new TextField();
        customerEmail.setPromptText("Customer Email");
        customerEmail.setMaxWidth((300));
        submit = new Button("Submit Entry");

        vbox.getChildren().addAll(new Label("Create New Entry"), customerName, customerID, customerEmail, submit);
        root.setTop(vbox);
        return root;
    }

    public String customerName() {
        return customerName.getText();

    }

    public String customerEmail() {
        return customerEmail.getText();

    }

    public String customerId() {
        return customerID.getText();

    }

    public void entryHandler(EventHandler<ActionEvent> eventHandler) {
    	//shahul
    	//first validate the customer details using regex as soon as submit button is clicked
    	//set customer info from UI to customer model
    	//pass it to customer Info persist DAO method
    	//If you receive response 1 from that method show successfully saved dialog
    	//try to simulate the DB response if you face some issue
        submit.setOnAction(eventHandler);

    }

}
