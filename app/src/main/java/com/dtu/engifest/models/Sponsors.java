package com.dtu.engifest.models;

/**
 * Created by chhavi on 28/1/16.
 */
public class Sponsors extends Category {
//    String title;
    String imageUrl;
//    int imageResource;
    public Sponsors(String title, String imageUrl) {
        super.setName(title);
        this.imageUrl = imageUrl;

    }
    public Sponsors(String title, int imageResource) {
        super.setName(title);
        super.setImageResource(imageResource);

    }
    public Sponsors(String title) {
        super.setName(title);

    }
    public Sponsors() {

    }
    public int getImageResource() {
        return super.getImageResource();
    }

    public void setImageResource(int imageResource) {
        super.setImageResource(imageResource);
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

//    public String getTitle() {
//        return super.getName();
//    }
//
//    public void setTitle(String title) {
//        super.setName(title);
//    }


}
