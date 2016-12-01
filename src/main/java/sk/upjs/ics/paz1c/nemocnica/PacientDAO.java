package sk.upjs.ics.paz1c.nemocnica;

import sk.upjs.ics.paz1c.nemocnica.Pacient;
import java.util.List;

public interface PacientDAO {
 
    List<Pacient> dajPacietov();
    
    void pridajPacienta(Pacient pacient);
    
    Pacient dajPodlaIdPacienta(int id);
    
    void vymazPacienta(int id);
    
    void upravPacienta(Pacient pacient);
    
}
