package sk.upjs.ics.paz1c.nemocnica;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class MysqlZaznamDao implements ZaznamDAO {

    public MysqlZaznamDao(JdbcTemplate jdbcTemplate) {
    }

    @Override
    public List<Zaznam> dajZaznamy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Zaznam najdiPodlaIdZaznam(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void vymazZaznam(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pridajZaznam(Zaznam zaznam) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void upravZoznam(Zaznam zaznam) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ulozZaznam(Zaznam zaznam) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
