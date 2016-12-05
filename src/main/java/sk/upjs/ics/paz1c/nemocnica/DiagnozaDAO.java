package sk.upjs.ics.paz1c.nemocnica;

import sk.upjs.ics.paz1c.nemocnica.Diagnoza;
import java.util.List;

public interface DiagnozaDAO {
    
    List<Diagnoza> dajDiagnozy();
    
    void pridajDiagnozu(Diagnoza diagnoza);
    
    Diagnoza dajPodlaIdDiagnozu(int id);
    
    void upravDiagnozu(Diagnoza diagnoza);
    
    void vymazDiagnozu(int id);

    public void ulozDiagnozu(Diagnoza diagnoza);
}
