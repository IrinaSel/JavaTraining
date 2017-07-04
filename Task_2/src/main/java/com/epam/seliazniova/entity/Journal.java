package com.epam.seliazniova.entity;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 * Created by Iryna_Seliazniova on 6/27/2017.
 */
public class Journal extends AbstractPublication {
    private String editor;
    private GregorianCalendar issueDate;
    private String topic;

    public String getEditor() {
        return editor;
    }

    public GregorianCalendar getIssueDate() {
        return issueDate;
    }

    public String getTopic() {
        return topic;
    }

    public Journal() {
    }

    public Journal(String editor, GregorianCalendar issueDate, String topic) {
        this.editor = editor;
        this.issueDate = issueDate;
        this.topic = topic;
    }

    public Journal(String publisher, String publicationTitle, int numberOfPages, String editor, GregorianCalendar issueDate, String topic) {
        super(publisher, publicationTitle, numberOfPages);
        this.editor = editor;
        this.issueDate = issueDate;
        this.topic = topic;
    }

    @Override
    public boolean equals(Object obj){
        if (obj==this){
            return true;
        }
        if (obj==null || !(obj instanceof Journal)){
            return false;
        }
        Journal journal = (Journal) obj;
        return (editor.equals(journal.editor)
                && issueDate==journal.issueDate
                && topic.equals(journal.topic));
    }

    public int hashCode() {
        return Objects.hash(editor,issueDate,topic);
    }

    @Override
    public String toString() {
        return "Journal{" +
                "editor='" + editor + '\'' +
                ", issueDate=" + issueDate +
                ", topic='" + topic + '\'' +
                "} " + super.toString();
    }
}
