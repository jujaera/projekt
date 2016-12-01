
package sk.upjs.ics.paz1c.nemocnica;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class mysqlLiekDaoTest {
    
    LiekDAO liekDao = DaoFactory.INSTANCE.getLiekDao();

    public mysqlLiekDaoTest() {
    }
    
    @Test
    public void testPridajLieka(){
        System.out.println("Pridaj liek");
        Liek liek= null;
        MysqlLiekDao instance = null;
        instance.pridajLiek(liek);
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testDajLieky(){
        List<Liek> lieky = liekDao.dajLieky();
        assertTrue(lieky.size()>0);
    }
    
    @Test
    public void testDajPodlaIdLiek(){
        System.out.println("Daj liek podľa ID");
        Integer id = null;
        MysqlLiekDao instance = null;
        Liek expResult = null;
        Liek result = instance.dajPodlaIdLiek(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
     @Test
    public void testZmenLiek() {
        System.out.println("Edituj liek");
        Liek liek = null;
        MysqlLiekDao instance = null;
        instance.upravLiek(liek);
        fail("The test case is a prototype.");
    }

    @Test
    public void testVymazLiek() {
        System.out.println("Vymaž liek");
        Integer id = null;
        MysqlLiekDao instance = null;
        instance.vymazLiek(id);
        fail("The test case is a prototype.");
    }
    
    
    
}
