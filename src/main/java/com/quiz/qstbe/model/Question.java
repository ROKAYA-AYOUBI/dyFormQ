package com.quiz.qstbe.model;


import lombok.Data;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
public class Question {

    private String id;

    private String label;

    private String type;

    private String value;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


}
