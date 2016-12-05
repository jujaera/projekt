package sk.upjs.ics.paz1c.nemocnica;

import sk.upjs.ics.paz1c.nemocnica.Liek;
import java.util.List;

public interface LiekDAO {
    
    List<Liek> dajLieky();   
    
    void pridajLiek(Liek liek);
    
    Liek dajPodlaIdLiek(int id);
    
    void vymazLiek(int id);
    
    void upravLiek(Liek liek);
    
    public void ulozLiek(Liek liek);
}
