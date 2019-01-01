package com.invoice.application;

import com.invoice.controller.SceneController;
import com.invoice.view.DatabaseEntryView;
import com.invoice.view.DefaultActivityView;
import com.invoice.view.ReportActivityView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Driver extends Application {

    private Stage stage;
    private Scene defaultView;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        DefaultActivityView mainActivity = new DefaultActivityView();
        ReportActivityView reportActivityView = new ReportActivityView();
        DatabaseEntryView entryView = new DatabaseEntryView();

        SceneController controller = new SceneController(reportActivityView, entryView);
        Stage stage = new Stage();
        stage.setTitle("Invoice Management");
        stage.setResizable(false);
        stage.initStyle(StageStyle.UTILITY);
        defaultView = new Scene(reportActivityView.createReportContent(), 600, 400);
        stage.setScene(defaultView);
        stage.show();


    }
}
