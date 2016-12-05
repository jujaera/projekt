/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.paz1c.nemocnica;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Judita
 */
public class MysqlDiagnozaDao implements DiagnozaDAO {

    private JdbcTemplate jdbcTemplate;
    
    public MysqlDiagnozaDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Diagnoza> dajDiagnozy() {
        String sql = "SELECT idD, nazovD, zavaznost FROM diagnoza";
        BeanPropertyRowMapper<Diagnoza> rowMapper = new BeanPropertyRowMapper<>(Diagnoza.class);
        return jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public void pridajDiagnozu(Diagnoza diagnoza) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Diagnoza dajPodlaIdDiagnozu(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void upravDiagnozu(Diagnoza diagnoza) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void vymazDiagnozu(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ulozDiagnozu(Diagnoza diagnoza) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
