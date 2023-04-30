package com.example.projet_finale;

public class Note {
    private String type;
    private Double note;
    private double moyenne;

    public Note(String type, Double note,Double moyenne) {
        this.type = type;
        this.note = note;
        this.moyenne =moyenne;
    }

    public Double getNote() {
        return note;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public String getType() {
        return type;
    }
}