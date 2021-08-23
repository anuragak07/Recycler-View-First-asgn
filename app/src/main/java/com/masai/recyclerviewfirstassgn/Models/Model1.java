package com.masai.recyclerviewfirstassgn.Models;

public class Model1 {
    private int Image;
    private String Title;
    private String ArticleDetails;

    public Model1(int image, String title, String articleDetails) {
        this.Image = image;
        this.Title = title;
        this.ArticleDetails = articleDetails;
    }



    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        this.Image = image;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getArticleDetails() {
        return ArticleDetails;
    }

    public void setArticleDetails(String articleDetails) {
        this.ArticleDetails = articleDetails;
    }
}
