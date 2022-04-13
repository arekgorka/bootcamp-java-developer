package com.kodilla.testing.forum.statistics;

public class Comment {

    private String textComment;

    public Comment(String textComment) {
        this.textComment = textComment;
    }

    public String getTextComment() {
        return textComment;
    }

    public void setTextComment(String textComment) {
        this.textComment = textComment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comment comment = (Comment) o;

        return textComment.equals(comment.textComment);
    }

    @Override
    public int hashCode() {
        return textComment.hashCode() * 31;
    }
}
