package sk.upjs.ics.paz1c.nemocnica;

import java.util.Scanner;

public class Liek {
   
    private int id;
    private String nazov;

    public Liek() {
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
        return id + "\t" + nazov;
    }
    
    public Liek(String fileLine) {
        Scanner sc = new Scanner(fileLine);
        sc.useDelimiter("\t");
        id = sc.nextInt();
        nazov = sc.next();
    }
}
