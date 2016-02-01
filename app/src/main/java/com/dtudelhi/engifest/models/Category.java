package com.dtudelhi.engifest.models;

import com.orm.SugarRecord;

/**
 * Created by chhavi on 26/1/16.
 */
public class Category extends SugarRecord {

    String name;

    public Category(String name, int imageResource) {
        this.name = name;
        this.imageResource = imageResource;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    int imageResource;
    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
