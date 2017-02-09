/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.paz1c.nezabudal.dao.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import sk.upjs.paz1c.nezabudal.entity.Category;
import sk.upjs.paz1c.nezabudal.entity.Month;

/**
 *
 * @author erika
 */
public class MonthRowMapper implements RowMapper<Month>{

    @Override
    public Month mapRow(ResultSet rs, int i) throws SQLException {
        Month month = new Month();
        
        month.setId(rs.getLong("month_id"));
        month.setTitle(rs.getString("month_title"));
        
        return month;
    }
    
}
