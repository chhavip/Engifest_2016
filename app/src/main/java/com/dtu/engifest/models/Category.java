package com.dtu.engifest.models;

import com.orm.SugarRecord;

/**
 * Created by chhavi on 26/1/16.
 */
public class Category extends SugarRecord {

    String name;

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
