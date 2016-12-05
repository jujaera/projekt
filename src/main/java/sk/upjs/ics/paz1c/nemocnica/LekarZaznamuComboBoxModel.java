package sk.upjs.ics.paz1c.nemocnica;

import java.util.List;
import javax.swing.DefaultComboBoxModel;

public class LekarZaznamuComboBoxModel extends DefaultComboBoxModel<Lekar> {
  
    private LekarDAO lekarDao = DaoFactory.INSTANCE.getLekarDao();

    public LekarZaznamuComboBoxModel() {
        List<Lekar> lekari = lekarDao.dajLekarov();
        
        for(Lekar l: lekari){
            this.addElement(l);
        }
    }   
    
    
}
