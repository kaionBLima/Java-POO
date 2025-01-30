package application;

import entitiess.CommentPost;
import entitiess.PostComment;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ProgramComment {

    public static void main (String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        CommentPost c1 = new CommentPost("Have a nice trip!");
        CommentPost c2 = new CommentPost("Wow that's awesome!");

        PostComment p1 = new PostComment(sdf.parse("21/06/2018 13:05:44"),
                                                "Traveling to New Zealand",
                                                "I'm going to visit this wonderful country!",
                                                 12);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);
    }
}
