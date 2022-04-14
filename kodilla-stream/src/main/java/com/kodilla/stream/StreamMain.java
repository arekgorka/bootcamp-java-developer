package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.person.People;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum theForum = new Forum();
        Map<Integer,ForumUser> resultMapOfForumUsers = theForum.getUserList().stream()
                .filter(user -> user.getSex()=='M')
                .filter(user -> user.getDateOfBirth().getYear() <= (LocalDate.now().getYear()-20))
                .filter(user -> user.getPublishedPosts()>0)
                .collect(Collectors.toMap(ForumUser::getSiganture, user -> user));

        System.out.println("Result list with " + resultMapOfForumUsers.size() + " users: ");
        resultMapOfForumUsers.entrySet().stream()
                .map(entry -> "User siganture:" + entry.getKey() + "(" + entry.getValue() + ").")
                .forEach(System.out::println);

        /*BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication()>2005)
                .map(Book::toString)
                .collect(Collectors.joining(",","<<",">>"));

        System.out.println(theResultStringOfBooks);*/

        /*BookDirectory theBookDirectory = new BookDirectory();
        Map<String, Book> theResultMapOFBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication()>2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOFBooks.size());
        theResultMapOFBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);*/

        /*BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOFBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication()>2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOFBooks.size());
        theResultListOFBooks.stream()
                .forEach(System.out::println);*/

        /*People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length()>11)
                .map(s -> s.substring(0, s.indexOf(' ')+2) + ".")
                .filter(s -> s.substring(0,1).equals("M"))
                .forEach(System.out::println);*/
    }


}
