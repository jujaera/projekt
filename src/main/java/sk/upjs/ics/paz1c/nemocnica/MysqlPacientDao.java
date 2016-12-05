package sk.upjs.ics.paz1c.nemocnica;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


public class MysqlPacientDao implements PacientDAO {
    
    private JdbcTemplate jdbcTemplate;

    public MysqlPacientDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Pacient> dajPacietov() {
       String sql = "SELECT idP, menoP, priezviskoP, vek FROM pacient";
        BeanPropertyRowMapper<Pacient> rowMapper = new BeanPropertyRowMapper<>(Pacient.class);
        return jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public void pridajPacienta(Pacient pacient) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pacient dajPodlaIdPacienta(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void vymazPacienta(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void upravPacienta(Pacient pacient) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ulozPacienta(Pacient pacient) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
