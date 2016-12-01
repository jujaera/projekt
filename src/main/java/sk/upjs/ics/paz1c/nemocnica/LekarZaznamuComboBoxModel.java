package sk.upjs.ics.paz1c.nemocnica;

import java.util.List;
import javax.swing.DefaultComboBoxModel;

public class LekarZaznamuComboBoxModel extends DefaultComboBoxModel<Lekar> {
    
    private List<Lekar> lekari;
    private LekarDAO lekarDao = DaoFactory.INSTANCE.getLekarDao();

    public LekarZaznamuComboBoxModel() {
        lekari = lekarDao.dajLekarov();
        Lekar prazdny = new Lekar();
        prazdny.setMenoL("<<NOVÝ LEKÁR>>");
        lekari.add(0, prazdny);
    }   
    
    @Override
    public int getSize() {
        return lekari.size();
    }
    
    @Override
    public Lekar getElementAt(int index) {
        return lekari.get(index);
    }
}
