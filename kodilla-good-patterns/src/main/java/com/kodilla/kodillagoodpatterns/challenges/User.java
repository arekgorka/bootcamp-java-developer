package com.kodilla.kodillagoodpatterns.challenges;

public class User {

    private String name;
    private String nick;
    private String mail;

    public User(final String name,final String nick,final String mail) {
        this.name = name;
        this.nick = nick;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public String getNick() {
        return nick;
    }

    public String getMail() {
        return mail;
    }
}
