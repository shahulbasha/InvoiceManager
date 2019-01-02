package com.invoice.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 * This class will represent our report scene
 * when the user clicks the report button
 * from the default(initial screen) they will be taken here.
 */
public class ReportActivityView {
    private DatePicker datepicker;
    private TextField fetchInvoice;
    private Button fetchFromDB = new Button("Fetch Invoice");

    public Parent createReportContent() {
        BorderPane pane = new BorderPane();
        VBox root = new VBox(20);
        datepicker = new DatePicker();
        fetchInvoice = new TextField();

        fetchInvoice.setMaxWidth(200);
        fetchInvoice.setPromptText("Enter Invoice Number.");
        root.setPrefSize(600, 400);
        root.setPadding(new Insets(25));
        root.setAlignment(Pos.TOP_CENTER);
        root.getChildren().addAll(new Label("To view your invoice please select a date below and \n\tprovide an invoice number to continue."), datepicker, fetchInvoice, fetchFromDB);
        pane.setCenter(root);
        return pane;
    }

    public LocalDate getDate() {
        LocalDate localDate = datepicker.getValue();
        /*
         * the code below is for different timezones
         */
        Instant instant = Instant.from(localDate.atStartOfDay(ZoneId.systemDefault()));
        Date date = Date.from(instant);

        return localDate;

    }

    public String getInovice() {

        return fetchInvoice.getText();

    }


    public void ClickEvent(EventHandler<ActionEvent> eventhandler) {
    	//on click need to navigate back to home screen . the report will be fetched and displayed separately
        fetchFromDB.setOnAction(eventhandler);
    }
}
