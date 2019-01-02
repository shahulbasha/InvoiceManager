package com.invoice.application;

import com.invoice.controller.SceneController;
import com.invoice.view.DatabaseEntryView;
import com.invoice.view.DefaultActivityView;
import com.invoice.view.ReportActivityView;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Driver extends Application {

    private Stage stage = new Stage();
    private Scene defaultView;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        DefaultActivityView mainActivity = new DefaultActivityView();
        ReportActivityView reportActivityView = new ReportActivityView();
        DatabaseEntryView entryView = new DatabaseEntryView();
        SceneController controller = new SceneController(reportActivityView,entryView,this);

        stage.setTitle("Invoice Management");
        stage.setResizable(false);
        stage.initStyle(StageStyle.UTILITY);
        defaultView = new Scene(reportActivityView.createReportContent(), 600, 400);
        stage.setScene(defaultView);
        stage.show();


    }



    public Scene switchScene(Parent parent){
        return new Scene(parent,600,400);
    }

    public Stage getStage(){
        return stage;
    }

}
