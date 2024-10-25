package org.oop.model;

public class Comment {
    private long art_Id;
    private String comment;

    public Comment(long art_Id, String comment) {
        this.art_Id = art_Id;
        this.comment = comment;
    }

    public long getArt_Id() {
        return art_Id;
    }

    public void setArt_Id(long art_Id) {
        this.art_Id = art_Id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
