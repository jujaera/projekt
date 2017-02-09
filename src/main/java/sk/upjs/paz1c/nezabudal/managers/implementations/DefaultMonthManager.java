/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.paz1c.nezabudal.managers.implementations;

import java.util.List;
import sk.upjs.paz1c.nezabudal.dao.CategoryDao;
import sk.upjs.paz1c.nezabudal.dao.MonthDao;
import sk.upjs.paz1c.nezabudal.entity.Attribute;
import sk.upjs.paz1c.nezabudal.entity.Category;
import sk.upjs.paz1c.nezabudal.entity.Month;
import sk.upjs.paz1c.nezabudal.managers.AttributeManager;
import sk.upjs.paz1c.nezabudal.managers.CategoryManager;
import sk.upjs.paz1c.nezabudal.managers.MonthManager;
import sk.upjs.paz1c.nezabudal.other.ObjectFactory;

/**
 *
 * @author erika
 */
public class DefaultMonthManager implements MonthManager{
    
    MonthDao monthDao = ObjectFactory.INSTANCE.getMonthDao();

    @Override
    public List<Month> getMonth() {
        return monthDao.getMonth();
    }

    @Override
    public void delete(Month month) {
        monthDao.delete(month);
    }

    @Override
    public Month getById(Long id) {
        return monthDao.getById(id);
    }
}
