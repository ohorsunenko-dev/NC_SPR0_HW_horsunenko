package com.horsunenko.model;


public class Info {
    protected int id;
    protected String lastName;
    protected String firstName;
    protected String comment_text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCommentText() {
        return comment_text;
    }

    public void setCommentText(String comment_text) {
        this.comment_text = comment_text;
    }
}
