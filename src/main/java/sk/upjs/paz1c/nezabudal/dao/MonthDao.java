/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.paz1c.nezabudal.dao;

import java.util.List;
import sk.upjs.paz1c.nezabudal.entity.Month;

/**
 *
 * @author erika
 */
public interface MonthDao {
    
   public List<Month> getMonth();
    
    public Month getById(Long id);
    
    public void delete(Month month);
}
