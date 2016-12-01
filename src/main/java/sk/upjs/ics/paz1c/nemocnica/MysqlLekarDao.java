package sk.upjs.ics.paz1c.nemocnica;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class MysqlLekarDao implements LekarDAO {

    private JdbcTemplate jdbcTemplate;
    
    public MysqlLekarDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Lekar> dajLekarov() {
        String sql = "SELECT idL, menoL, priezviskoL, specializacia FROM lekar";
        BeanPropertyRowMapper<Lekar> rowMapper = new BeanPropertyRowMapper<>(Lekar.class); //lekar parameter
        return jdbcTemplate.query(sql, rowMapper);
        //pre kažždý riadok tabulky vyrobi jedneho lekara, KAZDY RIADOK JE JEDEN OBJEKT
    }

    @Override
    public void pridajLekara(Lekar lekar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Lekar dajPodlaIdLekara(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void vymazLekara(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void upravLekara(Lekar lekar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
