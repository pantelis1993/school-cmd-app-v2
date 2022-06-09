/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.individualprojectpartb.models;

/**
 *
 * @author plogothetis
 */
public class Trainer {
    
    private int trainer_ID;
    private String trainer_firstName;
    private String trainer_lastName;
    private String trainer_subject;
    private static int count;
    
    public Trainer() {
    }

    public Trainer(int trainer_ID, String trainer_firstName, String trainer_lastName, String trainer_subject) {
        this.trainer_ID = trainer_ID;
        this.trainer_firstName = trainer_firstName;
        this.trainer_lastName = trainer_lastName;
        this.trainer_subject = trainer_subject;
    }

    public Trainer(String trainer_firstName, String trainer_lastName, String trainer_subject) {
        this.trainer_firstName = trainer_firstName;
        this.trainer_lastName = trainer_lastName;
        this.trainer_subject = trainer_subject;
    }

    public int getTrainer_ID() {
        return trainer_ID;
    }

    public void setTrainer_ID(int trainer_ID) {
        this.trainer_ID = trainer_ID;
    }

    public String getTrainer_firstName() {
        return trainer_firstName;
    }

    public void setTrainer_firstName(String trainer_firstName) {
        this.trainer_firstName = trainer_firstName;
    }

    public String getTrainer_lastName() {
        return trainer_lastName;
    }

    public void setTrainer_lastName(String trainer_lastName) {
        this.trainer_lastName = trainer_lastName;
    }

    public String getTrainer_subject() {
        return trainer_subject;
    }

    public void setTrainer_subject(String trainer_subject) {
        this.trainer_subject = trainer_subject;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.trainer_ID;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Trainer other = (Trainer) obj;
        return this.trainer_ID == other.trainer_ID;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(++count).append("-");
        sb.append("Trainer first name is:  ").append(trainer_firstName);
        sb.append(", trainer last name is: ").append(trainer_lastName);
        sb.append(", trainer subject is: ").append(trainer_subject).append("\n");
        
        return sb.toString();
    }
    
    
}
