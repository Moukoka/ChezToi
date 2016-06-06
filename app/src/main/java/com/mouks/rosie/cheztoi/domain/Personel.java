package com.mouks.rosie.cheztoi.domain;

import com.google.android.gms.plus.model.people.Person;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Rosie on 2016/05/29.
 */
public class Personel implements Serializable {
    private Long id;
    private String name;
    private String surname;
    private Date dob;

    public Personel() {
    }

    public Personel(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.dob = builder.dob;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getDate() {
        return dob;
    }

    public static class Builder{
        private Long id;
        private String name;
        private String surname;
        private Date dob;

        public Builder id(Long value){
            this.id = value;
            return this;
        }

        public Builder name(String value){
            this.name = value;
            return this;
        }

        public Builder surname(String value){
            this.surname = value;
            return this;
        }

        public Builder date(Date value){
            this.dob = value;
            return this;
        }

        public Builder copy(Personel val) {
            this.id = val.id;
            this.name = val.name;
            this.surname = val.surname;
            this.dob = val.dob;
            return this;
        }

        public Personel build(){
            return new Personel(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Personel personel = (Personel) o;

        return id.equals(personel.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
