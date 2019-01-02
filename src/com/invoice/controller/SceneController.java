package com.invoice.controller;

import com.invoice.application.Driver;
import com.invoice.view.DatabaseEntryView;
import com.invoice.view.ReportActivityView;


public class SceneController {

    private ReportActivityView report;
    private DatabaseEntryView validate;
    private Driver Applicationdriver;

    public SceneController(ReportActivityView report, DatabaseEntryView validate, Driver applicationdriver) {
        this.report = report;
        this.validate = validate;
        this.Applicationdriver = applicationdriver;
        this.report.ClickEvent(event -> {
            applicationdriver.getStage().setScene(applicationdriver.switchScene(validate.displayEntryView()));
            applicationdriver.getStage().show();
        });

    }


}





