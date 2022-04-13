package com.kodilla.testing.forum.statistics;

public class Post {

    private String textPost;

    public Post(String text) {
        this.textPost = textPost;
    }

    public String getText() {
        return textPost;
    }

    public void setText(String textPost) {
        this.textPost = textPost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Post post = (Post) o;

        return textPost.equals(post.textPost);
    }

    @Override
    public int hashCode() {
        return textPost.hashCode() * 31;
    }
}
