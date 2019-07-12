package com.kodilla.testing.forum;


import java.util.ArrayList;
import java.util.LinkedList;

public class ForumUser {
    private String namme;
    private String realName;
    private ArrayList<ForumPost> post = new ArrayList<ForumPost>();
    private LinkedList<ForumComment> comments = new LinkedList<ForumComment>();

    public ForumUser(String namme, String realName) {
        this.namme = namme;
        this.realName = realName;
    }

    public void addPost(String author, String postBody){
        ForumPost thePost = new ForumPost(postBody, author);
        post.add(thePost);
    }

    public void addComments(ForumPost thePost, String author, String commentBody){
        ForumComment theComment = new ForumComment(thePost, commentBody, author);
        comments.add(theComment);

    }

    public int getPostQuantity(){

        return post.size();
    }

    public int getCommantsQuantity(){

        return comments.size();
    }

    public ForumPost getPost(int postNumber){
        ForumPost thePost = null;
        if (postNumber >= 0 && postNumber < post.size()){
            thePost = post.get(postNumber);
        }
        return thePost;
    }

    public ForumComment getComment(int commentNumber){
        ForumComment theComment = null;
        if (commentNumber >= 0 && commentNumber < comments.size()) {
            theComment = comments.get(commentNumber);
        }
        return theComment;
    }

    public boolean removePost(ForumPost thePost){
        boolean result = false;
        if (post.contains(thePost)){
            post.remove(thePost);
            result = true;
        }
        return result;
    }

    public boolean removeComment(ForumComment theComment){
        boolean result = false;
        if (comments.contains(theComment)){
            comments.remove(theComment);
            result = true;
        }
        return result;
    }

    public String getNamme() {
        return namme;
    }

    public String getRealName() {
        return realName;
    }
}
