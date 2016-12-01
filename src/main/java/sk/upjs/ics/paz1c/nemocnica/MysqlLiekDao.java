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
public class MysqlLiekDao implements LiekDAO {
    
    private JdbcTemplate jdbcTemplate;

    public MysqlLiekDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Liek> dajLieky() {
        String sql = "SELECT idL, nazov FROM liek";
        BeanPropertyRowMapper<Liek> rowMapper = new BeanPropertyRowMapper<>(Liek.class);
        return jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public void pridajLiek(Liek liek) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Liek dajPodlaIdLiek(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void vymazLiek(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void upravLiek(Liek liek) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
