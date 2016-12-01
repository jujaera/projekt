package sk.upjs.ics.paz1c.nemocnica;

import sk.upjs.ics.paz1c.nemocnica.Lekar;
import java.util.List;

public interface LekarDAO {
    
    List<Lekar> dajLekarov();
    
    void pridajLekara(Lekar lekar);
    
    Lekar dajPodlaIdLekara(int id);   
    
    void vymazLekara(int id);
    
    void upravLekara(Lekar lekar);
    
}
