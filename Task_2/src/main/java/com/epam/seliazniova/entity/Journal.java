package com.epam.seliazniova.entity;

import java.util.Date;

/**
 * Created by Iryna_Seliazniova on 6/27/2017.
 */
public class Journal extends AbstractPublication {
    private String editor;
    private Date issueDate; //javatime, timestamp, grigorian calendar
    private String topic;

    public String getEditor() {
        return editor;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public String getTopic() {
        return topic;
    }

    public Journal() {
    }

    public Journal(String editor, Date issueDate, String topic) {
        this.editor = editor;
        this.issueDate = issueDate;
        this.topic = topic;
    }

    public Journal(String publisher, String publicationTitle, int numberOfPages, String editor, Date issueDate, String topic) {
        super(publisher, publicationTitle, numberOfPages);
        this.editor = editor;
        this.issueDate = issueDate;
        this.topic = topic;
    }
}
