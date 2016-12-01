package sk.upjs.ics.paz1c.nemocnica;

import java.util.List;
import javax.swing.DefaultComboBoxModel;

public class DiagnozaZaznamuComboBoxModel extends DefaultComboBoxModel<Diagnoza>{
    
    private List<Diagnoza> diagnozy;
    private DiagnozaDAO diagnozaDao = DaoFactory.INSTANCE.getDiagnozaDao();

    public DiagnozaZaznamuComboBoxModel() {
        diagnozy = diagnozaDao.dajDiagnozy();
        Diagnoza prazdna = new Diagnoza();
        prazdna.setNazov("<<NOVÁ DIAGNÓZA>>");
        diagnozy.add(0, prazdna);
    }
    
    @Override
    public int getSize() {
        return diagnozy.size();
    }

    @Override
    public Diagnoza getElementAt(int index) {
        return diagnozy.get(index);
    }
    
}
