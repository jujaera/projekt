/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.paz1c.nezabudal.dao.implementations;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sk.upjs.paz1c.nezabudal.entity.Category;
import sk.upjs.paz1c.nezabudal.entity.Month;

/**
 *
 * @author erika
 */
public class MysqlMonthDaoTest {
    
    private MysqlMonthDao instance = new MysqlMonthDao();
    
    @Test
    public void testGetMonth() {
        System.out.println("getCategories");

        List<Month> result = instance.getMonth();

        assertNotEquals(null, result);
    }
 
    @Test
    public void testDelete() {
        System.out.println("delete");

        List<Month> beforeUpdate = instance.getMonth();

        Month month = instance.getById(4L);
        instance.delete(month);

        List<Month> afterUpdate = instance.getMonth();

        assertEquals(beforeUpdate.size(), afterUpdate.size());
    }
    
    @Test
    public void testGetById() {
        System.out.println("getById");
        List<Month> months = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            Month month = instance.getById(new Long(i));
            if (month != null) {
                months.add(month);
            }

        }
        System.out.println(months);
        assertTrue(months.size() > 0);
    }
}
