package com.example.myapplicationhards;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "hards")
public class HardSkill {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo( name = "hardSkillId" )
    private int id;

    @NonNull
    @ColumnInfo( name = "hardSkillIdCreationDate" )
    private String creationDate;

    @NonNull
    @ColumnInfo( name = "hardSkillIdName" )
    private String name;

    @NonNull
    @ColumnInfo( name = "hardSkillIdProvelt" )
    private String provelt;

    @NonNull
    @ColumnInfo( name = "hardSkillIdValue" )
    private double value;

    public HardSkill (String creationDate, String name, String provelt, double value) {
        this.creationDate = creationDate;
        this.name = name;
        this.provelt = provelt;
        this.valeu = value;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getCreationDate() {
        return this.creationDate;
    }
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getProvelt() {
        return this.provelt;
    }
    public void setprovelt(String provelt) {
        this.provelt = provelt;
    }

    public double getValue() {
        return this.value;
    }
    public void setValue(double value) {
        this.value = value;
    }







}





}
