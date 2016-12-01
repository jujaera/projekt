package sk.upjs.ics.paz1c.nemocnica;

import java.util.Scanner;

public class Diagnoza {
    
    private int id;
    private String nazov;

    public Diagnoza() {
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id + " : " + nazov;
    }
    
    public String toFileLine() {
        return id + "\t" + nazov ;
    }
    
    public Diagnoza(String fileLine) {
        Scanner sc = new Scanner(fileLine);
        sc.useDelimiter("\t");
        id = sc.nextInt();
        nazov = sc.next();
    }
}
