package com.example;
import javax.persistence.Entity;
// import javax.persistence.Temporal;
// import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class Artikel {

    @javax.persistence.Id
    private int nr;
    private String name;
    private String text;
    private String bild;
    // @Temporal(TemporalType.DATE)
    // private Date verfuegbarAb;
    private String testField;

    public Artikel() {
    }

    public String getTestField() {
        return testField;
    }

    public void setTestField(String testField) {
        this.testField = testField;
    }

    public Artikel(int nr, String name, String text, String bild) {
        this(nr, name, text, bild, new Date(0));
    }

    public Artikel(int nr, String name, String text, String bild, Date verfuegbarAb) {
        this.nr = nr;
        this.name = name;
        this.text = text;
        this.bild = bild;
        // this.verfuegbarAb = verfuegbarAb;
        this.testField = "foo";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public int getNr() {
        return nr;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getBild() {
        return bild;
    }

    public void setBild(String bild) {
        this.bild = bild;
    }

    // public Date getVerfuegbarAb() {
    //     return verfuegbarAb;
    // }

    // public void setVerfuegbarAb(Date verfuegbarAb) {
    //     this.verfuegbarAb = verfuegbarAb;
    // }

}
