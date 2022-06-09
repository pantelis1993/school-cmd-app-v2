/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.individualprojectpartb.models;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author plogothetis
 */
public class Assignment {
    
    private int asgnmnt_ID;
    private String asgnmnt_title;
    private String asgnmnt_desc;
    private LocalDate asgnmnt_subDate;
    private int asgnmnt_oralMark;
    private int asgnmnt_totalMark;
    private static int count;

    public Assignment() {
    }

    public Assignment(int asgnmnt_ID, String asgnmnt_title, String asgnmnt_desc, LocalDate asgnmnt_subDate, int asgnmnt_oralMark, int asgnmnt_totalMark) {
        this.asgnmnt_ID = asgnmnt_ID;
        this.asgnmnt_title = asgnmnt_title;
        this.asgnmnt_desc = asgnmnt_desc;
        this.asgnmnt_subDate = asgnmnt_subDate;
        this.asgnmnt_oralMark = asgnmnt_oralMark;
        this.asgnmnt_totalMark = asgnmnt_totalMark;
    }

    public Assignment(String asgnmnt_title, String asgnmnt_desc, LocalDate asgnmnt_subDate, int asgnmnt_oralMark, int asgnmnt_totalMark) {
        this.asgnmnt_title = asgnmnt_title;
        this.asgnmnt_desc = asgnmnt_desc;
        this.asgnmnt_subDate = asgnmnt_subDate;
        this.asgnmnt_oralMark = asgnmnt_oralMark;
        this.asgnmnt_totalMark = asgnmnt_totalMark;
    }

    public int getAsgnmnt_ID() {
        return asgnmnt_ID;
    }

    public void setAsgnmnt_ID(int asgnmnt_ID) {
        this.asgnmnt_ID = asgnmnt_ID;
    }

    public String getAsgnmnt_title() {
        return asgnmnt_title;
    }

    public void setAsgnmnt_title(String asgnmnt_title) {
        this.asgnmnt_title = asgnmnt_title;
    }

    public String getAsgnmnt_desc() {
        return asgnmnt_desc;
    }

    public void setAsgnmnt_desc(String asgnmnt_desc) {
        this.asgnmnt_desc = asgnmnt_desc;
    }

    public LocalDate getAsgnmnt_subDate() {
        return asgnmnt_subDate;
    }

    public void setAsgnmnt_subDate(LocalDate asgnmnt_subDate) {
        this.asgnmnt_subDate = asgnmnt_subDate;
    }

    public int getAsgnmnt_oralMark() {
        return asgnmnt_oralMark;
    }

    public void setAsgnmnt_oralMark(int asgnmnt_oralMark) {
        this.asgnmnt_oralMark = asgnmnt_oralMark;
    }

    public int getAsgnmnt_totalMark() {
        return asgnmnt_totalMark;
    }

    public void setAsgnmnt_totalMark(int asgnmnt_totalMark) {
        this.asgnmnt_totalMark = asgnmnt_totalMark;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.asgnmnt_title);
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
        final Assignment other = (Assignment) obj;
        return Objects.equals(this.asgnmnt_title, other.asgnmnt_title);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(++count).append("-");
        sb.append("Assignment title is: ").append(asgnmnt_title);
        sb.append(", assignment description is: ").append(asgnmnt_desc);
        sb.append(", assignment submission date is: ").append(asgnmnt_subDate);
        sb.append(", assignment oral mark is: ").append(asgnmnt_oralMark);
        sb.append(", assignment total mark is: ").append(asgnmnt_totalMark).append("\n");
        
        return sb.toString();
    }

    
    
}
