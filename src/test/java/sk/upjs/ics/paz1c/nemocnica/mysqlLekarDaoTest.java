package sk.upjs.ics.paz1c.nemocnica;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class mysqlLekarDaoTest {
    
    LekarDAO lekarDao = DaoFactory.INSTANCE.getLekarDao();
    
    public mysqlLekarDaoTest() {
    }
    
    @Test
    public void testPridajLekara(){
        System.out.println("Pridaj lekára");
        Lekar lekar = null;
        MysqlLekarDao instance = null;
        instance.pridajLekara(lekar);
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testDajLekarov(){
        List<Lekar> lekari = lekarDao.dajLekarov();
        assertTrue(lekari.size()>0);
    }
    
    @Test
    public void testDajPodlaIdLekara(){
        System.out.println("Daj lekára podľa ID");
        Integer id = null;
        MysqlLekarDao instance = null;
        Lekar expResult = null;
        Lekar result = instance.dajPodlaIdLekara(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
     @Test
    public void testZmenLekara() {
        System.out.println("Edituj lekára");
        Lekar lekar = null;
        MysqlLekarDao instance = null;
        instance.upravLekara(lekar);
        fail("The test case is a prototype.");
    }

    @Test
    public void testVymazLekara() {
        System.out.println("Vymaž lekára");
        Integer id = null;
        MysqlLekarDao instance = null;
        instance.vymazLekara(id);
        fail("The test case is a prototype.");
    }
}
