package com.dtu.engifest.models;

import com.orm.SugarRecord;

import java.util.ArrayList;

/**
 * Created by chhavi on 26/1/16.
 */
public class Events extends SugarRecord {
    String category;
    Sponsors sponsor;
    String name;
    String venue;
    String information;
    String date;
    String time;
    String fees;
    String rules;
    String contacts;
    String registerLink;
    boolean specialRequirements;

    public boolean isComingSoon() {
        return comingSoon;
    }

    public void setComingSoon(boolean comingSoon) {
        this.comingSoon = comingSoon;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    boolean comingSoon;
    String imageUrl;

    public Events() {
    }

    public Events(String category, String name, String venue, String information, String date, String time, String fees, String rules, String contacts, String registerLink, boolean specialRequirements) {
        this.category = category;
        Sponsors sponsorsa = new Sponsors(category);
        this.sponsor = sponsorsa;
        this.name = name;
        this.venue = venue;
        this.information = information;
        this.date = date;
        this.time = time;
        this.fees = fees;
        this.rules = rules;
        this.contacts = contacts;
        this.registerLink = registerLink;
        this.specialRequirements = specialRequirements;


    }
    public Events(String category, String name, String venue, String information, String date, String time, String fees,String rules, String contacts, String registerLink, boolean specialRequirements, String imageUrl) {
        this.category = category;
        this.name = name;
        this.venue = venue;
        this.information = information;
        this.date = date;
        this.time = time;
        this.fees = fees;
        this.rules = rules;
        this.contacts = contacts;
        this.registerLink = registerLink;
        this.specialRequirements = specialRequirements;
        this.imageUrl = imageUrl;

    }
 /*   public Events(String category, String name, String venue, String information, String date, String time, String fees, ArrayList<String> rules, ArrayList<Contact> contacts, String registerLink, boolean specialRequirements) {
        this.category = category;
        this.name = name;
        this.venue = venue;
        this.information = information;
        this.date = date;
        this.time = time;
        this.fees = fees;
        this.rules = rules;
        this.contacts = contacts;
        this.registerLink = registerLink;
        this.specialRequirements = specialRequirements;

    }*/
    public Events(String category, String name, boolean comingSoon) {
        this.category = category;
        this.name = name;
        this.comingSoon = comingSoon;


    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getRegisterLink() {
        return registerLink;
    }

    public void setRegisterLink(String registerLink) {
        this.registerLink = registerLink;
    }

    public boolean isSpecialRequirements() {
        return specialRequirements;
    }

    public void setSpecialRequirements(boolean specialRequirements) {
        this.specialRequirements = specialRequirements;
    }
}
