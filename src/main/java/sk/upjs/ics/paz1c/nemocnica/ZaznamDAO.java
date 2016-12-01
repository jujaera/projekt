package sk.upjs.ics.paz1c.nemocnica;

import sk.upjs.ics.paz1c.nemocnica.Zaznam;
import java.util.List;

public interface ZaznamDAO {

    List<Zaznam> dajZaznamy();
    
    Zaznam najdiPodlaIdZaznam(int id);
    
    void vymazZaznam(int id);
    
    void pridajZaznam(Zaznam zaznam);
    
    void upravZoznam(Zaznam zaznam);
    
}
