package sk.upjs.ics.paz1c.nemocnica;

import javax.swing.AbstractListModel;

public class ZaznamListModel extends AbstractListModel<Zaznam>{
    
    private ZaznamDAO dao;
    
    public ZaznamListModel() {
        dao = DaoFactory.INSTANCE.getZaznamDao();
    }

    @Override
    public int getSize() {
        return dao.dajZaznamy().size();
    }

    @Override
    public Zaznam getElementAt(int index) {
        return dao.dajZaznamy().get(index);
    }
    
    public void pridajZaznam(Zaznam zaznam){
        int pozicia = dao.dajZaznamy().size();
        dao.pridajZaznam(zaznam);
        fireIntervalAdded(this, pozicia, pozicia);
    }
    
}
