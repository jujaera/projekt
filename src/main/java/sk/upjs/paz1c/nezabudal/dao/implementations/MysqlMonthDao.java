/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.paz1c.nezabudal.dao.implementations;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import sk.upjs.paz1c.nezabudal.dao.MonthDao;
import sk.upjs.paz1c.nezabudal.dao.rowmappers.CategoryRowMapper;
import sk.upjs.paz1c.nezabudal.dao.rowmappers.MonthRowMapper;
import sk.upjs.paz1c.nezabudal.entity.Month;
import sk.upjs.paz1c.nezabudal.other.ObjectFactory;

/**
 *
 * @author erika
 */
public class MysqlMonthDao implements MonthDao{

    JdbcTemplate jdbcTemplate = ObjectFactory.INSTANCE.getJdbcTemplate();
    
    @Override
    public List<Month> getMonth() {
        String sql = "SELECT id as month_id, title as month_title from month;";
        return jdbcTemplate.query(sql, new MonthRowMapper());
    }

    @Override
    public Month getById(Long id) {
        String sql = "SELECT id as month_id, title as month_title from category where id = ?";

        List<Month> list = jdbcTemplate.query(sql, new MonthRowMapper(), id);
        if (list.size() > 0) {
            return list.get(0);
        } else 
            return null;
    }

    @Override
    public void delete(Month month) {
        if (month == null) {
            return;
        }
        String sql = "DELETE FROM month WHERE id = ?";
        jdbcTemplate.update(sql, month.getId());
    }
    
}
