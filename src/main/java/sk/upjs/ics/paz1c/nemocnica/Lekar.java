package sk.upjs.ics.paz1c.nemocnica;

import java.util.Scanner;

public class Lekar {
    
    private int id;
    private String menoL;
    private String priezviskoL;
    private String specializacia;

    public Lekar() {
    }

    public String getMenoL() {
        return menoL;
    }

    public void setMenoL(String menoL) {
        this.menoL = menoL;
    }

    public String getPriezviskoL() {
        return priezviskoL;
    }

    public void setPriezviskoL(String priezviskoL) {
        this.priezviskoL = priezviskoL;
    }

    public String getSpecializacia() {
        return specializacia;
    }

    public void setSpecializacia(String specializacia) {
        this.specializacia = specializacia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

        
    @Override
    public String toString() {
        return id + " : " + menoL + " " + priezviskoL + ", " + specializacia;
    }
    
    public String toFileLine() {
        return id + "\t" + menoL + "\t" + priezviskoL + "\t" + specializacia;
    }
    
    public Lekar(String fileLine) {
        Scanner sc = new Scanner(fileLine);
        sc.useDelimiter("\t");
        id = sc.nextInt();
        menoL = sc.next();
        priezviskoL = sc.next();
        specializacia = sc.next();
    }
}
