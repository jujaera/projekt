package sk.upjs.ics.paz1c.nemocnica;

import java.util.Scanner;

public class Pacient {
    
    private int id;
    private String menoP;
    private String priezviskoP;
    private int vek;

    public Pacient() {
    }
    
    public String getMenoP() {
        return menoP;
    }

    public void setMenoP(String menoP) {
        this.menoP = menoP;
    }

    public String getPriezviskoP() {
        return priezviskoP;
    }

    public void setPriezviskoP(String priezviskoP) {
        this.priezviskoP = priezviskoP;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    @Override
    public String toString() {
        return id + " : " + menoP + " " + priezviskoP + ", " + vek;
    }
    
    public String toFileLine() {
        return id + "\t" + menoP + "\t" + priezviskoP + "\t" + vek; 
    } 
    
    public Pacient(String fileLine) {
        Scanner sc = new Scanner(fileLine);
        sc.useDelimiter("\t");
        id = sc.nextInt();
        menoP = sc.next();
        priezviskoP = sc.next();
        vek = sc.nextInt();
    }
}
