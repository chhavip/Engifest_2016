package com.dtu.engifest.models;

/**
 * Created by chhavi on 28/1/16.
 */
public class Sponsors  {
    String title;
    String imageUrl;

    public Sponsors(String title, String imageUrl) {
        this.title = title;
        this.imageUrl = imageUrl;

    }
    public Sponsors(String title, int imageUrl) {
        this.title = title;
        this.imageResource = imageUrl;

    }
    public Sponsors(String title) {
        this.title = title;

    }
    public Sponsors() {

    }
    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    int imageResource;

}
