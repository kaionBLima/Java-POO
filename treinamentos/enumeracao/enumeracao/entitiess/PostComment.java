package entitiess;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostComment {

    //private static serve para que não tenha uma copia do objeto sdf para cada Post da aplicação
    //Esse SimpleDateFormat servirá para o toString no texto de data e hora
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private List<CommentPost> comments = new ArrayList<>();

    public PostComment() {
    }

    public PostComment(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<CommentPost> getComments() {
        return comments;
    }
    // Em uma lista não pode ter o método "Set", pois nesse metodo a lista recebe outra lista e há uma troca na lista, não pode ter

    public void addComment(CommentPost comment) {
        comments.add(comment);
    }

    public void removeComment(CommentPost comment) {
        comments.remove(comment);
    }

    /* StringBuilder é uma classe que permite criar e modificar strings de forma eficiente. Ele é utilizado quando se pretende alterar uma cadeia de caracteres sem criar um novo objeto.
     O StringBuilder é útil quando se precisa concatenar várias cadeias de caracteres em um loop, pois evita o desperdício de memória*/
    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments:\n");
        for (CommentPost c: comments) { //Para cada CommentPost c na lista de comentarios do post eu vou mandar esse comentario c para o StringBuilder
            sb.append(c.getText() + "\n");
        }
        return sb.toString();
    }

}
