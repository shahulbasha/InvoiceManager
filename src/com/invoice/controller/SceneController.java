package com.invoice.controller;

import com.invoice.view.DatabaseEntryView;
import com.invoice.view.ReportActivityView;


public class SceneController {

    private ReportActivityView report;
    private DatabaseEntryView validate;

    public SceneController(ReportActivityView report, DatabaseEntryView validate) {

        this.report = report;
        this.validate = validate;

        this.report.ClickEvent(event -> {
            System.out.println("hello");

        });

    }


}





