package sk.upjs.ics.paz1c.nemocnica;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class mysqlPacientDaoTest {
       
    PacientDAO pacientDao = DaoFactory.INSTANCE.getPacientDao();
   
    public mysqlPacientDaoTest() {
    }
    
    @Test
    public void testPridajPacienta(){
        System.out.println("Pridaj pacienta");
        Pacient pacient= null;
        MysqlPacientDao instance = null;
        instance.pridajPacienta(pacient);
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testDajPacientov(){
        List<Pacient> pacienti = pacientDao.dajPacietov();
        assertTrue(pacienti.size()>0);
    }
    
    @Test
    public void testDajPodlaIdPacienta(){
        System.out.println("Daj pacienta podľa ID");
        Integer id = null;
        MysqlPacientDao instance = null;
        Pacient expResult = null;
        Pacient result = instance.dajPodlaIdPacienta(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
     @Test
    public void testZmenPacienta() {
        System.out.println("Edituj pacienta");
        Pacient pacient = null;
        MysqlPacientDao instance = null;
        instance.upravPacienta(pacient);
        fail("The test case is a prototype.");
    }

    @Test
    public void testVymazPacienta() {
        System.out.println("Vymaž pacienta");
        Integer id = null;
        MysqlPacientDao instance = null;
        instance.vymazPacienta(id);
        fail("The test case is a prototype.");
    }
    
}
